package s;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class customerrepo {
	
	@PersistenceContext
	EntityManager em;
	
	public List<customer> FindAllCustomer(){

      TypedQuery<customer> a = em.createNamedQuery("find_all_customer",customer.class);
        return   a.getResultList();
    }
	
	public customer findById(int id) {
		return em.find(customer.class, id);
	}

	public customer addCustomer(customer cust){
        return em.merge(cust);
    }

    public void deleteCustomer(int id){
         customer c = findById(id);
         em.remove(c);
    
    }
  public customer updateEmployee(customer cust){
        return em.merge(cust);
  }
}
