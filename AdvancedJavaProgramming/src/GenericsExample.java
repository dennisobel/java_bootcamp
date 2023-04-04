import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        // without generics
        List names = new ArrayList();
        names.add("Dennis");
        String name = (String) names.get(0);
        System.out.println("First name: " + name);

        //with generics
        List<String> names2 = new ArrayList();
        names2.add("Obel");
        String name2 = names2.get(0);
        System.out.println("First name: " + name2);
    }
}
