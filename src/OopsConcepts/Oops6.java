package OopsConcepts;


import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

class Product
{
	private int productId;
	private String productName;
	private double productPrice;
	private String productExpryDate;
	
	
	
	
	Product()
	{
		
	}
	
	public Product(int productId, String productName, double productPrice) {
		//this function is used to call overloaded constructor from the same class
		//System.out.println("hi");
		//this("watch");
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	

	public Product(int productId, String productName,double productprice, String expryDate)
	{
		this.productId=productId;
		this.productName=productName;
		this.productPrice=productprice;
		this.productExpryDate=expryDate;
	}
	

	public int getProductId() {
		return productId;
	}
	
	
	
	/*public void setProductId(int productId) {
		this.productId = productId;
	}*/
	public String getProductName() {
		return productName;
	}
	/*public void setProductName(String productName) {
		this.productName = productName;
	}*/
	public double getProductPrice() {
		return productPrice;
	}
	/*public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}*/
	
	
	
	
	
	
}
public class Oops6 {

	public static void main(String[] args) {

  /*Product p=new Product();
  p.setProductId(12);
  p.setProductPrice(456.89);*/
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter product type");
	String pType=scanner.next();
	System.out.println("enter product id");
	int productId=scanner.nextInt();
	System.out.println("enter productName");
	String productName=scanner.next();
	System.out.println("enter product price");
	double productPrice=scanner.nextDouble();
	System.out.println("Enter Date");
	String expryDate=scanner.next();
	
	Product p=new Product();

	if(pType.equals("medicine"))
	{
		Product p1=new Product(productId, productName, productPrice, expryDate);
	}
	else
	{
		Product p2=new Product(productId, productName, productPrice);
	}
	
		
		System.out.println(p.getProductId() + " "+p.getProductName()+ " "+p.getProductPrice());
		

	}

}