package oops.test;

public  class InvoiceItem {
	private int id;
	private String desc;
	private int qty;
	private double unitPrice;
	
	public InvoiceItem()
	{
		super();
	}
	
	public InvoiceItem(int id, String desc, int qty, double unitPrice) {
		super();
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public double getTotal()
	{
		return this.unitPrice*this.qty;
	}


	@Override
	public String toString() {
		return "InvoiceItem [id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
	}
	
	public static void main(String[] args) {
		InvoiceItem in=new InvoiceItem(45,"Health",25,96.76);
		System.out.println(in);
		System.out.println(in.getTotal());
		
	}



	
	
}
