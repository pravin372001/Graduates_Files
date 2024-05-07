import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;

import javax.net.ssl.HttpsURLConnection;

public class Downloader extends Thread {

	private String fileUrl;
	private String fileName;
	private URI uri;
	private HttpsURLConnection httpsUrlConnection;
	private boolean stopDownload;

	public void getConnection() {
		try {
			uri = new URI(getFileUrl());
			httpsUrlConnection = (HttpsURLConnection) uri.toURL().openConnection();
			if (httpsUrlConnection.getResponseCode() == 200) {
				System.out.println("Connected Successfully..!");
				download();
			} else {
				System.err.println("Connection Failed..! Try Again");
			}
		} catch (Exception e) {
			System.err.println("Unexpected Error Occured..! Try Again");
		}
	}

	public void download() {
		File file = new File(getFileName());
		try (InputStream inputStream = httpsUrlConnection.getInputStream();
				BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
				FileOutputStream fileOutputStream = new FileOutputStream(file);) {
			System.err.println("Download Started..!");
			int size = httpsUrlConnection.getContentLength();
			byte bytes[] = new byte[1024];
			int bytesRead;
			int totalBytesRead = 0;
			while ((bytesRead = bufferedInputStream.read(bytes)) != -1 && !isStopDownload()) {
				fileOutputStream.write(bytes, 0, bytesRead);
				totalBytesRead += bytesRead;
				int percentDownloaded = (int) ((totalBytesRead * 100.0) / size);
				System.out.print("\rDownloading: " + percentDownloaded + "%");
			}
			System.out.println();

			if (isStopDownload()) {
				if (file.exists()) {
					fileOutputStream.close();
					file.delete();
					System.err.println("Download was Cancelled");
					return;
				}
			}
			if (!isStopDownload()) {
				System.err.println("Download Finished..!");
				return;
			}
		} catch (Exception e) {
			System.err.println("Unexpected Error Occured..! Try Again");
		} finally {
			try {
				if (httpsUrlConnection != null) {
					httpsUrlConnection.disconnect();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		getConnection();
	}

	public boolean isStopDownload() {
		return stopDownload;
	}

	public void setStopDownload(boolean stopDownload) {
		this.stopDownload = stopDownload;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}