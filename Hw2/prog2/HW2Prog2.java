public class HW2Prog2
{
	public static void main(String[] args)
	{
		double caloriesPerMinuteRunning, caloriesPerMinuteBasketball, caloriesPerMinuteSleeping;
		double timeRunning, timeBasketball, timeSleeping; //all of the time is in terms of hours
		double weightInKg, total;
		int METRunning, METBasketball, METSleeping, weightInLbs;
		
		weightInLbs = 250;
		METRunning = 10;
		METBasketball = 8;
		METSleeping = 1;
		timeRunning = 0.5;
		timeBasketball = 0.5;
		timeSleeping = 6;
		
		weightInKg = weightInLbs * (1/2.2);
		
		caloriesPerMinuteRunning = 0.0175 * METRunning * timeRunning * weightInKg;
		caloriesPerMinuteBasketball = 0.0175 * METBasketball * timeBasketball * weightInKg;
		caloriesPerMinuteSleeping = 0.0175 * METSleeping * timeSleeping * weightInKg;
		total = caloriesPerMinuteRunning + caloriesPerMinuteBasketball + caloriesPerMinuteSleeping;
		
		
		System.out.println("Calories burned = " + total);
	}
}
