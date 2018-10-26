package fysik_uppgift;

public class bibliotek {
	static double g = 9.82;
	static double G = 6.67E-11;
	static double R = 8.3145;
	static double P_0 = 100000;
	static double c = 2.99792458E8;
	
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
	public static double volumeToMass(GasTable gas, double volume) {
		double volumetomass;
		volumetomass = gas.density * volume;
		return volumetomass;
	}
//	11
	public static double volumeToMass(SolidTable solid, double volume) {
		double volumetomass;
		volumetomass = solid.density * volume;
		return volumetomass;
	}
//	12
	public static double svtVelocity(double distance, double time) {
		double svtVelocity;
		svtVelocity = distance / time;
		return svtVelocity;
	}
//	13
	public static double svtDistance(double velocity, double time) {
		double svtDistance;
		svtDistance = velocity * time;
		return svtDistance;
		
	}
//	14
	public static double svtTime(double distance, double velocity) {
		double svttime;
		svttime = distance / velocity;
		return svttime;
	}
//	15
	public static double work(double force, double distance) {
		double work;
		work = force * distance;
		return work;
	}
//	16
	public static double power(double work, double time) {
		double power;
		power = work/time;
		return power;
	}
//	17
	public static double heat(SolidTable solid, double mass, double deltaT) {
		double heat;
		heat = solid.heatCapacity * mass * deltaT;
		return heat;
	}
//	18
	public static double heat(FluidTable fluid, double volume, double deltaT) {
		double heat;
		heat = fluid.heatCapacity * volume * deltaT;
		return heat;
	}
//	19
	public static double heat(GasTable gas, double volume, double deltaT) {
		double heat;
		heat = gas.heatCapacity * volume * deltaT;
		return heat;
	}
//  20
	public static double velocityToHeight(double velocity){
			return Math.pow(velocity, 2)/(2*g);
		}
	

}
