package fysik_uppgift;

import java.util.Scanner;

public class table {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		uppgift 1 
		
		//double volume = 80;
		//System.out.println(bibliotek.volumeToMass(SolidTable.IRON, volume));
		
//		uppgift 2
		double velocity = 2.8;
		double time = 60*60;
		System.out.println(bibliotek.svtDistance(velocity, time));
//		uppgift 3
		double volume = 5;
		double deltaT = 1;
		System.out.println(bibliotek.heat(FluidTable.VATTEN, volume, deltaT));
//		uppgift 4
		double deep = 100;
		System.out.println(bibliotek.pressureUnderWater(deep) + bibliotek.P_0);
	}

}
