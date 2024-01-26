package entities;

public class Product {
	
	private String item;
	private Double price;
	private Integer quantity;

	public Product() {
	}

	public Product(String item, Double price, Integer quantity) {
		this.item = item;
		this.price = price;
		this.quantity = quantity;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Double total() {
		return price * quantity;
	}
	
	public String toString() {
		return item + ", " + total();
	}
	
}
