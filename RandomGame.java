import java.util.Random;
import java.util.Scanner;
public class RandomGame
{
	
	static int randomNumber()
	{
		Random random = new Random();
		int x = random.nextInt(100)+1;
		return x;
	}
	public static void main(String[] args)
	{
		char option;
		Scanner input = new Scanner(System.in);
		
		do{
		int magicNumber = randomNumber();
		System.out.println("Enter Number to guess : " + magicNumber);
		int number = input.nextInt();
		
		if(number == magicNumber){
			System.out.println("You're Win !!!!");
			System.out.println("Do yo want to play again,(y/n)");	
			option = input.next().charAt(0);
		}else{
			System.out.println("You're lose !!!");
			System.out.println("Do yo want to play again,(y/n)");	
			option = input.next().charAt(0);
		}
		}while(option ==  'y');
	}
}