public class EmployeeDTO {

    private String name;
    private String address;
    private String contact;
    private String email;
    private String gender;
    private String department;
    private String position;
    private static int employeeCount = 0;

    public EmployeeDTO(String name, String address, String contact, String email, String gender, String department,
            String position) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.email = email;
        this.gender = gender;
        this.department = department;
        this.position = position;
        employeeCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static void setEmployeeCount(int employeeCount) {
        EmployeeDTO.employeeCount = employeeCount;
    }

}
