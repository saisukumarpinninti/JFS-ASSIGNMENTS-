class Pair <Key,Value>
{
    Key obj1;
    Value obj2;

    public void setKey(Key key)
    {
        this.obj1=key;
    }
    public void setValue(Value value)
    {
        this.obj2=value;
    }

    public void print()
    {
        System.out.println(this.obj1);
        System.out.println(this.obj2+"\n");
    }
}

public class Q4 {
    public static void main(String[] args)
    {
        Pair<String,String> pairA = new Pair<>();
        Pair<String,java.util.Date> pairB = new Pair<>();
        pairA.setKey("1");
        pairA.setValue("Hello");
        pairA.print();

        // B :
        pairB.setKey("Today is : ");
        pairB.setValue(new java.util.Date());
        pairB.print();
    }
}