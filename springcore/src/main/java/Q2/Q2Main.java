package Q2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Q2Main{

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Q2.xml");	      
	    Question qList= (Question) context.getBean("q2List");   
	    System.out.println("\nList Injection\n"+qList);
	    qList.Displayanswer(); 
	   
	    Question qset= (Question) context.getBean("q2Set");  
	    System.out.println("\nSet Injection\n"+qset);
	    qset.Displayanswer(); 
	    
	    Question qMap= (Question) context.getBean("q2Map");  
	    System.out.println("\nMapInjection\n"+qMap.toStringMap());
	    qMap.DisplayanswerM(); 
	    context.close();
	}
}


