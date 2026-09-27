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

    //Setters and getters
    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }

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


    // IMPORTANT! Method Overriding: Defining a method with the same method signature from the parent class
//    @Override
    public void display_Course_info(){
//lab work use super attribute name inside a print statement
        super.display_Course_infromation();
        System.out.println("Syllabus: " + this.syllabus + "language: " + this.coding_language +
                "Instructor: " + this.i1 + "Students: " + this.students);
    }




    //Methods: public, default, protected methods are inherited

    //Package; Java files under same folder are considered to be in a same package



}
