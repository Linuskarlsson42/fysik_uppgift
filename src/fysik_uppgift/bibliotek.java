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
	public static double potentialEnergy(double mass, double height) {
		double potentialenergy;
		potentialenergy = mass * g * height;
		return potentialenergy;
	}
//	7
	public static double fallSpeed(double height) {
		double fallspeed;
	    fallspeed = Math.sqrt(2*g*height);
	    return fallspeed;
	}
//	8
	public static double delta(double first, double last) {
		double delta;
		delta = first - last;
		return delta;
	}
//	9
	public static double volumeToMass(FluidTable fluid, double volume) {
		double volumetomass;
		volumetomass = fluid.density * volume;
		
		return volumetomass;
		
	}
//	10
	double volumeToMass(GasTable gas, double volume) {
		double gasvolumetomass;
		gasvolumetomass = gas.density * volume;
		return gasvolumetomass;
	}
//	11
	double volumeToMass(SolidTable solid, double volume) {
		double solidvolumetomass;
		solidvolumetomass = solid.density * volume;
		return solidvolumetomass;
	}
//	12
	double svtVelocity(double distance, double time) {
		double svtVelocity;
		svtVelocity = distance / time;
		return svtVelocity;
	}
//	13
	double svtDistance(double velocity, double time) {
		double svtDistance;
		svtDistance = velocity * time;
		return svtDistance;
		
	}
//	14
	double svtTime(double distance, double velocity) {
		double svttime;
		svttime = distance / velocity;
		return svttime;
	}
//	15
	
}
