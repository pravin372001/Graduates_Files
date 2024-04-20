package movie;

class ComedyMovie extends Movie {
    private String mainActor;

    public ComedyMovie(String title, double price, String mainActor) {
        super(title, price);
        this.mainActor = mainActor;
    }

    @Override
    public String getDescription() {
        return getTitle() + " - Starring: " + mainActor;
    }

    @Override
    public int getDuration() {
        return 120;
    }

    @Override
    public String getGenre() {
        return "Comedy";
    }
}