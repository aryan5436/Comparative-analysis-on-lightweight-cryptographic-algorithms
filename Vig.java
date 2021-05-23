import java.util.Scanner;

class Vig
{
 public static void main(String args[])
 { 
     long StartTime = System.currentTimeMillis();                                       
	 long before = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory(); 
	 
	 
	 System.out.println(" Stay Connected");
	 System.out.println();
	 
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.print("Enter the message : ");
	
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
	    c[i] = c[i]-97;
	 }
	
	 
	 System.out.println();
	  
	  
	 System.out.print("Enter the key to be used : ");
	
	String key = scan.nextLine();
	
	 int lk= key.length();
	 int kk = lk;
	 int ck[]= new int[kk];
     i=0;
     
     while(lk>0)
     {
        char ch = key.charAt(i);
        int temp = ch;
        
        ck[i]=temp;
       
        i++;
        lk--;
     }
	 
	    for(i=0;i<key.length();i++)
	 {
	    ck[i] = ck[i]-97;
	 }
	   
	 {
	    System.out.println(ck[i]);
	 }
          for(i=0;i<msg.length();i++)
	 {
	    System.out.println(c[i]);
	 }
	 
	 
	 
	 long StartTimeE = System.currentTimeMillis();                                       
	 long beforeE = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory(); 
	 for(i=0;i<msg.length();i++)
	 {
		 int n = i/key.length();                                           
		 int temp = i - n*key.length() ;
		 c[i] = c[i] + ck[temp];
	 }
	 
	/* for(i=0;i<msg.length();i++)
	 {
	    System.out.println(c[i]);
	 } */
	 
	 char c1[]= new char[k];
	 int tem;
	  for(i=0;i<msg.length();i++)
	 {
		tem = c[i]+97;
	    c1[i] = (char) tem;
	 }
	 
	 String encrypt =  new String (c1);
	 System.out.println();
	 System.out.println("YOUR ENCRYPTED MESSAGE IS : "+encrypt);
	 
	 long EndTimeE = System.currentTimeMillis();                                                
     long afterE = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();       
		
		long DurationE = EndTimeE - StartTimeE;
		long actualE = afterE - beforeE;
		
		
		
	  long StartTimeD = System.currentTimeMillis();                                        
	  long beforeD = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory(); 
	  
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
	    d[j] = d[j]-97;
	 }
	 
	  for(j=0;j<encrypt.length();j++)
	 {
		 int nd = j/key.length();                                           
		 int temp = j - nd*key.length() ;
		 d[j] = d[j] - ck[temp];
	 }
	/*  for(j=0;j<encrypt.length();j++)
	 {
	    System.out.println(d[j]);
	 } */
	 
	 char d1[]= new char[ken];
	  int rem;
	  for(j=0;j<encrypt.length();j++)
	 {
		rem = d[j]+97;
	    d1[j] = (char) rem;
	 }
	 
	 String decrypt =  new String (d1);
	 System.out.println("YOUR DECRYPTED MESSAGE IS : "+decrypt);
	 
	  long EndTimeD = System.currentTimeMillis();                                                
	 long afterD = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();      
		
		long DurationD = EndTimeD - StartTimeD;
		long actualD = afterD - beforeD;
		

        long EndTime = System.currentTimeMillis();                                                 
		long after = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();      
		
		long Duration = EndTime - StartTime;
		long actual = after - before;
		
		
		
		System.out.println();
		System.out.println("Total time taken is :" + Duration+" ms");
		System.out.println("Total space taken is :" + actual+" bytes");	 
		
		System.out.println();
		System.out.println("Total time taken in Encryption is :" + DurationE+" ms");
		System.out.println("Total space taken in Encryption is :" + actualE+" bytes");	
		
		System.out.println();
		System.out.println("Total time taken in Decryption is :" + DurationD+" ms");
		System.out.println("Total space taken in Decryption is :" + afterD+" bytes");	
		
	/*  System.out.println();
		System.out.println("Total space taken in Decryption is :" + afterD+" bytes");	
		System.out.println("Total space taken in Decryption is :" + beforeD+" bytes"); */

     /* System.out.println();
		System.out.println("Total space taken in Decryption is :" + afterE+" bytes");	
		System.out.println("Total space taken in Decryption is :" + beforeE+" bytes");	*/	
	 
 }
}
	 
