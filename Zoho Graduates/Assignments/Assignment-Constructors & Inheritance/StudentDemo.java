class Student {

    private String name;
    private int rollno;
    private String address;

    public Student(String name, int rollno, String address) {
        this.name = name;
        this.rollno = rollno;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public String getAddress() {
        return address;
    }

}

class ZSGSStudent extends Student {
    private boolean isStipended;
    private boolean isFreeFood;
    private boolean isFreeCab;

    public ZSGSStudent(String name, int rollno, String address, boolean isStipended, boolean isFreeFood,
            boolean isFreeCab) {
        super(name, rollno, address);
        this.isStipended = isStipended;
        this.isFreeFood = isFreeFood;
        this.isFreeCab = isFreeCab;
    }

    public String toString() {
        return "Student [name=" + getName() + ", rollno=" + getRollno() + ", address=" + getAddress() + ", isStipended="
                + isStipended
                + ", isFreeFood=" + isFreeFood + ", isFreeCab=" + isFreeCab + "]"; 
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        Student zs = new ZSGSStudent("Pravin", 1, "Srivilliputhur", true, true, true);
        System.out.println(zs);
    }
}
