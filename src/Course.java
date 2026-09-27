public class Course {

    String name;
    int course_number;
    int credit;
    private String Classroom;

    //Method signature; REMEMBER Access_modifier Return_Type, Method_name, Param_type, Param_name) {}

    Course() {
        name = "";
        course_number = 0;
        credit = 0;
    }

    Course(int course_number, int credit, String name) {
        this.course_number = course_number;
        this.credit = credit;
        this.name = name;
    }

        //Setters and getters public void Set_Classroom (String classroom) {
        public String getName() {
            return name;
        }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse_number() {
        return course_number;
    }

    public void setCourse_number(int course_number) {
        this.course_number = course_number;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void Set_Classroom(String Classroom) {
        this.Classroom = Classroom;
    }

    public String get_Classroom() {
        return this.Classroom;
    }

        public void display_Course_infromation() {
            System.out.println("Course name: " + this.name + "Course number: " + this.course_number);
    }

}
