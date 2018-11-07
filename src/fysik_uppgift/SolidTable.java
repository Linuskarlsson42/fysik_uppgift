package fysik_uppgift;

public enum SolidTable {
	
	ICE(0.92, 2.2, 0, 334),
	IRON(7.87, 0.45, 1538, 276),
	GULD(19.3, 0.13, 327, 24.7),
	URAN(19.1, 0.12, 1135, 53),
	STÅL(7.8, 0.46, 1350, 53),
	ZINK(7.13, 0.39, 420, 117),
	PLATINA(21.5, 0.133, 1768, 113),
	
	;

	double density;
	double heatCapacity;
	double meltPoint;
	double meltEntalpy;
	
	SolidTable(double d, double hc, double sp, double se) {
		density = d * 1E3;
		heatCapacity = hc * 1E3;
		meltPoint = sp;
		meltEntalpy = se * 1E3;
	}
	
}
