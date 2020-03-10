package com.epam;

import java.util.ArrayList;
import java.util.List;

interface Order {
	String execute();
}

class Stock {
	
	   private String name = "ABC";
	   private int quantity = 10;

	   public String buy(){
	      return "Stock [ Name: "+name+",Quantity: " + quantity +" ] bought";
	   }
	   public String sell(){
	      return "Stock [ Name: "+name+",Quantity: " + quantity +" ] sold";
	   }
}

class BuyStock implements Order {
	
	   private Stock abcStock;

	   public BuyStock(Stock abcStock){
	      this.abcStock = abcStock;
	   }

	   public String execute() {
	      return abcStock.buy();
	   }
}

class SellStock implements Order {
	
	   private Stock abcStock;

	   public SellStock(Stock abcStock){
	      this.abcStock = abcStock;
	   }

	   public String execute() {
	      return abcStock.sell();
	   }
}

class Broker {
   private List<Order> orderList = new ArrayList<Order>(); 

   public void takeOrder(Order order){
      orderList.add(order);		
   }

   public List<Order> placeOrders(){
   
      return orderList;
   }
}

















