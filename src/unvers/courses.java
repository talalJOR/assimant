package unvers;

public class courses {
	 private int id ;
	 private String name ;
	 private double price ;
	 
	 
	public courses(int id, String name, double price2) {
		super();
		this.id = id;
		this.name = name;
		this.price = price2;
	}
	@Override
	public String toString() {
		return "courses [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
   
}
