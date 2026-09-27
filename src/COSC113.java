public class COSC113 extends Course{
    // Public, Default, protect attributes are inherited,
    //Not inherited,

    String syllabus;

    String coding_language;

    Instructor i1;

    Student[] students;


    //This is called a constructor
    COSC113() {
        this.syllabus = "Java";
        this.coding_language = "Java";
        this.i1 = null;
        this.students = null;
        this.course_number = 113;
        this.credit = 4;
        this.name = "COSC113";
    }

    //Parent class Constructors are not inherited, but can be invoked/called

    //Overloaded Constructor
    COSC113(int course_number, int credit, String name) {
        //Super() will invoke the parent classes default constructor - course() (must be first in constructor)
//        super();
        super(course_number, credit, name);
        this.syllabus = "Java";
        this.coding_language = "Java";
        this.i1 = null;
        this.students = null;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }

    public String getCoding_language() {
        return coding_language;
    }

    public void setCoding_language(String coding_language) {
        this.coding_language = coding_language;
    }

    public Instructor getI1() {
        return i1;
    }

    public void setI1(Instructor i1) {
        this.i1 = i1;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    // IMPORTANT! Method Overriding: Defining a method with the same method signature from the parent class
//    @Override
    public void display_Course_info() {
        System.out.println("Course Name: " + super.name + ", Course Number: " + super.course_number);
        System.out.println("Syllabus: " + this.syllabus + ", Language: " + this.coding_language +
                ", Instructor: " + this.i1 + ", Students: " + this.students);
    }




    //Methods: public, default, protected methods are inherited

    //Package; Java files under same folder are considered to be in a same package



}
