package fysik_uppgift;

public enum FluidTable {
	VATTEN(0.998, 4.19, 0, 100, 2260), 
	SVAVELSYRA(1.84, 1.38, 10, 336, 511),
	METANOL(0.791,2.50,-98,65,1100),
	ETANOL(0.789, 2.43, -117, 78.2, 841),
	KVICKSILVER(13.55, 0.14, -39, 357, 296),
	ACETON(0.790, 2.20, -95, 56, 509),
	TREPENTIN(0.84, 1.75, -10, 180, 293),
	TETRAKLOROMETAN(1.46, 0.96, -85, 87, 239),
	
	;

	double density;
	double heatCapacity;
	double meltPoint;
	double boilPoint;
	double steamEntalpy;
	
	FluidTable(double d, double hc, double sp, double bp, double se) {
		density = d * 1E3;
		heatCapacity = hc * 1E3;
		meltPoint = sp;
		boilPoint = bp;
		steamEntalpy = se * 1E3;
	}

}
