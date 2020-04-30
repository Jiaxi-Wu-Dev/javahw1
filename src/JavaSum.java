// Creating the Java function to add two inputs from the user

// imports scanner functionality
import java.util.Scanner;
class JavaSum
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        // print line enter first number
        System.out.print("Enter First Number ");
        // initializing input one
        int InputOne = in.nextInt();
        // print line second number
        System.out.print("Enter Second Number ");
        // initializing to input two
        int secondInput = in.nextInt();
        // add userinputs
        System.out.println("Answer " + addUserInputs(InputOne, secondInput));
    }   
    // function to add input one and two and return its sum 
    public static int addUserInputs(int x, int y){
        return x + y;
    }
}

