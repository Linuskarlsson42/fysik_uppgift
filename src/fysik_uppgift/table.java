package fysik_uppgift;

import java.util.Scanner;

public class table {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double volume = input.nextDouble();
		
		System.out.println(bibliotek.volumeToMass(SolidTable.IRON, volume));
		
	}

}
