package fysik_uppgift;


public class table {
	public static void main(String[] args) {
		
//		uppgift 1 
		
		System.out.println(bibliotek.volumeToMass(SolidTable.IRON, 0.008));
		
//		uppgift 2
		
		System.out.println(bibliotek.svtDistance(2.8, 3600));
//		uppgift 3
		
		System.out.println(bibliotek.heat(FluidTable.VATTEN, 5, 1));
//		uppgift 4
		
		System.out.println(bibliotek.pressureUnderWater(100) + bibliotek.P_0);
//		uppgift 5 
		System.out.println(bibliotek.velocityToHeight(50/3.6) + 1.80);
//		uppgift 6
		System.out.println(bibliotek.power(bibliotek.work(740, 100), 4.4));
//		uppgift 7
		int lösning = 0;
		for (double i = 10; i > 0.5; ) {
			i = bibliotek.velocityToHeight(bibliotek.fallSpeed(i) - i/100);
			lösning++;
		}
				System.out.println(lösning);
				
				System.out.println("Egna uppgifter man kan lösa med hjälp av metoderna, 8-10");
/**
 * uppgift 8
 * hur mycket 30 grader fahrenheit är i kelvin 				
 */
		System.out.println(bibliotek.celsiusTokelvin(bibliotek.fahrenheitToCelsius(30)));
/**
 * uppgift 9
 * Vad är densiteten på ett föremål med massan 2.64 kg untanför och 
 * massan 2.38 i vatten.
 * (ungefär densitetn på guld)	
 */
		System.out.println(bibliotek.DensitetPåEttVisstFöremål(2.64, 2.504, FluidTable.VATTEN));
		
/**
* uppgift 10 
* kraften mellan en stillastående bil med massan 1050kg och en man
* som väger 150kg som håller ett avsånd med 34 meter från bilen.
* Detta är då bortsätt från alla andra krafter.
*/
		System.out.println(bibliotek.NewtonsGravitationslag(1050, 150, 34) + " N");
		
		
		
		
		System.out.println("test med nya metoder");
/**
 * Test för att se om metoder fungerar
 * Hur mycket kraft behöver man för att lyfta upp ett föremål med en vikt på 12kg
 * och som rymmer 3 liter (omvandlat i m3) under vatten
 * en stöt mella två objekt med massa 0.8, 0.4 och hastighet 1.5, -1.5
 * Hur isbit som väger 20g och har temperaturen -18C påvärkar en läsk som rymmer
 * 0.33cl och har en temperatur på 20C.
 * 	
 */
		System.out.println(bibliotek.KraftFörLyfting(12, 0.003, FluidTable.VATTEN));
		System.out.println(bibliotek.ElastiskStöt(0.8, 0.4, 1.5, -1.5));
		System.out.println(bibliotek.Medelacceleration(bibliotek.delta(5, 10), bibliotek.delta(0, 20)));
		System.out.println(bibliotek.Blandningstemp(0.33, 0.02, 20, -18, FluidTable.VATTEN, SolidTable.ICE));
		
		
		
	}

}
