package hw;

public abstract class MyMath {

	public static final double NA = 6.02214085774e23;
	public static final double b = 0.5;
	
	private static double T;
	private static double t;
	
	
	public static double getOffset(double Temperature, double time) {
		return b*Temperature*time/NA;
	}
	
}
