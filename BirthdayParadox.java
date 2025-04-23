import simpleIO.Console;

/**
 * @author Ariana Hrlic 
 * April 7th, 2023 
 * BirthdayParadox.java
 * BirthdayParadox
 *
 */

public class BirthdayParadox {

	public static void main(String[] args) {

		final int DATES_PER_LINE = 6;
		int[] birthdays = null;
		int groupSize = 0;

		Console.print("Welcome to the Birthday Paradox Simulator");

		groupSize = Console.readInt("How many people are in this birthday group");
		birthdays = new int[groupSize];

		populateArray(birthdays);

		// format for the birthday list
		for (int i = 0; i < groupSize; i++) {
			String formattedDate = formatDate(birthdays[i]);
			Console.print(formattedDate + "\t\t", (i + 1) % DATES_PER_LINE == 0);
		}

	}

	public static int randomNumber(int a, int b) {

		int highNum = Math.max(a, b);
		int lowNum = Math.min(a, b);
		int range = highNum - lowNum + 1;
		return (int) (Math.random() * range) + lowNum;
	}

	public static void populateArray(int[] birthdays) {

		
		for (int i = 0; i < birthdays.length; i++) {
			int number = randomNumber(1, 365);
			birthdays[i] = number;
		}
	}

	public static String formatDate(int dayOfYear) {
		
		String str = "";
		int calc = 0;
		
		if ((dayOfYear > 0) && (dayOfYear < 31)){
			str = "Jan ";
		} else if ((dayOfYear > 32) && (dayOfYear < 59)) {
			calc = dayOfYear - 31; 
			str = "Feb "; 
		} else if ((dayOfYear > 60) && (dayOfYear < 90)) {
			calc = dayOfYear - 59; 
			str = "Mar ";
		} else if ((dayOfYear > 91) && (dayOfYear < 120)) {
			calc = dayOfYear - 90; 
			str = "Apr ";
		} else if ((dayOfYear > 121) && (dayOfYear< 151)) {
			calc = dayOfYear - 120; 
			str = "May ";
		} else if ((dayOfYear > 152) && (dayOfYear < 181)) {
			calc = dayOfYear - 151;
			str = "Jun ";
		} else if ((dayOfYear > 182) && (dayOfYear< 212)) {
			calc = dayOfYear - 181;
			str = "Jul ";
		} else if ((dayOfYear > 213) && (dayOfYear < 243)) {
			calc= dayOfYear -212; 
			str = "Aug ";
		} else if ((dayOfYear > 244) && (dayOfYear < 273)) {
			calc = dayOfYear - 243;
			str = "Sep ";
		} else if (((dayOfYear > 274) && (dayOfYear < 304 ))){
			calc = dayOfYear - 273;
			str = "Oct ";
		}else if ((dayOfYear > 305) && (dayOfYear < 334)) {
			calc = dayOfYear - 304;
			str = "Nov ";
		}else if ((dayOfYear > 335) && (dayOfYear < 365)) {
			calc = dayOfYear - 334;
			str = "Dec ";
		} 
						
			String fDate = str + calc; 
						
		
		return fDate;
	
	}
	
	}
	
