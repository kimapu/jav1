package solution.lab11.q3;

public class Product {

	public Product() {
		// TODO Auto-generated constructor stub
	}

	private String id, code, name, desc, cost, retail_price, qty;

	public Product(String id, String code, String name, String desc, String cost, String retail_price, String qty) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.desc = desc;
		this.cost = cost;
		this.retail_price = retail_price;
		this.qty = qty;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getRetail_price() {
		return retail_price;
	}

	public void setRetail_price(String retail_price) {
		this.retail_price = retail_price;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return String.join("|", id, code, name, desc, cost, retail_price, qty);
	}
	
	
	
}
