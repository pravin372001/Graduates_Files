// university/faculty/NonTeachingFaculty.java
package university.faculty;

public class NonTeachingFaculty implements Faculty {
    private String name;
    private String facultyId;

    public NonTeachingFaculty(String name, String facultyId) {
        this.name = name;
        this.facultyId = facultyId;
    }

    @Override
    public void displayDetails() {
        System.out.println("Non-Teaching Faculty Name: " + name);
        System.out.println("Faculty ID: " + facultyId);
    }
}
