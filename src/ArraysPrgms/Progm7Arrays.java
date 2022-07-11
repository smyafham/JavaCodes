package ArraysPrgms;

import java.util.Scanner;

class Product
{
	private int productId;
	private String productName;
	private double productPrice;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	
}

class ProductBO
{
	//int[] marks;
	Product[] productList;

	public Product[] getProductList() {
		return productList;
	}

	public void setProductList(Product[] productList) 
	{
		this.productList = productList;
	}
	

	
	
	
}

public class Progm7Arrays {

	public static void main(String[] args) {
		ProductBO  pbo=new ProductBO();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of products");
		int noOfProducts=scanner.nextInt();//5
		Product[] product=new Product[noOfProducts];
		for(int i=0; i<product.length; i++)
		{
        Product p=new Product(); //obj1, obj2  , obj3
        System.out.println("Enter the product id");
        int id=scanner.nextInt();
        System.out.println("Enter the product name");
     String name =scanner.next();
     System.out.println("Enter the product price");
   double price =scanner.nextDouble();
   p.setProductId(id);
   p.setProductName(name);
   p.setProductPrice(price);
   //  0               1                   2
   //[FirstProductObj][secondproductobj][thirdproductPbjecr]
   product[i]=p;

		}
		//call setProductList() method to initialize product array object
pbo.setProductList(product);

// call getProductList() which will return Product[]
   Product[] p=pbo.getProductList();
for(int i=0; i<p.length; i++)
{
	System.out.println(p[i].getProductId() + " "+p[i].getProductName() + " "+p[i].getProductPrice());
}
   
   System.out.println("Enter Product id to search");
   int key=scanner.nextInt();
   int flag=0;
		 for(int i=0;i<p.length;i++) {
			 if(key==p[i].getProductId()) {
				 flag=1;
				 System.out.println(p[i].getProductId()+" "+p[i].getProductName()+" "+p[i].getProductPrice());
				 
			 }
		 }
	 if(flag==0) {
		 System.out.println("Product not present");
	 }
	 
	}

}
