import java.util.Scanner;
public class Divisible {
	public boolean isDivisible(int Num, int Divisor){
		String divided = ((double)Num/ (double)Divisor) + "";
		String divideInt = (Num / Divisor) + "";
		if(divided.length() > divideInt.length() + 2){
			return false;
		}
		else{
			return true;
		}
	}
	public static void main(String[]args){
		Divisible div = new Divisible();
		Scanner console = new Scanner(System.in);
		System.out.println("What number do you want to dvide?");
		int num = console.nextInt();
		System.out.println("What number do you want to dvide by?");
		int divisor = console.nextInt();
		if(div.isDivisible(num, divisor) == true){
			System.out.println("Your number is evenly divisible by " +  divisor);
		}
		else{
			System.out.println("Your number does not evenly divide by " +  divisor);
		}
	}
}
