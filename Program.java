//import stuff here
import java.util.Scanner;

//Your code here
public class Program8 {
    public static void main(String[] args){
        
        //declare variables
        int num1 = 0;
        int num2 = 0;
        
        Scanner numScanner = new Scanner(System.in);
        
        //user input
        System.out.print("Enter first integer: ");
        num1 = numScanner.nextInt();
        
        System.out.print("Enter second integer: ");
        num2 = numScanner.nextInt();
        
        //print results
        Calculator numCalc = new Calculator(num1, num2);
        System.out.println("\nSum: " + numCalc.getSum());
        System.out.println("Difference: " + numCalc.getDiff());
        System.out.println("Product: " + numCalc.getProd());
        System.out.println("Average: " + numCalc.getAvg());
        System.out.println("Distance (absolute value of difference): " + numCalc.getDist());
        System.out.println("Max of both: " + numCalc.getMax());
        System.out.println("Minimum of both: " + numCalc.getMin());
    }
}
//Paste console output below:
/*

Enter first integer: 13
Enter second integer: 20

Sum: 33
Difference: -7
Product: 260
Average: 16.5
Distance (absolute value of difference): 7
Max of both: 20
Minimum of both: 13

*/
