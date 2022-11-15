package practice;

public class Demo {


    // syntax of method signature : access_specifier return_type method_name(input parameters){code};

    public void A(){
     System.out.println("THIS IS A VERY SIMPLE CODE");

    }

   // main method to run program
   public static void main(String[] args) {

        // to create the object of class : class_name object_name = new class_name();
       Demo demo = new Demo();
       demo.A(); // to call method : object_name.method_name();

   }




}
