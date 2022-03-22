package Q7;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")

public class product {
	@Id
	String ID;
	String item;
	long AmountPaid;



	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}


	public product() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public product(String iD, String item, long amountPaid) {
		super();
		ID = iD;
		this.item = item;
		AmountPaid = amountPaid;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public long getAmountPaid() {
		return AmountPaid;
	}

	public void setAmountPaid(long amountPaid) {
		AmountPaid = amountPaid;
	}

	

}