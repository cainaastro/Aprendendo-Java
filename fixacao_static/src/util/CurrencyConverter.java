package util;

public class CurrencyConverter {

	public static double Calc(double dollarp, double dollarb) {
		return (dollarp * dollarb) + ((dollarp * dollarb) * 6/100) ;
	}
	
}
