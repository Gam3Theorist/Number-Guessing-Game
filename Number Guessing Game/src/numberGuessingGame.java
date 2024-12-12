import java.util.Scanner;
public class numberGuessingGame
	{
static int guess;
		public static void main(String[] args)
			{
				Scanner userStringInput = new Scanner (System.in);
				Scanner userIntInput = new Scanner (System.in);
				System.out.println("Hello! What is your name?");
				String name = userStringInput.nextLine();
				System.out.println("Greetings "+name+", pick a number between 1 and 5.");
				int randomNumber = (int) ((Math.random()*5)+1);
			    guess = userIntInput.nextInt();
			    boolean stillGuessing = true;
			int counter = 0;
	 while (stillGuessing==true)
					{
						if (guess > randomNumber)
							{
								System.out.println("Too high!");
								 guess = userIntInput.nextInt();
							}
						else if (guess < randomNumber)
							{
								System.out.println("Too Low!");
								 guess = userIntInput.nextInt();
							}
								 else
									 {
										 stillGuessing = false;
									 }
							
			counter = counter +1;
				
					}
	 stillGuessing = false;
		 
			 System.out.println("You got it!");
		 
	if (counter > 1)
		{
		
	 System.out.println("It took you "+counter+" tries!");
			}
	  else if (counter == 1)
		  {
			  System.out.println("You lucky duck, you got it first try!");
		  }
			}
	}
