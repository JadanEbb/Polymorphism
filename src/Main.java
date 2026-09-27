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

        BSU_Member B1, B2;
        //Creating an object of student type and storing the reference in a BSU_Member type variable "Member".
        B1 = new Student ();
        B2 = new Instructor();

        member[0] = B1;
        member[1] = B2;

        System.out.println("====================");

        for (int i = 2; i < 10; i++) {
            member[i] = new BSU_Member();
        }

        System.out.println("======================");

        for (int i = 0; i < 10; i++) {
            member[i].display_Information();
        }




    }
}

