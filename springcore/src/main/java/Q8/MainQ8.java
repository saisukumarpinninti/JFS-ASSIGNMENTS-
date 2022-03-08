package Q8;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Collection;

import javax.annotation.PostConstruct;

class Q8 implements InitializingBean,DisposableBean {
	
			int Questionid;
			String Question;
			Collection<String> answers;
			@javax.annotation.PreDestroy
		    private void PreDestroy() {
				System.out.println("PreDestroy Invoked");}
			
			@PostConstruct
		    private void postConstruct() {
				System.out.println("postConstruct Invoked");}
			public void init() throws Exception
		    {
		        System.out.println( "Bean Q8 has been instantiated ");
		    }
			

			public void destroy() throws Exception
		    {
		        System.out.println(
		            "Container has been closed and I'm the destroy() method");
		    }
			
			Q8 (int questionid, String question, Collection<String> answers) {
				Questionid = questionid;
				Question = question;
				this.answers = answers;
			}
			

			void Displayanswer(){
			System.out.println(answers);
			}


			@Override
			public String toString() {
				return "Q8 [Questionid=" + Questionid + ", Question=" + Question + ", answers=" + answers + "]";
			}


			public void afterPropertiesSet() throws Exception {
				 System.out.println(
				            "Bean Coustmer has been instantiated and I'm the init() method");
				    }

	}
public class MainQ8   {
	
		public static void main(String[] args) {
			ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Q8.xml");	      
		    Q8 qList= (Q8) context.getBean("q2List");   
		    System.out.println("\nList Injection\n"+qList);
		    qList.Displayanswer(); 
	
		    Q8 qset= (Q8) context.getBean("q2Set");  
		    System.out.println("\nSet Injection\n"+qset);
		    qset.Displayanswer(); 
		    context.close();
		}
		
		
	}

