package fysik_uppgift;

public class bibliotek {
	static double g = 9.82;
	
//  1	
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius;
		celsius = (fahrenheit -32)/1.8;
		return celsius;
	}
//	2
	public static double kelvinToCelsius(double kelvin) {
		return kelvin + -273.15;
	}
//	3
	public static double fluidPressure(FluidTable fluid, double deep) {
		double fluidpressure;
		fluidpressure = fluid.density * deep * g;
		return fluidpressure;
	}
//	4
	public static double pressureUnderWater(double deep) {
		double pressureunderwater;
		pressureunderwater = 998 * deep * g;
		return pressureunderwater;
	}
//	5
	public static double kineticEnergy(double mass, double velocity) {
		double keneticenergy;
		keneticenergy = (mass * velocity * velocity) / 2;
		return keneticenergy;
		
	}
//	6
	double potentialEnergy(double mass, double height) {
		double potentialenergy;
		potentialenergy = mass * g * height;
		return potentialenergy;
	}
//	7
	double fallSpeed(double height)
}
