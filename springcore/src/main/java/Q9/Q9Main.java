package Q9;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Collection;

class Q9 implements InitializingBean,DisposableBean {
		int Questionid;
		String Question;
		Collection<String> answers;
	
		public void init() throws Exception
	    {
	        System.out.println( "Bean Q9 has been instantiated ");
	    }
		

		public void destroy() throws Exception
	    {
	        System.out.println(
	            "Container has been closed and I'm the destroy() method");
	    }
		
		Q9 (int questionid, String question, Collection<String> answers) {
			Questionid = questionid;
			Question = question;
			this.answers = answers;
		}
		

		void Displayanswer(){
		System.out.println(answers);
		}


		@Override
		public String toString() {
			return "Q9 [Questionid=" + Questionid + ", Question=" + Question + ", answers=" + answers + "]";
		}


		public void afterPropertiesSet() throws Exception {
			 System.out.println(
			            "Bean Coustmer has been instantiated and I'm the init() method");
			    }

}
public class Q9Main {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Q9.xml");	      
		
	    Q9 qList= (Q9) context.getBean("q2List");   
	    System.out.println("\nList Injection\n"+qList);
	    qList.Displayanswer(); 
	   
	    Q9 qset= (Q9) context.getBean("q2Set");  
	    System.out.println("\nSet Injection\n"+qset);
	    qset.Displayanswer(); 
	    context.close();
	}

}
