//https://github.com/JadanEbb/Polymorphism.git

public class Main {

    public static void main(String[] args) {
      //Reference of course object
       Course c1 = new Course ();
       c1.display_Course_infromation();

       COSC113 Section1 = new COSC113();
       Section1.display_Course_infromation();

       //Polymorphism
        Course cosc214 = new Course ();
        Course Section2 = new COSC113();

        // The relationship is; IS A relationship between course and COSC113

        cosc214.display_Course_infromation();
        Section2.display_Course_infromation();

        //Student object
        Student Arturo = new Student ();
        Course Math141 = new Course ();
        Course Frse = new Course ();
        Course Cosc107 = new Course ();
        Course Eng102 = new Course ();
        Course Soc101 = new Course ();


        //lab work; populate index 1 to 4 with the other course references (getters and setters?)
        Arturo.enrolled_courses[0] = Math141;
        Arturo.enrolled_courses[1] = Frse;
        Arturo.enrolled_courses[2] = Cosc107;
        Arturo.enrolled_courses[3] = Math141;
        Arturo.enrolled_courses[4] = Eng102;
        Arturo.enrolled_courses[5] = Soc101;


        BSU_Member[] member = new BSU_Member[10];

        member[0] = new Student(101, 20, "Alice", 'F', "Student", 3.8, Arturo.enrolled_courses);
        member[1] = new Instructor(201, 45, "Dr. Smith", 'M', "Faculty", "Computer Science");
        member[2] = new Student(102, 22, "Bob", 'M', "Student", 3.5, Arturo.enrolled_courses);
        member[3] = new Instructor(202, 50, "Dr. Taylor", 'F', "Faculty", "Mathematics");
        member[4] = new BSU_Member();
        member[5] = new Student(103, 19, "Charlie", 'M', "Student", 3.2, Arturo.enrolled_courses);
        member[6] = new Instructor(203, 38, "Prof. Davis", 'M', "Faculty", "Physics");
        member[7] = new BSU_Member();
        member[8] = new Student(104, 21, "Diana", 'F', "Student", 3.9, Arturo.enrolled_courses);
        member[9] = new Instructor(204, 41, "Dr. Wilson", 'F', "Faculty", "Chemistry");

        System.out.println("======================");

        for (int i = 0; i < 10; i++) {
            member[i].display_Information();
        }
    }
}

