package CollectionsDemo;
import java.util.ArrayList;
import java.util.List;
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
	List<Product> listOfProduct=new ArrayList<Product>();
	
	public void addProduct(Product product)
	{
		listOfProduct.add(product);
	}
	public List<Product> getProduct()
	{
		return listOfProduct;
	}
	public Product removeProduct(int productId)
	{
		for(int i=0;i<listOfProduct.size();i++)
		{
			if(productId==listOfProduct.get(i).getProductId())
			{
				Product p=listOfProduct.remove(i);
				return p;
			}
			else {
				System.out.println("The product is not present in the list");
			}
		}
		return null;
	}
	public Product getProductById(int productId)
	{
		for(int i=0;i<listOfProduct.size();i++)
		{
			if(productId==listOfProduct.get(i).getProductId())
			{
				System.out.println("The ProductId you are searching for exists:");
				System.out.println(listOfProduct.get(i).getProductId() + " "+listOfProduct.get(i).getProductName()+ " "+listOfProduct.get(i).getProductPrice());
			}
			else {
				System.out.println("The product is not present in the list");
			}
		}
		return null;
		
	}	
}
public class CollectionsSir3 
{
	public static void main(String[] args)
	{
		ProductBO pbo=new ProductBO();
		Scanner scanner=new Scanner(System.in);
		System.out.println("How may product do you want to save");
		int nop=Integer.parseInt(scanner.nextLine());//5
		for(int i=0; i<nop; i++)
		{
			System.out.println("Enter product id");
			
			int pid=Integer.parseInt(scanner.nextLine());
			System.out.println("Enter product name");
			String pname=scanner.nextLine();
			System.out.println("Enter product price");
			double price=Double.parseDouble(scanner.nextLine());
			Product p=new Product();//obj1, obj2
			p.setProductId(pid);
			p.setProductName(pname);
			p.setProductPrice(price);
			pbo.addProduct(p);
		}
		List<Product> list= pbo.getProduct();
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i).getProductId() + " "+list.get(i).getProductName()+ " "+list.get(i).getProductPrice());
		}
		System.out.println("Enter the Product Id you want to remove");
		int productId=scanner.nextInt();
		Product removed=pbo.removeProduct(productId);
		System.out.println("This is the product id you have removed " + removed.getProductName());
		System.out.println("The Updated Product list is:");
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i).getProductId() + " "+list.get(i).getProductName()+ " "+list.get(i).getProductPrice());
		}
		
		System.out.println("Enter The Product Id you want to search");
		int Id = scanner.nextInt();
		Product search=pbo.getProductById(Id);
	}
}