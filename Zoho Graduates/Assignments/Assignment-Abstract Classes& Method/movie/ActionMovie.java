package movie;

class ActionMovie extends Movie {
    private String director;

    public ActionMovie(String title, double price, String director) {
        super(title, price);
        this.director = director;
    }

    @Override
    public String getDescription() {
        return getTitle() + " - Directed by: " + director;
    }

    @Override
    public int getDuration() {
        return 150;
    }

    @Override
    public String getGenre() {
        return "Action";
    }
}
