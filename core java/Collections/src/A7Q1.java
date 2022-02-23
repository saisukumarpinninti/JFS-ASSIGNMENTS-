import java.util.*;
import java.util.Map.Entry;

class Details implements Comparable<Details>{
    private String name;
    private String email;
    private Gender gender;
    public Details(String name, String email, Gender gender) {
        super();
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Name:"+name+" Email:"+email+" Gender:"+gender;
    }
    @Override
    public int compareTo(Details o) {
        return this.getName().compareTo(o.getName());
    }

}

class phoneNumber implements Comparable<phoneNumber>{
    private long number;
    public phoneNumber(long number) {
        super();
        this.number = number;
    }
    public String toString() {
        return String.valueOf(number);
    }

    @Override
    public int compareTo(phoneNumber o) {
        // TODO Auto-generated method stub
        return this.toString().compareTo(o.toString());
    }


}

public class A7Q1 {

    public static void main(String[] args) {

        // adding details and phone numbers
        Details D1 = new Details("sukumar", "itsnotmymail@gmail.com", Gender.MALE);
        Details D2 = new Details("name2", "name2@gmail.com", Gender.MALE);
        Details D3 = new Details("name3", "name3@gmail.com", Gender.FEMALE);
        phoneNumber P1 = new phoneNumber(9010203540l);
        phoneNumber P2 = new phoneNumber(9234667890l);
        phoneNumber P3 = new phoneNumber(9643534545l);
        // putting them into a treemap
        SortedMap<phoneNumber, Details> phonebook = new TreeMap<>(Comparator.reverseOrder());
        phonebook.put(P1,D1);
        phonebook.put(P2,D2);
        phonebook.put(P3,D3);
        //printing keys
        Set<Entry<phoneNumber,Details>> entrySet = phonebook.entrySet();
        System.out.println("printing all keys ");
        int i = 0;
        for (Entry<phoneNumber, Details> currentEntry :entrySet) {
            System.out.println("Key at " + i + ":"+ currentEntry.getKey());
            i++;
        }
        System.out.println("\n");
        //printing Values
        System.out.println("printing all Values ");
        int i2=0;
        for (Entry<phoneNumber,Details> currentEntry :entrySet) {
            System.out.println("Value at " + i2 + ":"+ currentEntry.getValue());
            i2++;
        }
        System.out.println("\n");

        System.out.println("printing all keys  & their values");
        for (Entry<phoneNumber, Details> entry : phonebook.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        System.out.println("\n");

    }

}