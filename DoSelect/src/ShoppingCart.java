import java.util.*;

public class ShoppingCart {

	class Product
	{
		private int id;
		private String name;
		private int quantity;
		private float price;
		Product(int a,String b,int c,float d)
		{
			this.id = a;
			this.name=b;
			this.quantity=c;
			this.price=d;
		}
		public void setId(int a) {
			this.id =a;
		}
		public void setName(String a)
		{
			this.name = a;
		}
		public void setQuantity(int a) {
			this.quantity=a;
		}
		public void setPrice(float a) {
			this.price =a;
		}
		public int getId() {
			return this.id;
		}
		public String getName()
		{
			return this.name;
		}
		public int getQuantity() {
			return this.quantity;
		}
		public float getPrice()
		{
			return this.price;
		}
	}
	class cart
	{
		ArrayList<Product> productList = new ArrayList<Product>();
		public int totalitem()
		{
			int sum=0;
			for(Product i:productList) {
				sum+=i.getQuantity();
			}
			return sum;
		}
		public float netPrice()
		{
			float sum =0;
			for(Product i:productList)
			{
				sum +=i.getQuantity()*i.getPrice();
			}
			return sum;
		}
	}
}
