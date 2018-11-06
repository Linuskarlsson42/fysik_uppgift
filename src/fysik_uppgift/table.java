package fysik_uppgift;


public class table {
	public static void main(String[] args) {
		
//		uppgift 1 
		
		System.out.println(bibliotek.volumeToMass(SolidTable.IRON, 0.008));
		
//		uppgift 2
		
		System.out.println(bibliotek.svtDistance(2.8, 3600));
//		uppgift 3
		
		System.out.println(bibliotek.heat(FluidTable.VATTEN, 0.005, 1));
//		uppgift 4
		
		System.out.println(bibliotek.pressureUnderWater(100) + bibliotek.P_0);
//		uppgift 5 
		System.out.println(bibliotek.velocityToHeight(180) + 1.80);
//		uppgift 6
		System.out.println(bibliotek.power(bibliotek.work(740, 100), 4.4));
//		uppgift 7
		int l�sning = 0;
		for (double i = 10; i > 0.5; ) {
			i = bibliotek.velocityToHeight(bibliotek.fallSpeed(i) - i/100);
			l�sning++;
		}
				System.out.println(l�sning);
/**
 * uppgift 8
 * hur mycket 30 grader fahrenheit �r i kelvin 				
 */
		System.out.println(bibliotek.celsiusTokelvin(bibliotek.fahrenheitToCelsius(30)));
/**
 * uppgift 9
 * Vad �r densiteten p� ett f�rem�l med massan 2.64 kg untanf�r och 
 * massan 2.38 i vatten.
 * (ungef�r densitetn p� guld)	
 */
		System.out.println(bibliotek.DensitetP�EttVistF�rem�l(2.64, 2.504, FluidTable.VATTEN));
		
/**
* uppgift 10 
* kraften mellan en stillast�ende bil med massan 1050kg och en man
* som v�ger 150kg som h�ller ett avs�nd med 34 meter fr�n bilen.
* Detta �r d� borts�tt fr�n alla andra krafter.
*/
		System.out.println(bibliotek.NewtonsGravitationslag(1050, 150, 34) + " N");
		

	}

}
