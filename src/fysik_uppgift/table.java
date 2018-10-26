package fysik_uppgift;

import java.util.Scanner;

public class table {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
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
		int losning = 0;
		for (double i = 10; i > 0.5; ) {
			i = bibliotek.velocityToHeight(bibliotek.fallSpeed(i) - i/100);
			losning++;
		}
				System.out.println(losning);
		
	}

}
