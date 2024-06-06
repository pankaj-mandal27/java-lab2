package ExceptionHandling;

import java.util.Scanner;

public class Main {
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter Numerator : ");
            float numerator = sc.nextFloat();

            System.out.println("Enter Denominator : ");
            float  denominator = sc.nextFloat();

            float result = divide(numerator,denominator);
            System.out.println("Result : "+result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error : Division BY Zero Occured !!!");
        }catch(Exception e){
            System.out.println("Error : Invalid input");
        }finally {
            sc.close();
        }
    }
    public static float divide(float numerator, float denominator)
    {
        return numerator/denominator;
    }
}
