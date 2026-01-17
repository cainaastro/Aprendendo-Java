package entities2;

public class Information {

	public String name;
	public double gSalary;
	public double tax;
	
	public double tSalary() {
		return gSalary - tax;
		
	}
	public double iSalary (double quantity) {
		return tSalary() + (gSalary * quantity/100); 
	}
	
}
