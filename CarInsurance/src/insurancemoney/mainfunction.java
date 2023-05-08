package insurancemoney;

import java.util.Scanner;

public class mainfunction {
	public static void main(String[] args){
	    int b= 1;
	    while (b==1)
	    {
	    	@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Car type of SUV/Sedan/Hatchback:");
	        String ct = sc.nextLine();
	        System.out.println("Enter Car Model of SUV/Sedan/Hatchback:");
	        String cm = sc.nextLine();
	        System.out.println("Enter Car Model Cost Price:");
	        double cc = sc.nextDouble();
 	        System.out.println("Enter Car Insurance Policy Premium or Basics:");
 	        String it = sc.nextLine();
 	        double im=1.00;
	       
	        try
	        {   
	            CheckValid c= new CheckValid();
	            c.CheckValids(ct);
	        } 
	        catch(Exception e)
	        {
	    	     System.out.println(e);
	        }
	        switch(ct)
	        {
	        case "SUV":
	        	SUV suv= new SUV(ct, cm, cc,it,im);
	        	im=suv.insurance(cc,it,im);
	        	System.out.println("Car Model is:");
		        System.out.print(cm);
		        System.out.print(" of total cost of Rs.");
		        System.out.print(cc); 
		        System.out.print(" and total insurance to be paid is");
		        System.out.print(im);
	        	break;
	        case "Sedan":
	            Sedan sedan= new Sedan(ct, cm, cc,it,im);
	        	im=sedan.insurance(cc,it,im);
	        	System.out.println("Car Model is:");
		        System.out.print(cm);
		        System.out.print(" of total cost of Rs.");
		        System.out.print(cc); 
		        System.out.print(" and total insurance to be paid is");
		        System.out.print(im);
	        	break;
	        case "Hatchback":
	        	Hatchback hatchback= new Hatchback(ct, cm, cc,it,im);
	        	im=hatchback.insurance(cc,it,im);
	        	System.out.println("Car Model is:");
		        System.out.print(cm);
		        System.out.print(" of total cost of Rs.");
		        System.out.print(cc); 
		        System.out.print(" and total insurance to be paid is");
		        System.out.print(im);
	        	break;
	        default:
	        	System.out.println(" no match");
	        	continue;
	        	} 
	        
	        System.out.println("Do you want to enter details of any other car (y/n):");
	        char s= sc.next().charAt(0);
	        int x=Character.compare(s, 'y');
	 	    if (x==0)
	 	    {
	 	         b=1;
	 	    }
	 	    else
	 	    {
	 	         b=0;
	 	    }
	    }
}
}
		



