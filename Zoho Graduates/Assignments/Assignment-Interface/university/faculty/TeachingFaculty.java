package university.faculty;

public class TeachingFaculty implements Faculty {
    private String name;
    private String facultyId;

    public TeachingFaculty(String name, String facultyId) {
        this.name = name;
        this.facultyId = facultyId;
    }

    @Override
    public void displayDetails() {
        System.out.println("Teaching Faculty Name: " + name);
        System.out.println("Faculty ID: " + facultyId);
    }
}
