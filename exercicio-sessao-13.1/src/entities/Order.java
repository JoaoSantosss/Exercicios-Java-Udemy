package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

	
	private Date moment;
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> orderItems = new ArrayList<>();
	
	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getorderItems() {
		return orderItems;
	}

	public void addItem(OrderItem orderItem) {
		orderItems.add(orderItem);
	}
	
	public void removeItem(OrderItem orderItem) {
		orderItems.remove(orderItem);
	}

	public Double total() {
		double total = 0;
		for(OrderItem item : orderItems) {
			total += item.subTotal();
		}
		return total;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: "+ sdf.format(moment) + "\n");
		sb.append("Order Status: " + status + "\n");
		sb.append("Client: " 
		+ client.getName() 
		+ " (" + sdf2.format(client.getBirthDate())
		+ ") - " + client.getEmail() + "\n");
		sb.append("Order items:" + "\n");
		for(OrderItem item : orderItems) {
			sb.append(item.toString() + "\n");
		}
		sb.append("Total price: $" + String.format("%.2f", total()));
		
		return sb.toString();
	}
	
}
