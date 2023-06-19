package inff;

interface Tax{
    //Implement your code here
	double calculateTax(double price);
}

class PurchaseDetails{
    //Implement your code here
	private String purchaseId;
	private String paymentType;
	private double taxPercentage;
	
	PurchaseDetails(String purchaseId,String paymentType){
	 this.purchaseId=purchaseId;
	 this.paymentType=paymentType;
	}

	public String getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public double getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	public double calculateTax(double price) {
		//this.setTaxPercentage(2);
		double total=0;
		if(this.paymentType=="Debit Card") {
			total=price+(price*0.02);
			//this.setTaxPercentage(2);
			//System.out.println(total);
		}
		else if(this.paymentType=="Credit Card") {
			total=price+(price*0.03);
			//this.setTaxPercentage(3);
	}
		else {
			total=price+(price*0.04);
			//this.setTaxPercentage(4);
		}
		
		return total;
	}
}

class Seller{
    //Implement your code here
	private String location;
	private double taxPercentage;
	Seller(String location){
		this.location=location;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	public double calculateTax(double price) {
		double total=0;
		if(this.location.equals("Middle East")) {
			total=price*0.15;
			//this.setTaxPercentage(15);
		}
			else if(this.location.equals("Europe")){
				total=price*0.25;
				//this.setTaxPercentage(25);
			}
			else if (this.location.equals("japan")) {
				total=price*0.12;
				this.setTaxPercentage(12);
			}
			else {
				total=price*0.22;
				this.taxPercentage=22;
			}
		
		return total;
	}
}

class Testee{
    public static void main(String args[]) {
		System.out.println("Purchase Details\n***************");
		PurchaseDetails purchaseDetails = new PurchaseDetails("P1001","Credit Card");
		System.out.println("Total purchase amount: " + Math.round(purchaseDetails.calculateTax(100)*100)/100.0);
		System.out.println("Tax percentage: "+purchaseDetails.getTaxPercentage());

        System.out.println("Seller Details\n***************");
		Seller seller = new Seller("Canada");
		//seller.setTaxPercentage(22);
		System.out.println("Tax to be paid by the seller: " + Math.round(seller.calculateTax(100)*100)/100.0);
		System.out.println("Tax percentage: "+seller.getTaxPercentage());
		
		//Create more objects for testing your code
	}
}