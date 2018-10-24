package fysik_uppgift;

public enum FluidTable {
	VATTEN(0.998, 4.19, 0, 100, 2260), 
	SVAVELSYRA(1.84, 1.38, 10, 336, 511),
	METANOL(0.791, 1.20, 2.50, )
	
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
