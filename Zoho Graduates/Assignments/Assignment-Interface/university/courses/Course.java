// university/courses/Course.java
package university.courses;

public class Course {
    private String courseName;
    private int courseId;

    public Course(String courseName, int courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
    }

    // Getters and setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
