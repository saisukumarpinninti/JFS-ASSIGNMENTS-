import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Transaction {
    Trader trader; int year; int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", year=" + year +
                ", value=" + value +
                '}';
    }

    public Trader getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }
}

public class Q4 {
    public static List<Transaction> sortTransactions(List <Transaction> transactions) {
        List <Transaction> TranByyear = new ArrayList<>();
        TranByyear = transactions.stream().filter(p -> p.getYear()==2021)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toCollection(ArrayList::new));
        return TranByyear;
    }
    public static List<Integer> transactionsValuesDelhi(List<Transaction> transactions) {
        List <Integer> TranByDelhi = new ArrayList<>();
        transactions.stream().filter(p -> p.getTrader().getCity().equals("Delhi"))
                .forEach(p -> TranByDelhi.add(p.getValue()));
        return TranByDelhi;
    }
    public static int highestTransaction(List<Transaction> transactions){
        int max=0;
        List<Integer> checkmax = new ArrayList<>();
        transactions.stream()
                .forEach(p->checkmax.add(p.getValue()));
        max =Collections.max(checkmax);
        return  max;
    }
    public static int smallestTransaction(List<Transaction> transactions){
        int min=0;
        List<Integer> checkmin = new ArrayList<>();
        transactions.stream()
                .forEach(p->checkmin.add(p.getValue()));
        min =Collections.min(checkmin);
        return  min;
    }

    public static void main(String[] args) {
        // Adding few Traders
        Trader t1 = new Trader("ram", "Bangalore");
        Trader t2 = new Trader("bablu", "Pune");
        Trader t3 = new Trader("basith", "Delhi");
        Trader t4 = new Trader("Raj", "Bhubaneswar");
        Trader t5 = new Trader("harish", "Pune");
        Trader t6 = new Trader("gowrav", "Indore");
        // Adding few Transactions
        Transaction ts1 = new Transaction(t1,2022,3030);
        Transaction ts2 = new Transaction(t2,2021,20300);
        Transaction ts3 = new Transaction(t3,2020,12000);
        Transaction ts4 = new Transaction(t4,2022,40);
        Transaction ts5 = new Transaction(t5,2020,6000);
        Transaction ts6 = new Transaction(t6,2021,3002);
        List<Transaction> Ts = new ArrayList<>();
        Collections.addAll(Ts,ts1,ts2,ts3,ts4,ts5,ts6);
        //System.out.println(Ts);
        System.out.println(sortTransactions(Ts));
        System.out.println(transactionsValuesDelhi(Ts));
        System.out.println(highestTransaction(Ts));
        System.out.println(smallestTransaction(Ts));

    }
}
