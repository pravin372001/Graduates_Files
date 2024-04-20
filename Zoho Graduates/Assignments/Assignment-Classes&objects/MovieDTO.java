public class MovieDTO {
    private String name;
    private String description;
    private String director;
    private String[] cast;
    private Double budget;
    private String rating;

    public MovieDTO(String name, String description, String director, String[] cast, Double budget, String rating) {
        this.name = name;
        this.description = description;
        this.director = director;
        this.cast = cast;
        this.budget = budget;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String[] getCast() {
        return cast;
    }

    public void setCast(String[] cast) {
        this.cast = cast;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

}
