import java.util.ArrayList;
import java.util.LinkedList;

public class Arraylist {
    public static void main(String[] args) {

        String [] cats = new String[3];
        cats = new String[]{"klakier","Garfield","Toby"};

        LinkedList<String> dogs = new LinkedList<>();
        dogs.add("Fafik");
        dogs.add("Tofi");
        dogs.add("Daisy");

        System.out.println(dogs.get(0));

        ArrayList <String> pigs  =  new ArrayList();
        pigs.add("Stacy");
        pigs.add("lucy");
        pigs.add("betany");

        System.out.println(pigs);
    }
}