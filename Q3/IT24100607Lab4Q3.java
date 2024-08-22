import java.util.Scanner;
public class IT24100607Lab4Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int number = input.nextInt();

		System.out.println((number > 0) ? "The number is Positive" :  
				(number < 0) ? "The number is Negative" : 
				"The number is Zero");
		
	}
}