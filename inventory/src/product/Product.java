package product;

public class Product {
	// instance fields declarations
	public String 	name;
	public float	price;
	public int		qtd;
	public int		id_product;
	
	// without parameters
	public Product() {
		
	}// final constructor
	
	// constructor with parameters
	public Product(String name, Float price, Integer qtd, Integer id_product) {
		this.name  		= name;
		this.price 		= price;
		this.qtd 		= qtd;
		this.id_product	= id_product;
	}// final constructor Product
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		String displayProduct = "";
		
		displayProduct =  "id_product: "+this.getId_product()+"\n"+"name: "+this.getName()+"\n"+"Quantity: "+this.getQtd()+"\n"+"price: "+this.getPrice();
		
		return displayProduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

	public Integer getId_product() {
		return id_product;
	}

	public void setId_product(Integer id_product) {
		this.id_product = id_product;
	}
	
	
}// final class Product
