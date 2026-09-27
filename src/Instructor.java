public class Instructor extends BSU_Member {
    String Department;

    Instructor() {
        this.Department = "CS";
        this.status = "Faculty";
    }

    //Task: create a display method that will print the Department and status
    @Override
    public void display_Information() {
        System.out.println("Department: " + this.Department + "Faculty: " + this.status);

    }
}
