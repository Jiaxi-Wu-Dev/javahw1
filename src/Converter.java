import java.util.Scanner;
class Converter
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number in inches: ");
        double inches = in.nextDouble();

        System.out.println("Answer in meters: " + convertInches(inches));

    }
    public static double convertInches(double x) {
        return x * 0.0254;
    }
}


