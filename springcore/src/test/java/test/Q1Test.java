package test;
import org.springframework.context.ConfigurableApplicationContext;
import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Q1.Adress;
import Q1.Customer;

public class Q1Test {

	@Test
	public void test() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Q1.xml");
		Customer c1 = (Customer) context.getBean("Customer");
		Adress s1 = (Adress) context.getBean("Adress"); 
		Long l=  9000725889L;
		Customer c2 = new Customer(1,"Sukumar",l,s1);
		assertEquals(c2.toString(),c1.toString());
		context.close();
	}
	
	
	
}
