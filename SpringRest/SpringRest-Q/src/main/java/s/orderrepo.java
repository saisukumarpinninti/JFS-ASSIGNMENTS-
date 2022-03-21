package s;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class orderrepo {
	
	@PersistenceContext
	EntityManager em;
	
	public List<order> FindAllorder(){

      TypedQuery<order> a = em.createNamedQuery("find_all_order",order.class);
        return   a.getResultList();
    }
	
	public order findById(int id) {
		return em.find(order.class, id);
	}

	public order addorder(order cust){
        return em.merge(cust);
    }

    public void deleteorder(int id){
         order c = findById(id);
         em.remove(c);
    
    }
  public order updateEmployee(order cust){
        return em.merge(cust);
  }
}
