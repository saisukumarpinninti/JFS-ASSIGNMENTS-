package Q7;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class OrderServies {
	@Autowired
	private OrderRepository orderRepository;

	// create operation
	public Order place(Order s ) {
		return orderRepository.save(s);
	}
	//View All ORders
	public List<Order> getAll() {
		return orderRepository.findAll();
	}
	
	//View Specific ORder 
	public Order FindbyId(String Id) {
		List<Order> s = orderRepository.findAll();
		Order i = s.stream().filter(p -> (p.getID().equals(Id))).findFirst().get();
		return i;
		
	}

	// update operations
	public Order update(Order S) {
		String ID = S.getID();
		Order order = FindbyId(ID);
		order.setAmountPaid(S.getAmountPaid());
		
		return orderRepository.save(order);
	}

	//Delete Specific ORder 
	public void deleteById(String Id) {
		Order order =  FindbyId(Id);
		orderRepository.delete(order);
	}

}

