package insurancemoney;
public class SUV extends Car{
	public SUV(String ct,String cm,double cc, String it, double im) {
		super(ct,cm,cc, it, im);
		// TODO Auto-generated constructor stub
	}
	public double insurance(double cc,String it,double im)
	{   double a=0.10;
	    double b=1.20;
		if (it.equals("Premium"))
        {
            im=cc*a*b;
        }
        else
        {
        	im=cc*a;
        }
		return im;
	}
}
