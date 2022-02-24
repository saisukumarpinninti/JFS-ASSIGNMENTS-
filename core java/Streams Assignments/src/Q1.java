import java.util.ArrayList;
import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Fruit {
    String name;
    int calories;
    int price;
    String color;
    public Fruit(String name, int calories, int price, String color) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
public class Q1 {
    public static List<String> reverseSort(ArrayList<Fruit> fruits) {
        ArrayList<Fruit> rSort = fruits.stream()
                .filter(p -> p.getCalories() < 100)
                .sorted(Comparator.comparingInt(Fruit::getCalories).reversed())
                .collect(Collectors.toCollection(ArrayList::new));
        List<String> rSortNames = new ArrayList<>();
        rSort.forEach(p -> rSortNames.add(p.getName()));
        return rSortNames;
    }

    public static ArrayList<Fruit> sort(ArrayList<Fruit> fruits) {
        fruits=fruits.stream()
                .sorted(Comparator.comparing(Fruit::getColor))
                .collect(Collectors.toCollection(ArrayList::new));
        return fruits;
    }
    public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits){
        fruits=fruits.stream()
                .filter(p->p.getColor().equals("red"))
                .sorted(Comparator.comparingInt(Fruit::getPrice))
                .collect(Collectors.toCollection(ArrayList::new));
        return fruits;
    }

    public static void main(String[] args) {
        ArrayList <Fruit> fList = new ArrayList<Fruit>();
        fList.add(new Fruit("Melon", 230, 50, "green"));
        fList.add(new Fruit("Plantain", 50, 90, "red"));
        fList.add(new Fruit("Cantaloupe", 160, 50, "pink"));
        fList.add(new Fruit("Pomegranate", 70, 60, "red"));
        fList.add(new Fruit("Blackberry", 90, 550, "black"));
        System.out.println("Reverse sort by calories");
        System.out.println(reverseSort(fList)+"\n");
        System.out.println("sort by colour");
        System.out.println(sort(fList)+"\n");
        System.out.println("sort by red colour and price by ascending");
        System.out.println(filterRedSortPrice(fList));
    }


}
