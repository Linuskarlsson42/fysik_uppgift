package fysik_uppgift;

public enum GasTable {
	AIR(1.29, 1.01), 
	O2(1.43, 0.92), 
	KVÄVE(1.25, 1.04),
	HELIUM(0.18, 5.1),
	NEON(0.90, 1.03)
	;

	double density;
	double heatCapacity;

	GasTable(double d, double hc) {
		density = d;
		heatCapacity = hc * 1E3; // 1E3 = 1*10^3
	}

}
