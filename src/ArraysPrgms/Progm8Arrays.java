package ArraysPrgms;
import java.util.Scanner;

class Products
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

class ProductBOb
{
	//add productList, get ProductList, searchProdcu, updateProdcu, deleteProduct, sort
	//int[] marks;
	Products[] productList;

	public Products[] getProductList() {
		return productList;
	}

	public void setProductList(Products[] productList) 
	{
		this.productList = productList;
	}
	
	 public Products findProductById(int productId)
	 {
		 for(int i=0; i<productList.length; i++)
		 {
			 if(productId==productList[i].getProductId())
			 {
				 return productList[i];
			 }
		 }
		return null; 
	 }
	/*public int deleteProduct(int productId)
	{
		int plen=productList.length;
		for(int i=0; i<productList.length; i++)
		{
			if(productList[i].getProductId()==productId)
			{
			productList[i]=productList[productList.length-1];
			plen--;
			return 1;
			}
		}
		return 0;
	}*/
	
}

public class Progm8Arrays {

	public static void main(String[] args) {
		ProductBOb  pbo=new ProductBOb();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of products");
		int noOfProducts=scanner.nextInt();//100
		//{prod1(id, name, price), prod2(id name price), prdo3}
		Products[] product=new Products[noOfProducts];
		for(int i=0; i<product.length; i++)
		{
        Products p=new Products(); //obj1, obj2  , obj3
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
   Products[] p=pbo.getProductList();
for(int i=0; i<p.length; i++)
{
	System.out.println(p[i].getProductId() + " "+p[i].getProductName() + " "+p[i].getProductPrice());
}
   
   System.out.println("Enter product id");
   int pid=scanner.nextInt();
   
  Products p1= pbo.findProductById(pid);
   if(p1!=null)
   {
	   System.out.println(p1.getProductId() + " "+p1.getProductName() + " "+p1.getProductPrice());
   }
   else
   {
	   System.out.println("Product not avialable");
   }
   
  /*int k= pbo.deleteProduct(pid);
  if(k==1)
  {
	  for(Product pro: pbo.getProductList())
	  {
		  System.out.println(pro.getProductId() + " "+pro.getProductName() + " "+pro.getProductPrice());
	  }
  }*/
   
	}

}