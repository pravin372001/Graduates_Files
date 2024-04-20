public class PlayerDTO {
    private String name;
    private String position;
    private int jeseryNumber;

    public PlayerDTO(String name, String position, int jeseryNumber) {
        this.name = name;
        this.position = position;
        this.jeseryNumber = jeseryNumber;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getJeseryNumber() {
        return jeseryNumber;
    }

    public void setJeseryNumber(int jeseryNumber) {
        this.jeseryNumber = jeseryNumber;
    }

    
}
