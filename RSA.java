import java.util.Scanner;

class RSA
 {
  public static void main(String args[])
   {
	System.out.println();
    System.out.println("STAY CONNECTED");
	System.out.println();
	
	Scanner scan = new Scanner(System.in) ;
	

	
	int j;                                                        
	System.out.print("Enter the first prime number : ");
	int p = scan.nextInt();
	
	
	for(j=2;j<p;j++)
	{
		if(p%j == 0)
		{
			System.out.println("You are required to enter only prime number");
			System.exit(0);                                         
		}
		
	}
	
	System.out.print("Enter the second prime number : ");           
    int q = scan.nextInt();
	
	
	if(p == q)
	{
		System.out.println("Both the numbers can not be same");      
		 System.exit(0);
	}
	
	for(j=2;j<q;j++)
	{
		if(q%j == 0)
		{
			System.out.println("You are required to enter both as prime number not only 1st");
			System.exit(0);                                            
		}
		
	}
	
	
	System.out.println();
	
	
    int n = p*q;                                                     
	System.out.println("Product comes out to be "+n);
	
	int T= (p-1)*(q-1);                                                 
	System.out.println("Your totient is "+T);
	
	
	
	int e = 2;
	int r1,r2,r;
	int qt; 
	while(e < T)                                                    
	{
		r1 = T;
		r2 = e;                                                
		
		while(r2>0)
	    {
			qt = r1/r2;
			
			r = r1 - qt*r2;                                            
			r1 = r2;
			r2 = r;
		}
		if(r1 == 1)
		{	
			break;
		}
		else
		{
			e = e + 1;
		}   
	  
	}
	System.out.println();
	System.out.println(" Your Encryption Key is : "+e);

	r1 = T;
	r2 = e;
	
	int t,t1,t2;
	t1 = 0;
	t2 = 1;
	
	int d = 1;
	
	while(r2 > 0)
	{
	    qt = r1/r2;
		
	    r = r1 - qt*r2;
	    r1 = r2;
	    r2 = r;
	    
	    t = t1 - qt*t2;
	    t1 = t2;
	    t2 = t;
	    
	    if(r == 1)
	    {
	        d = t;
	        if(d < 0)
	        {
	            d = d+T;
	        }
			break;
	    }
	    
	}
	System.out.println();
	System.out.println(" Your Decryption Key is :"+d);
	
	
	scan.nextLine();                                                       
	
	System.out.println("Enter the message to be encrypted");
	String msg = scan.nextLine();
	
	System.out.println();
	System.out.println("Entered message is \n"+msg);
	
	String s = new String(msg);
 
     
     int c[]= new int[100];
     int l= s.length();
     int i=0;
     
     while(l>0)
     {
        char ch = s.charAt(i);
        int temp = ch;
        
        c[i]=temp;
       
        i++;
        l--;
     }
	
	 
	 Double D = 0d;
	 
	  for(i=0;i<s.length();i++)
	 {
	    c[i] = c[i]-22;
	 }
	 
	
	 for(i=0;i<s.length();i++)
	 {
	    D = D*100 + c[i] ;
	 }
	 
	 System.out.println();
	 System.out.println("Decrypted value "+D );
	 
	 Double D1 = Math.pow(D,e);
	 Double D2 = D1 %  n ;
	 
	 System.out.println(" MOD VERSION IS "+D1);
	 System.out.println(" MOD VERSION IS "+D2);
	 int test = D2.intValue();
	 
	
	 Double D3 = Math.pow(test,d);
	 Double D4 = D3 % n ;
	 
	  System.out.println(" MOD VERSION IS "+D3);
	  System.out.println(" MOD VERSION IS "+D4);
	  

	
   }
 }
	
   
