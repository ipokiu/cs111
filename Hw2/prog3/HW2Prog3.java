public class HW2Prog3
{
	public static void main(String[] args)
	{
		int tempF;
		double tempC;
		
		tempF = 100;
		tempC = (5*((double)tempF - 32)/9);
		
		System.out.println("Welcome to temp conversion program!");
		System.out.println(tempF + " degrees Fahrenheight = " + tempC + " degrees Celsius");
	}
}
