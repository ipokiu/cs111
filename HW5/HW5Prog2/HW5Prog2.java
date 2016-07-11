/********************************************
* AUTHOR: Andrea Hsieh
* COURSE: CS 111 Intro to CS I
* SECTION: Mon-Thurs 10-12
* HOMEWORK #: 	5
* PROJECT #:	2
* LAST MODIFIED: 6/28/16
********************************************/
/*****************************************************************************
* HW5Prog2.java
*****************************************************************************
* PROGRAM DESCRIPTION: Takes a list of exam scores and returns the total number 
* of grades, number of and percent of A's, B's, C's, D's, and F's
*****************************************************************************
* ALGORITHM:
* 1. PROMPT ""Please enter grade (-1 to exit): ""
* 2. READ temp
* 3. DO-WHILE grade <= 100 and grade >= 0
* 4. IF gradeA
* 5. ELSE IF gradeB
* 6. ELSE IF gradeC
* 7. ElSE IF gradeD
* 8. ELSE IF gradeF
* 9. OUTPUT gradeCount
* 10.OUTPUT numA
* 11.OUTPUT percentA 
* 12.OUTPUT numB
* 13.OUTPUT percentB 
* 14.OUTPUT numC
* 15.OUTPUT percentC
* 16.OUTPUT numD
* 17.OUTPUT percentD 
* 18.OUTPUT numF
* 19.OUTPUT percentF 
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* Scanner = used for console input
*****************************************************************************/
import java.util.Scanner;

public class HW5Prog2
{	
	/***** CONSTANT SECTION *****/
	public static void main(String[] args)
	{
		/***** DECLARATION SECTION *****/
		Scanner keyboard;
		String temp;
		int grade, gradeCount, numA, numB, numC, numD, numF;
		boolean gradeA,gradeB,gradeC,gradeD,gradeF;
		double percentA, percentB, percentC, percentD, percentF;
		
		/***** INITIALIZATION SECTION *****/
		keyboard = new Scanner(System.in);
		gradeCount = 0;
		numA = 0;
		numB = 0;
		numC = 0;
		numD = 0;
		numF = 0;
		
		/***** INPUT SECTION *****/
		do
		{
			System.out.print("Please enter grade (-1 to exit): ");
			temp = keyboard.nextLine();
			grade = Integer.parseInt(temp);
			
			gradeA = grade >= 90 && grade <= 100;
			gradeB = grade >= 80 && grade <= 89;
			gradeC = grade >= 70 && grade <= 79;
			gradeD = grade >= 60 && grade <= 69;
			gradeF = grade >= 0 && grade <= 59;
			
			/***** PROCESSING SECTION *****/
			if (gradeA)
			{
				numA++;
				gradeCount++;
			}
			else if (gradeB)
			{
				numB++;
				gradeCount++;
			}
			else if (gradeC)
			{
				numC++;
				gradeCount++;
			}
			else if (gradeD)
			{
				numD++;
				gradeCount++;
						}
			else if (gradeF)
			{
				numF++;
				gradeCount++;
			}
			else
			{
				gradeCount = gradeCount;
			}
		}while (grade <= 100 && grade >= 0);
		
		percentA = (double) numA / gradeCount * 100;
		percentB = (double) numB / gradeCount * 100;
		percentC = (double) numC / gradeCount * 100;
		percentD = (double) numD / gradeCount * 100;
		percentF = (double) numF / gradeCount * 100;
		
		keyboard.close();
		/***** OUTPUT SECTION *****/
		System.out.println("\nTotal number of grades = " + gradeCount);
		System.out.print("Number of A's = " + numA + " which is ");
		System.out.printf("%.1f" + "%c%n", percentA,'%');
		System.out.print("Number of B's = " + numB + " which is ");
		System.out.printf("%.1f" + "%c%n", percentB,'%');
		System.out.print("Number of C's = " + numC + " which is ");
		System.out.printf("%.1f" + "%c%n", percentC,'%');
		System.out.print("Number of D's = " + numD + " which is ");
		System.out.printf("%.1f" + "%c%n", percentD,'%');
		System.out.print("Number of F's = " + numF + " which is ");
		System.out.printf("%.1f" + "%c%n", percentF,'%');
	}
}
