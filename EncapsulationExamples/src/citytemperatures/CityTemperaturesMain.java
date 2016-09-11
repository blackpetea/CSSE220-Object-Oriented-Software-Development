package citytemperatures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * Gets in a list of readings of temperatures for particular cities. Then prints
 * out all the cities and the average temperature for each one.
 * 
 * Note that the order cities are printed out at the end does not matter.
 * 
 * Example:
 * 
 * Enter the city name (or exit to quit). 
 * Buffalo 
 * What is the city's
 * temperature? 
 * 10 
 * Enter the city name (or exit to quit). 
 * Terre Haute 
 * What is
 * the city's temperature? 
 * 25 
 * Enter the city name (or exit to quit). 
 * Buffalo
 * What is the city's temperature? 
 * 20 
 * Enter the city name (or exit to quit).
 * exit 
 * Terre Haute 25.0 
 * Buffalo 15.0
 * 
 * @author hewner
 *
 */
public class CityTemperaturesMain {
	/**
	 * 
	 * Requests temperatures and prints averages
	 *
	 * @param args not used
	 */
	public static void main(String[] args) {
		HashMap<String,ArrayList<Double>> data=new HashMap<String,ArrayList<Double>>();
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the city name (or exit to quit).");
			String cityName = input.nextLine().trim();
			if(cityName.equals("exit")) {
				break;
			}
			
			System.out.println("What is the city's temperature?");
			double temperature = input.nextDouble();
			
			if (!data.containsKey(cityName)) {
				data.put(cityName, new ArrayList<Double>());
			data.get(cityName).add(temperature);
			}
			input.nextLine();
		}
		input.close();
		
		HashMap<String,Double> data2=new HashMap<String,Double>();
		for (String city:data.keySet()) {
			double sum=0;
			double times=0;
			for (int i=0;i<data.get(city).size();i++) {
				sum+=data.get(city).get(i);
				times++;
				if (!data2.containsKey(city)) {
					data2.put(city, sum/times);
				}
			}
		}
		
		for (String city:data2.keySet()) {
			System.out.println(city+" "+data2.get(city));
		}
	}
}
