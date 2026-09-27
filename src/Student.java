public class Student extends BSU_Member {

    double gpa;

    Course [] enrolled_courses;

    Student() {
        this.gpa = 0;
        this.enrolled_courses = new Course[6];
        this.status = "Student";
    }


    //Lab work: Create getter method for enrolled_courses attributes
    public Course[] get_enrolled_courses() {
        return this.enrolled_courses;

    }

    public void display_Information() {
        System.out.println("Status: " + status);
    }
}
