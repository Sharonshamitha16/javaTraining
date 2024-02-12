package JavaPrograms;

public class Patternprinting {

	public static void main(String[] args) {
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				System.out.print("* ");
				if(i==1) {
					break;
				}
				else if(i==2 && j==2) 
				{
					break;
				}
				else if(i==3) {
					break;
				}
			}
			System.out.println("\n");
		}
	}

}


		