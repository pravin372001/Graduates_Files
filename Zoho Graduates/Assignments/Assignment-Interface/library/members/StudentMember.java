package library.members;

public class StudentMember implements Member {
    private String name;
    private String memberId;
    private String studentId;

    public StudentMember(String name, String memberId, String studentId) {
        this.name = name;
        this.memberId = memberId;
        this.studentId = studentId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getMemberId() {
        return memberId;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return name + " (ID: " + memberId + ", Student ID: " + studentId + ")";
    }
}
