public class Instructor extends BSU_Member {
    String Department;

    Instructor() {
        this.Department = "CS";
        this.status = "Faculty";
    }
    public Instructor(int id, int age, String name, char gender, String status, String department) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.status = status;
        this.Department = department;
    }
    //Task: create a display method that will print the Department and status
    @Override
    public void display_Information() {
        System.out.println("Department: " + this.Department + "Faculty: " + this.status);

    }
}
