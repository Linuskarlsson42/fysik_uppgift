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
 * Denna metod f�r in double kelvin
 * Den tar kelvin - 273.15 f�r att omvandla den till celsius 
 * ger tillbaka grader i celsius
 * 
 */
	public static double kelvinToCelsius(double kelvin) {
		return kelvin - 273.15;
	}
/**
 * denna metod r�knar ut det tryket (i pascal/Pa) man k�nner under ett visst djup
 * 
 * F�rst tar den densiteten en vetska fr�n enumen FluidTable
 * 
 * N�r den har densiteten av valt �mne s� r�knar den ut tryket genom att multiplicera
 * den med djupet och tyngdaccelerationen f�r sverige
 * Ger tillbaka tryket i pascal.
 * 
 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		double fluidpressure;
		fluidpressure = fluid.density * deep * g;
		return fluidpressure;
	}
/**
 * 	Denna metod r�knar ut tryket bara f�r vatten vid ett visst djup.
 *  Den g�r det genom att ta vattnets densitet (998) och som i den f�rra metoden
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
 * Denna metod r�knar ut den kenetiska energi som ett f�rem�l uts�tts f�r vid en hastighet
 * F�rst tar den in massan (i kg) och hastigheten (i m/s)
 * Med hj�lp av dessa tv� doubles r�knar den ut och ger tillbaka den kenetiska energin.
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
 *  En metod som r�knar ut potential energy 
 *  detta g�r den genom ta in en double mass och double height
 *  sedan multipliseras dessa tv� och tyngdaccelerationen med vanandra
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
 * En metod som r�knar ut hastigheten p� ett f�rem�l fr�n en viss h�jd.
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
 *  En metod som f�r in tv� olika tider och r�knar ut DeltaT genom att ta den tid
 *  sista uppfattade tiden och subtrahera den med den f�rsta.
 *  
 */
	public static double delta(double first, double last) {
		double delta;
		delta = last - first;
		return delta;
	}
/**
 * 9
 * f�r in den densitet fr�n vald v�tska fr�n enumen FluidTable.
 * sedan tar den in volymen av v�tskan och multiplicerar det med densiteten f�r att
 * f� ut massan.
 *
 */
	public static double volumeToMass(FluidTable fluid, double volume) {
		double volumetomass;
		volumetomass = fluid.density * volume;
		
		return volumetomass;
		
	}
/**
 * 10
 * G�r samma sak som 9 men f�r densiteten fr�n GasTable.
 */
	public static double volumeToMass(GasTable gas, double volume) {
		double volumetomass;
		volumetomass = gas.density * volume;
		return volumetomass;
	}
/**
 * 11
 * G�r samma sak som 9 men f�r densiteten fr�n SolidTable
 */
	public static double volumeToMass(SolidTable solid, double volume) {
		double volumetomass;
		volumetomass = solid.density * volume;
		return volumetomass;
	}
/**
 * 12
 * r�knar ut hastigheten �ver en viss str�cka och tid.
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
 * R�knar ut str�ckan med hastighet och tid.
 * f�r in en double velocity och en double time.
 * multiplicerar velocity med time och ger tillbaka svtDistance
 */
	public static double svtDistance(double velocity, double time) {
		double svtDistance;
		svtDistance = velocity * time;
		return svtDistance;
		
	}
/**
 * 14
 * R�knar ut tiden av en str�cka och hastighet
 * f�r in en double distance och en double velocity
 * dividerar distance med velocity och ger tillbaka svtTime
 */
	public static double svtTime(double distance, double velocity) {
		double svtTime;
		svtTime = distance / velocity;
		return svtTime;
	}
/**
 * 15
 * R�knar ut arbete mha kraft och str�cka 
 * f�r in en double distance och en double force
 * multiplicerar force med distance och ger tillbaka arbete 
 */
	public static double work(double force, double distance) {
		double work;
		work = force * distance;
		return work;
	}
/**
 * 16
 * r�knar ut effekten mha arbete och tid
 * f�r in en double work och en double time
 * dividerar work med time och ger tillbaka effekt/power
 */
	public static double power(double work, double time) {
		double power;
		power = work/time;
		return power;
	}
/**
 * 17
 * R�knar ut hur mycket energi det kr�vs f�r att v�rma upp ett �mne ett visst antal 
 * grader.
 * Den f�r in ett fast �mnes v�rmekapacitet fr�n enumen SolidTable, en double mass
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
 * Denna metod g�r samma sak som 17 bara att den tar in v�rmekapaciteten fr�n 
 * enumen FluidTable och tar in en double volume ist�llet f�r mass.
 * ger tillbaka energin/heat
 */
	public static double heat(FluidTable fluid, double volume, double deltaT) {
		double heat;
		heat = fluid.heatCapacity * volume * deltaT;
		return heat;
	}
/**
* 19
* Denna metod g�r samma sak som 17 bara att den tar in v�rmekapaciteten fr�n 
* enumen Gastable och tar in en double volume ist�llet f�r mass.
* ger tillbaka energin/heat
*/
	public static double heat(GasTable gas, double volume, double deltaT) {
		double heat;
		heat = gas.heatCapacity * volume * deltaT;
		return heat;
	}
/**
 * 20 
 * R�knar ut vilken h�jd ett f�rem�l med en viss hastighet har
 * F�r in en double velocity
 * Den b�rjar med att att ta velocity upph�jt till 2.
 * Sedan tar den 2 * tyngdaccelerationen och dividerar de tv� med varandra
 * Ger tillbaka h�jden/height
 */
	public static double velocityToHeight(double velocity){
			return Math.pow(velocity, 2)/(2*g);
		}
/**
 * 21
 * G�r om grader celsius till kelvin.
 * F�r in en double celsius som senare adderas med 273.15 och ger tillbaka 
 * grader i kelvin.
 */
	public static double celsiusTokelvin(double celsius) {
		double kelvin;
		kelvin = celsius + 273.15;
		return kelvin;
	}
/**
 * 22
 * R�knar ut densiteten p� ett �mne med en viss massa och volym.
 * F�r in en double mass och en double volume.
 * Dividerar mass med volume och ger tillbaka densiteten.
 */
	public static double Density(double mass, double volume) {
		double density;
		density = mass/volume;
		return density;
	}
/**
 * 23
 * Lagen handlar om hur alla partiklar med en massa kommer att dras mot varandra s� 
 * detta �r en metod som r�knar ut kraften mella tv� objekt.
 * Den f�r in en double m1 f�r f�rsta massan, double m2 f�r den andra massan 
 * och en double distance f�r l�ngden mellan de tv� massorna.
 * Sedan tar den och multiplicerar de b�da massorna med varandra och dividerar det med
 * l�ngden upph�jt till 2, och sist g�nger gravitationskonstanten.
 * Ger tillbaka den kraft som v�rkar mellan dem tv� f�rem�l.
 */
	public static double NewtonsGravitationslag(double m1, double m2, double distance) {
		double F;
		F =  G*((m1 * m2)/Math.pow(distance, 2));
		return F;
	}
/**
 * R�knar ut impuls.
 * f�r in en double force och double deltaT.
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
 * en metod som r�knar ut tyngdaccelerationen p� t.ex jupiter med hj�lp av dess massa, 
 * radie och gravitationskonstanten. 
 * F�r in en double mass och en double distance.
 * F�rst multiplicerar man massan med gravitationskonstanten, sendan tar den distance
 * upph�jt till 2 och tillslut divideras b�da.
 * ger tillbaka tyngdaccelerationen.
 */
	public static double G(double mass, double distance) {
		double Ge;
		Ge = (G * mass)/Math.pow(distance, 2);
		return Ge;
	}
/**
 * 26
 * Detta �r en metod som r�knar ut lyftkraften hos ett f�rem�l.
 * Den tar in densiteten hos en v�tska och volymen p� f�rem�let.
 * Sedan r�knar den ut lyftkraften genom att multiplicera densiteten,
 * tyngaccelerationen och volymen med varandra.
 */
	public static double LyftKraft(FluidTable fluid, double volume) {
		double lyftkraft;
		lyftkraft = fluid.density * g * volume;
		return lyftkraft;
	}
/**
 * 27
 * Denna metod r�knar ut ett f�rem�ls densitet med tv� massor, en utanf�r vatten 
 * och en massa n�r den �r i vatten.
 * 
 */
	public static double DensitetP�EttVistF�rem�l(double mass, double massUnderWater, FluidTable fluid) {
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
