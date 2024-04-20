package library.members;

public class RegularMember implements Member {
    private String name;
    private String memberId;

    public RegularMember(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getMemberId() {
        return memberId;
    }

    @Override
    public String toString() {
        return name + " (ID: " + memberId + ")";
    }
}
