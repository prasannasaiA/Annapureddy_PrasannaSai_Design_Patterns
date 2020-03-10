package com.epam;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	String msg;
    	
    	LOGGER.info("Implementation of Factory Design Pattern from Creational Design patterns");
    	FactoryDesignPattern quadrilateralFactory = new FactoryDesignPattern();
    	Quadrilateral rectangle = quadrilateralFactory.getQuadrilateral("Rectangle");
    	msg = rectangle.draw();
    	LOGGER.info(msg);
    	Quadrilateral square = quadrilateralFactory.getQuadrilateral("Square");
    	msg=square.draw();
    	LOGGER.info(msg);
    	
    	
    	LOGGER.info("\nImplementation of Prototype Design Pattern from Creational Design patterns");
    	EmployeeRecordPrototype employee1 = new EmployeeRecordPrototype(101,"John","Software Engineer",50000);
    	msg=employee1.showRecord();
    	LOGGER.info("Employee Record");
    	LOGGER.info(msg);
    	EmployeeRecordPrototype employee2 = (EmployeeRecordPrototype) employee1.getClone();
    	msg=employee2.showRecord();
    	LOGGER.info("Employee Record");
    	LOGGER.info(msg);
    	
    	
    	LOGGER.info("\nImplementation of Bridge Design Pattern from Structural Design Patterns");
    	Circle redCircle = (Circle) new CircleBridgePattern(100,100,10,new RedCircle());
    	Circle blueCircle = (Circle) new CircleBridgePattern(100,100,10,new BlueCircle());
    	msg=redCircle.draw();
    	LOGGER.info(msg);
    	msg=blueCircle.draw();
    	LOGGER.info(msg);
    	
    	
    	LOGGER.info("\nImplementation of Decorator Design Pattern from Structural Design Patterns" );
    	Shape oval = new Oval();
    	Shape redOval = new RedShapeDecorator(new Oval());
    	Shape redTriangle = new RedShapeDecorator(new Triangle());
    	LOGGER.info("Oval with Normal border");
    	msg=oval.draw();
    	LOGGER.info(msg);
    	LOGGER.info("Oval with red Border");
    	msg=redOval.draw();
    	LOGGER.info(msg);
    	LOGGER.info("Triangle with red Border");
    	msg=redTriangle.draw();
    	LOGGER.info(msg);
    	
    	
    	LOGGER.info("\nImplementation of Command Design Pattern from Behavioral Design Patterns.");
    	Stock abcStock = new Stock();
    	BuyStock buyStockOrder = new BuyStock(abcStock);
    	SellStock sellStockOrder = new SellStock(abcStock);
    	Broker broker = new Broker();
    	broker.takeOrder(buyStockOrder);
    	broker.takeOrder(sellStockOrder);
    	List<Order> orderList = new ArrayList<Order>(); 
    	orderList=broker.placeOrders();
    	for (Order order : orderList) {
            LOGGER.info(order.execute());
         }
    	
    	
    	LOGGER.info("\nImplementation of Mediator Design Pattern from Behavioral Design Patterns");
    	User bob = new User("Bob");
    	User alice = new User("Alice");
    	msg = bob.sendMessage("Hi! Alice....");
    	LOGGER.info(msg);
    	msg = alice.sendMessage("Hello....Bob!!!");
    	LOGGER.info(msg);    	
    	
    }
}
