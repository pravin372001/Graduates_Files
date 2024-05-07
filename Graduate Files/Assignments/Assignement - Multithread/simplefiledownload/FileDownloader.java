import java.util.Scanner;

public class FileDownloader {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Downloader downloader = new Downloader();
		System.out.println("Thread Assignment\n");
		exit: while (true) {
			System.out.println("1) Download File \n2) Stop Download \n3) Exit");
			String option = in.next();
			switch (option) {
			case "1":
				System.out.print("Enter the URL :- ");
				String url = in.next();
				System.out.print("Enter the File Name with Extension :-");
				String fileName = in.next();
				downloader.setFileUrl(url);
				downloader.setFileName(fileName);
				downloader.start();
				break;
			case "2":
				downloader.setStopDownload(true);
				return;
			case "3":
				break exit;
			default:
				System.err.println("Choose Valid Option..!");
				break;
			}
		}
	}
}
