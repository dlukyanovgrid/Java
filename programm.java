import java.util.Scanner;

class Programm{
	public static void main(String[] args){
		System.out.println("Enter 2 numbers:");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println(a+" + "+b+" = "+(a+b));
	}
}
