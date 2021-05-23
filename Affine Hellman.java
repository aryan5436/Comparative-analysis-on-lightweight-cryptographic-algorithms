import java.util.Scanner;

class Affine_Cipher
{
 public static void main(String args[])
 {
	 System.out.println("Stay Connected");
	 System.out.println();
	 
	 Scanner scan = new Scanner(System.in);
	 
	
	int N = 26;
	System.out.println(" Choose a key pair now");
	
	System.out.println("Enter a key for Multiplicative Inverse ");
	int M = scan.nextInt();
	
	int r,r1,r2;
	r1=N;
	r2=M;
	
	int t,t1,t2;
	t1=0;
	t2=1;
	
	int q, M1 =-1;
	
	while(r2>0)
	{
	    q=r1/r2;
		
	    r=r1-q*r2;
	    r1=r2;
	    r2=r;
	    
	    t=t1-q*t2;
	    t1=t2;
	    t2=t;
	    
	     if(r == 1)
	    {
	         M1 = t;
	         if(M1 < 0)
	         {
	             M1 = M1 + N;
	         }
	    }
	    
	}
        
	if(r1 != 1)
	{
	 System.out.println("Enter a valid key");
	 System.exit(0);
	}
	
	
	

	
	System.out.println("Enter a key for Additive Inverse ");
	int A = scan.nextInt();
	
	if(A >= 26 && A<0)
	{
		System.out.println("Invalid Additive Key");
		System.exit(0);
	}
	
	System.out.println("Key value pair is : ("+M+","+A+").");
	
	
	
	
	System.out.println("Enter the message ");
	
	scan.nextLine();
	String msg = scan.nextLine();
	
	 int l= msg.length();
	 int k = l;
	 int c[]= new int[k];
     int i=0;
     
     while(l>0)
     {
        char ch = msg.charAt(i);
        int temp = ch;
        
        c[i]=temp;
       
        i++;
        l--;
     }
	 
	
	  for(i=0;i<msg.length();i++)
	 {
	    c[i] = c[i]-65;
	 }
	
	 int c1[]= new int[k];
	 int temp;
	 int tempo;
	 
	 for(i=0;i<msg.length();i++)
	 {
	    temp = c[i] * M;
		tempo = temp + A;
		c1[i] = tempo % N;	
	 }
	 
	
	 
	 char c2[]= new char[k];
	  int tem;
	  for(i=0;i<msg.length();i++)
	 {
		tem = c1[i]+65;
	    c2[i] = (char) tem;
	 }
	 
	 String encrypt =  new String (c2);
	 System.out.println();
	 System.out.println("YOUR ENCRYPTED MESSAGE IS : "+encrypt);
	 
	
	 int len= encrypt.length();
	 int ken  = len;
	 int d[]= new int[ken];
     int j=0;
    
     while(len>0)
     {
        char ch = encrypt.charAt(j);
        int remp = ch;
        
        d[j]=remp;
       
        j++;
        len--;
     }
	 
	   for(j=0;j<encrypt.length();j++)
	 {
	    d[j] = d[j]-65;
	 }
	
	  
	 int d1[]= new int[ken];
	 int remp ;
	 int rempo;
	 
	 int x,y;
	 
	 for(j=0;j<encrypt.length();j++)
	 {
	    remp = d[j] - A;
		if(remp < 0)
		{
			x = remp + N; 
		}
	    else
		{
		    x = remp % N;
		}
		rempo = M1 % N;
		y = x*rempo;
		if(y < 0)
		{
			d1[j] = y + N; 
		}
	    else
		{
		d1[j] = y % N;
		}		
	 }
	

	 
	 char d2[]= new char[ken];
	  int rem;
	  for(j=0;j<encrypt.length();j++)
	 {
		rem = d1[j]+65;
	    d2[j] = (char) rem;
	 }
	 
	 String decrypt =  new String (d2);
	 System.out.println("YOUR DECRYPTED MESSAGE IS : "+decrypt); 
 }
}

    
	
