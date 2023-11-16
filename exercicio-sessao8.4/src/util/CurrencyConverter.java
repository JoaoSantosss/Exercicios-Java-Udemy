package util;

public class CurrencyConverter {
	
	public static double convertRealToDollar(double dollarPrice, double dollarBought) {
		
		double iof = (dollarPrice * dollarBought) * 0.06;
		double amountToBePaid = dollarPrice * dollarBought + iof;
		
		return amountToBePaid;
		
	}

}
