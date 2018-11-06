package fysik_uppgift;

public class bibliotek {
/**
 * 
 * 
 * 
 * 
 */
	static double g = 9.82;
	static double G = 6.6726E-11;
	static double R = 8.3145;
	static double P_0 = 100000;
	static double c = 2.99792458E8;
	
/**
 * denna metod tar in grader i fahrenheit och ger tillbaka gradet i celsius
 * 
 */
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius;
		celsius = (fahrenheit -32)/1.8;
		return celsius;
	}
/**
 * Denna metod får in double kelvin
 * Den tar kelvin - 273.15 för att omvandla den till celsius 
 * ger tillbaka grader i celsius
 * 
 */
	public static double kelvinToCelsius(double kelvin) {
		return kelvin - 273.15;
	}
/**
 * denna metod räknar ut det tryket (i pascal/Pa) man känner under ett visst djup
 * 
 * Först tar den densiteten en vetska från enumen FluidTable
 * 
 * När den har densiteten av valt ämne så räknar den ut tryket genom att multiplicera
 * den med djupet och tyngdaccelerationen för sverige
 * Ger tillbaka tryket i pascal.
 * 
 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		double fluidpressure;
		fluidpressure = fluid.density * deep * g;
		return fluidpressure;
	}
/**
 * 	Denna metod räknar ut tryket bara för vatten vid ett visst djup.
 *  Den gör det genom att ta vattnets densitet (998) och som i den förra metoden
 *  tar det ggr djupet och tyngdaccelerationen.
 *  ger tillbaka tryk i pascal.
 * 
 */
	public static double pressureUnderWater(double deep) {
		double pressureunderwater;
		pressureunderwater = 998 * deep * g;
		return pressureunderwater;
	}
/**
 * Denna metod räknar ut den kenetiska energi som ett föremål utsätts för vid en hastighet
 * Först tar den in massan (i kg) och hastigheten (i m/s)
 * Med hjälp av dessa två doubles räknar den ut och ger tillbaka den kenetiska energin.
 * 
 *
 */
	public static double kineticEnergy(double mass, double velocity) {
		double keneticenergy;
		keneticenergy = (mass * Math.pow(velocity, 2)) / 2;
		return keneticenergy;
		
	}
/**
 * 6
 *  En metod som räknar ut potential energy 
 *  detta gör den genom ta in en double mass och double height
 *  sedan multipliseras dessa två och tyngdaccelerationen med vanandra
 *  ger tillbaka den potentiala energin.
 * 
 */
	public static double potentialEnergy(double mass, double height) {
		double potentialenergy;
		potentialenergy = mass * g * height;
		return potentialenergy;
	}
/**
 * 7
 * En metod som räknar ut hastigheten på ett föremål från en viss höjd.
 * Den tar in en double height
 * height och tyngdaccelerationen multiplicaras med varandra och med 2 som
 * kvadtarrot ur svaret av detta, ger tillbaka hastigheten/fallspeed.
 *
 */
	public static double fallSpeed(double height) {
		double fallspeed;
	    fallspeed = Math.sqrt(2*g*height);
	    return fallspeed;
	}
/**
 * 8
 *  En metod som får in två olika tider och räknar ut DeltaT genom att ta den tid
 *  sista uppfattade tiden och subtrahera den med den första.
 *  
 */
	public static double delta(double first, double last) {
		double delta;
		delta = last - first;
		return delta;
	}
/**
 * 9
 * får in den densitet från vald vätska från enumen FluidTable.
 * sedan tar den in volymen av vätskan och multiplicerar det med densiteten för att
 * få ut massan.
 *
 */
	public static double volumeToMass(FluidTable fluid, double volume) {
		double volumetomass;
		volumetomass = fluid.density * volume;
		
		return volumetomass;
		
	}
/**
 * 10
 * Gör samma sak som 9 men får densiteten från GasTable.
 */
	public static double volumeToMass(GasTable gas, double volume) {
		double volumetomass;
		volumetomass = gas.density * volume;
		return volumetomass;
	}
/**
 * 11
 * Gör samma sak som 9 men får densiteten från SolidTable
 */
	public static double volumeToMass(SolidTable solid, double volume) {
		double volumetomass;
		volumetomass = solid.density * volume;
		return volumetomass;
	}
/**
 * 12
 * räknar ut hastigheten över en viss sträcka och tid.
 * tar in en double distance och en double time.
 * dividerar distance med time och ger tillbaka svtVelocity.
 */
	public static double svtVelocity(double distance, double time) {
		double svtVelocity;
		svtVelocity = distance / time;
		return svtVelocity;
	}
/**
 * 13
 * Räknar ut sträckan med hastighet och tid.
 * får in en double velocity och en double time.
 * multiplicerar velocity med time och ger tillbaka svtDistance
 */
	public static double svtDistance(double velocity, double time) {
		double svtDistance;
		svtDistance = velocity * time;
		return svtDistance;
		
	}
/**
 * 14
 * Räknar ut tiden av en sträcka och hastighet
 * får in en double distance och en double velocity
 * dividerar distance med velocity och ger tillbaka svtTime
 */
	public static double svtTime(double distance, double velocity) {
		double svtTime;
		svtTime = distance / velocity;
		return svtTime;
	}
/**
 * 15
 * Räknar ut arbete mha kraft och sträcka 
 * får in en double distance och en double force
 * multiplicerar force med distance och ger tillbaka arbete 
 */
	public static double work(double force, double distance) {
		double work;
		work = force * distance;
		return work;
	}
/**
 * 16
 * räknar ut effekten mha arbete och tid
 * får in en double work och en double time
 * dividerar work med time och ger tillbaka effekt/power
 */
	public static double power(double work, double time) {
		double power;
		power = work/time;
		return power;
	}
/**
 * 17
 * Räknar ut hur mycket energi det krävs för att värma upp ett ämne ett visst antal 
 * grader.
 * Den får in ett fast ämnes värmekapacitet från enumen SolidTable, en double mass
 * och en double deltaT
 * Sen multiplicerar den alla variabler och ger tillbaka energin/heat
 */
	public static double heat(SolidTable solid, double mass, double deltaT) {
		double heat;
		heat = solid.heatCapacity * mass * deltaT;
		return heat;
	}
/**
 * 18
 * Denna metod gör samma sak som 17 bara att den tar in värmekapaciteten från 
 * enumen FluidTable och tar in en double volume istället för mass.
 * ger tillbaka energin/heat
 */
	public static double heat(FluidTable fluid, double volume, double deltaT) {
		double heat;
		heat = fluid.heatCapacity * volume * deltaT;
		return heat;
	}
/**
* 19
* Denna metod gör samma sak som 17 bara att den tar in värmekapaciteten från 
* enumen Gastable och tar in en double volume istället för mass.
* ger tillbaka energin/heat
*/
	public static double heat(GasTable gas, double volume, double deltaT) {
		double heat;
		heat = gas.heatCapacity * volume * deltaT;
		return heat;
	}
/**
 * 20 
 * Räknar ut vilken höjd ett föremål med en viss hastighet har
 * Får in en double velocity
 * Den börjar med att att ta velocity upphöjt till 2.
 * Sedan tar den 2 * tyngdaccelerationen och dividerar de två med varandra
 * Ger tillbaka höjden/height
 */
	public static double velocityToHeight(double velocity){
			return Math.pow(velocity, 2)/(2*g);
		}
/**
 * 21
 * Gör om grader celsius till kelvin.
 * Får in en double celsius som senare adderas med 273.15 och ger tillbaka 
 * grader i kelvin.
 */
	public static double celsiusTokelvin(double celsius) {
		double kelvin;
		kelvin = celsius + 273.15;
		return kelvin;
	}
/**
 * 22
 * Räknar ut densiteten på ett ämne med en viss massa och volym.
 * Får in en double mass och en double volume.
 * Dividerar mass med volume och ger tillbaka densiteten.
 */
	public static double Density(double mass, double volume) {
		double density;
		density = mass/volume;
		return density;
	}
/**
 * 23
 * Lagen handlar om hur alla partiklar med en massa kommer att dras mot varandra så 
 * detta är en metod som räknar ut kraften mella två objekt.
 * Den får in en double m1 för första massan, double m2 för den andra massan 
 * och en double distance för längden mellan de två massorna.
 * Sedan tar den och multiplicerar de båda massorna med varandra och dividerar det med
 * längden upphöjt till 2, och sist gånger gravitationskonstanten.
 * Ger tillbaka den kraft som värkar mellan dem två föremål.
 */
	public static double NewtonsGravitationslag(double m1, double m2, double distance) {
		double F;
		F =  G*((m1 * m2)/Math.pow(distance, 2));
		return F;
	}
/**
 * Räknar ut impuls.
 * får in en double force och double deltaT.
 * dividerar force med deltaT och ger tillbaka impuls. 
 * 
 */
	public static double Impuls(double Force, double DeltaT) {
		double Impuls;
		Impuls = Force/DeltaT;
		return Impuls;
	}

/**
 * 25
 * en metod som räknar ut tyngdaccelerationen på t.ex jupiter med hjälp av dess massa, 
 * radie och gravitationskonstanten. 
 * Får in en double mass och en double distance.
 * Först multiplicerar man massan med gravitationskonstanten, sendan tar den distance
 * upphöjt till 2 och tillslut divideras båda.
 * ger tillbaka tyngdaccelerationen.
 */
	public static double G(double mass, double distance) {
		double Ge;
		Ge = (G * mass)/Math.pow(distance, 2);
		return Ge;
	}
/**
 * 26
 * Detta är en metod som räknar ut lyftkraften hos ett föremål.
 * Den tar in densiteten hos en vätska och volymen på föremålet.
 * Sedan räknar den ut lyftkraften genom att multiplicera densiteten,
 * tyngaccelerationen och volymen med varandra.
 */
	public static double LyftKraft(FluidTable fluid, double volume) {
		double lyftkraft;
		lyftkraft = fluid.density * g * volume;
		return lyftkraft;
	}
/**
 * 27
 * Denna metod räknar ut ett föremåls densitet med två massor, en utanför vatten 
 * och en massa när den är i vatten.
 * 
 */
	public static double DensitetPåEttVistFöremål(double mass, double massUnderWater, FluidTable fluid) {
		double density;
		double volume;
		volume = ((mass * g) - (massUnderWater * g))/(fluid.density * g);
		density = mass/volume;
		return density;
	}
/**	
 * 28
 */
}
