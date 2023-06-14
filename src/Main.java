import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
       Map<String,Integer> students = new HashMap<>();
       students.put("Asan",2);
       students.put("Samat",3);
       students.put("Eldan",5);
       students.put("Daniel",4);
       students.put("Samara",3);
       students.put("Roza",2);
       students.put("beranica",5);
        for (Map.Entry<String,Integer>entry:students.entrySet()) {
            System.out.println("Key = " + entry.getKey() + " " + "Value = " +entry.getValue());

        }
    }
}