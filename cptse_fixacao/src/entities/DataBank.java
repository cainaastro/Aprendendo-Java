package entities;

public class DataBank {
	
	private int numberAcc;
	private String holderAcc;
	private double balanceAcc;
	
	public DataBank(int numberAcc, String holderAcc) {
		this.numberAcc = numberAcc;
		this.holderAcc = holderAcc;
	}

	public String getHolderAcc() {
		return holderAcc;
	}

	public void setNameAcc(String holderAcc) {
		this.holderAcc = holderAcc;
	}

	public int getNumberAcc() {
		return numberAcc;
	}

	public double getBalanceAcc() {
		return balanceAcc;
	}
	
	public void  addDepositAcc(double depositAcc) {
		balanceAcc += depositAcc;
	}
	
	public void removeDepositAcc(double withdrawAcc) {
		balanceAcc -= withdrawAcc + 5.00;
	}
	
	public String toString() {
		return ("Account " + numberAcc + ", Holder: " + holderAcc + ", Balance: $ " + String.format("%.2f", balanceAcc));
	}
	
	
}
