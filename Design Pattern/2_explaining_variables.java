import java.util.ArrayList;

class Product {

	private String name = "";
	private double price = 0.0;
	private double shippingCost = 0.0;
	private int quantity = 0;
	
	public String getName(){ return name; }
	public double getPrice(){ return price; }
	public double getShippingCost(){ return shippingCost; }
	public int getQuantity(){ return quantity; }
	
	Product(String name, double price, double shippingCost, int quantity){
		
		this.name = name;
		this.price = price;
		this.shippingCost = shippingCost;
		this.quantity = quantity;
		
	}
	
	public double getTotalCost(){
	    
	    
	    final boolean over50Products =(quantity > 50) || ((quantity * price) > 500);
	    final boolean over25Products =(quantity > 25) || ((quantity * price) > 100);
	    final boolean over10Products =(quantity >= 10) || ((quantity * price) > 50);
	    
	    
//	    Bad code 1
		
		double quantityDiscount=0.0;
		
		if(over50Products) {
			
			quantityDiscount = .10;
			
		} else if(over25Products) {
			
			quantityDiscount = .07;
			
		} else if(over10Products) {
			
			quantityDiscount = .05;
			
		}

		double discount = ((quantity - 1) * quantityDiscount) * price;
		
		return (quantity * price) + (quantity * shippingCost) - discount;
		
	}
	
	
}






public class Store {
	
	public ArrayList<Product> theProducts = new ArrayList<Product>();
	
	public void addAProduct(Product newProduct){
		
		theProducts.add(newProduct);
		
	}
	
	public void getCostOfProducts(){
		
		for(Product product : theProducts){
			
			// You can also use an explaining variable for complicated calculations
			// It may however be better to extract this code into a method though
			// to separate it from the method
			
			// final is used to make sure the temp only has 1 value per iteration
			// It is bad practice to assign different values to a temp
			

			
			final String productName=product.getName();
			final int numberOfProducts=product.getQuantity();
			final double productTotalCost=product.getTotalCost();
			final double costPerProductWithDiscount=productTotalCost/ numberOfProducts;
			final double costPerProductWithoutDiscount =product.getPrice() + product.getShippingCost();
			final double Savings = costPerProductWithoutDiscount-costPerProductWithDiscount;
			
			
			System.out.println("Total cost for " + numberOfProducts + " " + productName + "s is $" + productTotalCost);
			
			System.out.println("Cost per product " + costPerProductWithDiscount);
			
			System.out.println("Savings per product " + Savings + "\n");
			
			
		}
		
	}
	
	public static void main(String[] args){
		
		Store cornerStore = new Store();
		
		cornerStore.addAProduct(new Product("Pizza", 10.00, 1.00, 52));
		
		cornerStore.addAProduct(new Product("Pizza", 10.00, 1.00, 26));
		
		cornerStore.addAProduct(new Product("Pizza", 10.00, 1.00, 10));
		
		cornerStore.getCostOfProducts();
		
	}
	
	// BAD CODE 3
	// Why Is it Bad to Assign Many Values to a Temp?
	
	/*
	double temp = totalCost / numberOfProducts;
	
	temp = temp + shipping;
	
	// temp may be the product price + shipping - discount
	// but will this make sense a year from now?
	
	temp = temp - discount;
	*/
	
	
	
	// BAD CODE 4
	// Don't assign values to parameters either
	/*
	public double getTotPrice(double quantity, double price, double shippingCost, double discount) {
		
		price = price + shippingCost;
		price = price * quantity;
		return price - discount;
		
	}
	*/

}
