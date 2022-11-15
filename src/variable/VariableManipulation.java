package variable;

public class VariableManipulation {

    // main method to run program (psvm)
    public static void main(String[] args) {

        // Syntax for Variable : DataType variable_name = value;
        // we make the variable to store the data or information

        // how to declare two variables together
        // int a,b = 10; it means int a = 10; and int b = 10;

        // Increment operator (++) :
        // variable_name++;  it means  variable_name = variable_name+1;
        // i++; it means i= i+1;


        // Decrement operator (--) :
        // variable_name--;  it means  variable_name = variable_name-1;
        // i--; it means i= i-1;


       int a = 1; // Syntax for Variable : DataType variable_name = value;
       a++; // a = a+1; it is increment operator

        System.out.println("Value of a after a++ is :"+a); //  it will print 2 on consul

        // System.out.println("Message is :"+variable_name)
        // + operator is called concatenation(it will add to things )


       a--; // a = a-1; it is a decrement operator

        System.out.println("Value of a after a-- is :"+a); // it will print 1 on consul


      // Mathematical operation: sum,subtraction,division,multiplication(+,-,/,*)

        int b= 20;
        int c = 10;

        int sum = b+c;
        System.out.println("Sum is :"+sum); // result 30

        int subtraction = b-c;
        System.out.println("Subtraction is:"+subtraction); //result 10

        int division = b/c;
        System.out.println("Division is :"+division); // result 2

        int multiplication = b*c;
        System.out.println("Multiplication is:"+multiplication); // result 200


      // Square and Cube

        int number = 10;
        int square = number*number;

        System.out.println("Square of 10 is :"+square); //result 100


        int cube = number*number*number;
        System.out.println("Cube of 10 is:"+cube); // result 1000





    }


}

