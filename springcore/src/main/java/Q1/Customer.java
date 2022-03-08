package Q1;



public class Customer  {
	int Customerid;
	String Customername;
	Long CustomerContact;
	Adress adress;
	public Customer(int customerid, String customername, Long customerContact,Adress ADress) {
		super();
		Customerid = customerid;
		Customername = customername;
		CustomerContact = customerContact;
		adress = ADress;
	}
	@Override
	public String toString() {
		return "Customer [Customerid=" + Customerid + ", Customername=" + Customername + ", CustomerContact="
				+ CustomerContact +" Adress="+ adress +"]";
	}

		
	
	
}
