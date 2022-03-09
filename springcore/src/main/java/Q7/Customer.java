package Q7;



public class Customer  {
	int Customerid;
	String Customername;
	Long CustomerContact;
	Adress adress;

	public int getCustomerid() {
		return Customerid;
	}

	public void setCustomerid(int customerid) {
		Customerid = customerid;
	}

	public String getCustomername() {
		return Customername;
	}

	public void setCustomername(String customername) {
		Customername = customername;
	}

	public Long getCustomerContact() {
		return CustomerContact;
	}

	public void setCustomerContact(Long customerContact) {
		CustomerContact = customerContact;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	/*
	 * public Customer(int customerid, String customername, Long
	 * customerContact,Adress ADress) { super(); Customerid = customerid;
	 * Customername = customername; CustomerContact = customerContact; adress =
	 * ADress; }
	 */
	@Override
	public String toString() {
		return "Customer [Customerid=" + Customerid + ", Customername=" + Customername + ", CustomerContact="
				+ CustomerContact +" Adress="+ adress +"]";
	}

		
	
	
}
