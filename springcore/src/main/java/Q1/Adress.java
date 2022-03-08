package Q1;

public class Adress {
	String street;
	String city;
	String state;
	String zip;
	String country;
	public Adress(String street, String city, String state, String zip, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Adress [street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country="
				+ country + "]";
	}
	
}
