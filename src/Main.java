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
    }
}

