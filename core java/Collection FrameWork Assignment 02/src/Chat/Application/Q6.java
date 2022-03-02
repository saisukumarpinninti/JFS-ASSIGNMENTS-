package Chat.Application;
import java.util.Scanner;

public class Q6 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
       Q6.start();
    }
    public static void start() throws Exception {
        int i = 1 ;
        while (i>0) {
            System.out.println("Please Choose your Option \n 1. Create a chatRoom");
            System.out.println(" 2. Add the user \n 3. UserLogin \n 4. Send a Message \n 5. Display Messages From Specific chat room");
            System.out.println(" 6. List down all users belonging to the specified chat room. \n 7. Logout \n 8. Delete an user \n 9. Delete the chat room.");
            int option1 = sc.nextInt();
            try {
                if (option1 < 10) {
                    if (option1 == 1) {
                        System.out.println("please Enter the new Chatroom name");
                        String cname = sc.next();
                        new Chatroom(cname);
                    }
                    else if (option1 == 2) {
                        System.out.println("please Enter the new user name");
                        String s = sc.next();
                        System.out.println("please Enter the chatroom name");
                        String cs = sc.next();
                        Chatroom.addUser(s, cs);
                    }
                    else if (option1 == 4) {
                        System.out.println("please Enter the message");
                        String s = sc.next();
                        System.out.println("please Enter the chatroom name");
                        String cs = sc.next();
                        Chatroom.addmsg(s,cs);
                    }
                    else if (option1 == 5) {
                        System.out.println("please Enter the chatroom name");
                        String cs = sc.next();
                        Chatroom.Displaymsg(cs);
                    }
                    else if (option1 == 6) {
                        System.out.println("please Enter the chatroom name");
                        String cs = sc.next();
                        Chatroom.DisplayUsers(cs);
                    }
                } else throw new Exception("Invalid Option");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
