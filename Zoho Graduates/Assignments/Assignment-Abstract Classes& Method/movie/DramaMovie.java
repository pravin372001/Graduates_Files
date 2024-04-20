package movie;

class DramaMovie extends Movie {
    private String writer;

    public DramaMovie(String title, double price, String writer) {
        super(title, price);
        this.writer = writer;
    }

    @Override
    public String getDescription() {
        return getTitle() + " - Written by: " + writer;
    }

    @Override
    public int getDuration() {
        return 180;
    }

    @Override
    public String getGenre() {
        return "Drama";
    }
}