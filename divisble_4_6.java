package JavaPrograms;
  public class divisble_4_6 
  {
	  public static void main(String[] args) 
	  {
	   int n= 100, i=1;
		  /*	for(i=1;i<=n;i++)
		  {
		  		if (i%4==0 && i%6==0)
		  		{
		  			System.out.println("The numbers present btw 100 which is divisble by 4 and 6 are:"+i);
		  		}
     	}

	}

}*/
while(i<=n) {
	if (i%4==0 && i%6==0)
		{
			System.out.println("The numbers present btw 100 which is divisble by 4 and 6 are:"+i);
			//continue;
		}
	i++;
}
}
	  }