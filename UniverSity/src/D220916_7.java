
public class D220916_7 {

	public static void main(String[] args) {
		final double light_speed = 30e4;
		double distance = 40e12;
		
		double secs = distance/light_speed;
		
		double light_year = secs/(60.0*60.0*24.0*365.0);
		System.out.println("걸리는 시간은 " + light_year + "입니다.");
		
		
	} // end of class

} // end of main
