package Exception_Handling;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExceptionDemo {
//    Exception types:

    /*
    1. Errors.
    2.Unchecked
    3.Checked
    */
    public  static  int divide(int a , int b) throws DivideByZeroException{
        if(b==0){
            throw new DivideByZeroException();
        }
        return a/b;
    }

    public static void main(String[] args) throws DivideByZeroException{  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try {
            int sol = factorial(n);
        }
        catch(NegativeNumberException Nne){
            System.out.println("Provide a possitive number to factorial");
        }
        try{
            divide(10,0);
        } catch (DivideByZeroException e){
            System.out.println("Divede by zero is raised");

        }
        System.out.println("main");

    }
    public static int factorial(int n)throws NegativeNumberException{
        if(n<0){
//            throw exception
            throw new NegativeNumberException();


        }
        if(n<=1){
            return 1;
        }
        return factorial(n-1)*n;
    }

}
