public class Student extends BSU_Member {

    double gpa;
    Course [] enrolled_courses;

    Student() {
        this.gpa = 0;
        this.enrolled_courses = new Course[6];
        this.status = "Student";
    }

    public Student(int id, int age, String name, char gender, String status, double gpa, Course[] enrolled_courses) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.status = status;
        this.gpa = gpa;
        this.enrolled_courses = enrolled_courses;
    }

    //Lab work: Create getter method for enrolled_courses attributes
    public Course[] get_enrolled_courses() {
        return this.enrolled_courses;
    }

    public void set_enrolled_courses(Course[] enrolled_courses) {
        this.enrolled_courses = enrolled_courses;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void display_Information() {
        System.out.println("Name: " + this.name + ", Status: " + status + ", GPA: " + gpa);
    }
}
