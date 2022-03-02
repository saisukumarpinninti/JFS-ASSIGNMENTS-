package Chat.Application;

import java.util.*;

public class Chatroom {
    String Cname;
    String Username;
    static Hashtable<String, ArrayList<String>> cmessages = new Hashtable<>();
    static Hashtable<String, ArrayList<String>> unamelist = new Hashtable<>();

    public Chatroom(String cname) {
        this.Cname = cname;
        unamelist.put(cname, new ArrayList<String>());
        cmessages.put(cname, new ArrayList<String>());
    }

    public static void addUser(String Username, String Cname) {
        ArrayList<String> e = new ArrayList<>();
        if (unamelist.containsKey(Cname)) {
            for (Map.Entry<String, ArrayList<String>> entry : unamelist.entrySet()) {
                if (Objects.equals(entry.getKey(), Cname)) {
                    e = entry.getValue();
                }
            }
        }
        e.add(Username);
        unamelist.replace(Cname, e);
    }

    public static void addmsg(String msg, String Cname) {
        ArrayList<String> e = new ArrayList<>();
        if (cmessages.containsKey(Cname)) {
            for (Map.Entry<String, ArrayList<String>> entry : cmessages.entrySet()) {
                if (Objects.equals(entry.getKey(), Cname)) {
                    e = entry.getValue();
                }
            }
        }
        e.add(msg);
        cmessages.replace(Cname,e);
    }
    public static void DisplayUsers(String Cname) {
        if (unamelist.containsKey(Cname)) {
            for (Map.Entry<String, ArrayList<String>> entry : unamelist.entrySet()) {
                if (Objects.equals(entry.getKey(), Cname)) {
                    System.out.println(entry.getValue());
                }
            }
        }
    }

    public static void Displaymsg(String Cname) {
        if (cmessages.containsKey(Cname)) {
            for (Map.Entry<String, ArrayList<String>> entry : cmessages.entrySet()) {
                if (Objects.equals(entry.getKey(), Cname)) {
                    System.out.println(entry.getValue());
                }
            }
        }

    }
}
