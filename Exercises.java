package examples;

import java.util.Scanner;

public class Exercises {

	public static void main(String[] args) {
		Exercises ex=new Exercises();

		Scanner sc=new Scanner(System.in);
        System.out.print("Enter n1: ");
        double num1=sc.nextDouble();
        System.out.print("Enter n2: ");
        double num2=sc.nextDouble();
        System.out.println("Choose Arithmetic Operations: ");
        char ch=sc.next().charAt(0);
        switch(ch){
        case '+' : System.out.println("The sum of two numbers = "+ex.fadd(num1, num2));break;
        case '-' : System.out.println("The substration of two numbers = "+ ex.fsub(num1, num2));break;
        case '*' : System.out.println("The multiplication of two numbers = "+ex.fmul(num1,num2));break;
        case '/' : System.out.println("The division of two numbers = "+ ex.fdiv(num1, num2));break;
        
        }
        
        }
	public double fadd(double num1 ,double num2 ){
		return num1+num2;
	}
	
	public double fsub(double num1,double num2) {
		return num1-num2;
	}
	
	public double fmul(double num1,double num2) {
		return num1*num2;
	}
	public double fdiv(double num1,double num2) {
		return num1/num2;
	}
	
	
}
