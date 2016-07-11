/********************************************
* AUTHOR: Andrea Hsieh
* COURSE: CS 111 Intro to CS I
* SECTION: Mon-Thurs 10-12
* HOMEWORK #: 	5
* PROJECT #:	1
* LAST MODIFIED: 6/27/16
********************************************/
/*****************************************************************************
* HW5Prog1.java
*****************************************************************************
* PROGRAM DESCRIPTION: Asks for you to enter a sentence and then returns 
* "Yes", "No", "Wow", or the line that you entered depending on punctuation and
* character count
*****************************************************************************
* ALGORITHM:
* 1. PROMPT "Please enter a sentence(with punctuation): "
* 2. READ line
* 3. IF-ELSE even '?'
* 4. OUTPUT (if true) "Yes"
* 5. IF-ELSE(under even '?' ELSE) odd '?'
* 6. OUTPUT (if true) "No"
* 7. IF-ELSE(under odd '?' ELSE) '!' 
* 8. OUTPUT (if true) "Wow"
* 9. OUTPUT(under '!' ELSE) "You always say \"" + line + "\""
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* Scanner = used for console input
******************************************************************************/
import java.util.Scanner;

public class HW5Prog1V2
{	
	/***** CONSTANT SECTION *****/
	public static void main(String[] args)
	{
		/***** DECLARATION SECTION *****/
		Scanner keyboard;
		String line;
		int length;
		char punctuation;
		
		keyboard = new Scanner(System.in);
		
		/***** INPUT SECTION *****/
		System.out.print("Please enter a sentence(with punctuation): ");
		line = keyboard.nextLine();
		/***** INITIALIZATION SECTION *****/
		length = line.length();
		punctuation = line.charAt(length-1);
		
		/***** PROCESSING SECTION *****/
		/***** OUTPUT SECTION *****/
		if ((punctuation == '?') && (length % 2 == 0))
		{
			System.out.print("Yes");
		}
		else
		{
			if ((punctuation == '?') && (length % 2 != 0))
			{
				System.out.print("No");
			}
			else
			{
				if (punctuation == '!')
				{
					System.out.print("Wow");
				}
				else
				{
					System.out.print("You always say \"" + line + "\"");
				}
			}
		}
	}
}
