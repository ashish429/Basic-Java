package insurancemoney;

public class CheckValid {
	public CheckValids(String ct) throws Exception{
	      if (ct.equals("SUV") || ct.equals("Sedan") || ct.equals("Hatchback"))
	      {
	    	    System.out.println("Valid Car Input");
	    	    return;
	      }
	      else
	      {
	    	    throw new Exception("Not a valid Input. Renter input");  
	      }
	  }
}
