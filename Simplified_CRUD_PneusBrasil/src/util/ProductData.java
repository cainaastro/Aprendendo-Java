package util;

public class ProductData {
	
	private String name;
	private double price;
	private int quantity;
	private int codeBar;
	
	public ProductData(String name, double price, int quantity, int codeBar) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.codeBar = codeBar;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getCodeBar() {
		return codeBar;
	}
	public void setCodeBar(int codeBar) {
		this.codeBar = codeBar;
	}
	
	
}
