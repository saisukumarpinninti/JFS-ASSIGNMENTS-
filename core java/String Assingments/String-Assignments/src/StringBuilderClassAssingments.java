
public class StringBuilderClassAssingments {

	public static void main(String[] args) {
		
// 1) Write an application to append the following strings �StringBuilder�, �is a peer class of String�,
//   �that provides much of �, �the functionality of strings� using a StringBuilder.
		
		StringBuilder q1a = new StringBuilder("StringBuilder");
		System.out.println("Before appending  :"+q1a+"\n");
		
		// appending the first string 
		
		q1a.append(" is a peer class of String");
		System.out.println("after appending 1 :"+q1a+"\n");
		
		// appending the first string 
		
		q1a.append(" that provides much of");
		System.out.println("after appending 2 :"+q1a+"\n");
		
		// appending the first string 
		
		q1a.append(" the functionality of strings�");
		System.out.println("after appending 3 :"+q1a+"\n");
		
// 2) Insert the following string �insert text� into the string �It is used to _ at the specified index position� at the location denoted by the sign _
		
		StringBuilder q2a = new StringBuilder("It is used to  at the specified index position");
		System.out.println("Before inserting  :"+q2a+"\n");
		
		q2a.insert(14, "insert text");
		System.out.println("after inserting  :"+q2a+"\n");
		
// 3) Reverse the following string �This method returns the reversed object on which it was called� using StringBuilder Class
		
				StringBuilder q3a = new StringBuilder("This method returns the reversed object on which it was called");
				System.out.println("Before reversing  :"+q3a+"\n");
				
				q3a.reverse();
				System.out.println("after reversing  : "+q3a+"\n");
			
	}

	
}
