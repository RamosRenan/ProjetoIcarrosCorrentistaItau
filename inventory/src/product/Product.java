package product;

public class Product {
	// instance fields declarations
	private String 	name;
	private float	price;
	private int		qtd;
	private int		id_product;
	private boolean status;
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

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
		
		displayProduct =  "id_product: "+this.getId_product()+"\n"+"name: "+this.getName()+
				"\n"+"Quantity: "+this.getQtd()+"\n"+"price: "+this.getPrice()+
				"\n"+"Status: "+(this.isStatus() == true ? "Disponivel" : "Indisponivel")+
				"\n"+"Stock value: "+this.valueProduct();
		
		return displayProduct;
	}
	
	public float valueProduct() {
		return (this.getPrice() * (float)this.getQtd());
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
