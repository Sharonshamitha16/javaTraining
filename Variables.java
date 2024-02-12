package JavaPrograms;
public class Variables {
	public static void main ( String args[]) {
		int ticketPrice;
		ticketPrice =80;
		int hex = 0x10;// hex conversion to decimal
		int bin = 01010;// bin conversion to decimal
		char c = '0'; // single 
		float pi =  (float)31459e-05;
		float pi1= (float)3.1459;// byte= 4
		double d = 	12;// byte= 8
		int n = 0;// byte= 4
		byte b= 20;// byte = 1
		n=b;// Implicit or automatic type conversion
		int s =9;
		byte a = 0;
		s=(byte)a;//explicit or automatic type conversion
		System.out.println("double value is" +d);
		System.out.println(" float given as expression" +pi);
		System.out.println("float given in point "+ pi1);
		System.out.println( "\"ticket price meantioned\" "+ticketPrice);
		System.out.println( "implicit type change" +n);
		System.out.println( "explicit type change" +s);
		System.out.println(hex);
		System.out.println( bin);
		System.out.println("char = " +c);
		
		
	}

}
