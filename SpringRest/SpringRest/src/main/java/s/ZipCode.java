package s;

public class ZipCode {
	private int Id;
	   private String city;
	    private String state;
	    private String country;
	    public String getCity() {
	        return city;
	    }

	    public ZipCode() {
		
		}

		public ZipCode(int id, String city, String state, String country) {
			super();
			Id = id;
			this.city = city;
			this.state = state;
			this.country = country;
		}

		public int getId() {
			return Id;
		}

		public void setId(int id) {
			Id = id;
		}

		public void setCity(String city) {
	        this.city = city;
	    }

	    public String getState() {
	        return state;
	    }

	    public void setState(String state) {
	        this.state = state;
	    }

	    public String getCountry() {
	        return country;
	    }

	    public void setCountry(String country) {
	        this.country = country;
	    }
}
