package JavaPrograms;
public class Patternprinting_continue {
public static void main(String[] args) 
   {
	outerloop:
	    	for (int i=0;i<5;i++)
	    	{ 
	    		for (int j=0;j<5;j++) 
	    		{
	    			
	    			if(i==1&&j==1||i==2&j==3||i==3&&j==1) 
	    				{
	    				System.out.print("\n");
	    				continue outerloop;
	    				 }
	    		System.out.print(i);		
	    		}
	    		System.out.println(" ");	
	    	}
	         	
	    }
	    

}

