package Q7;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class productServies {
	@Autowired
	private productRepository productRepository;

	// create operation
	public product place(product s ) {
		return productRepository.save(s);
	}
	//View All products
	public List<product> getAll() {
		return productRepository.findAll();
	}
	
	//View Specific product 
	public product FindbyId(String Id) {
		List<product> s = productRepository.findAll();
		product i = s.stream().filter(p -> (p.getID().equals(Id))).findFirst().get();
		return i;
		
	}

	// update operations
	public product update(product S) {
		String ID = S.getID();
		product product = FindbyId(ID);
		product.setAmountPaid(S.getAmountPaid());
		
		return productRepository.save(product);
	}

	//Delete Specific product 
	public void deleteById(String Id) {
		product product =  FindbyId(Id);
		productRepository.delete(product);
	}

}

