package HW4;
import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private static int num = 0;
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.add("Иванов", "87654544");
        pb.add("Петров", "89876744");
        pb.add("Сидоров", "89876543");
        pb.add("Соколов", "89965644");
        pb.add("Кузнецов", "83456543");
        pb.add("Иванов", "89456754");

        for (String x : pb.get("Иванов")) {
            num++;
            System.out.println("Иванов " + num + " телефон: " + x);
        }
    }

    HashMap<String, ArrayList<String>> phoneMap = new HashMap<>();
    public void add(String name, String phone) {

        ArrayList<String> strings = phoneMap.get(name);

        if (strings == null) {
            ArrayList<String> listOfPhones = new ArrayList<>();
            listOfPhones.add(phone);
            phoneMap.put(name, listOfPhones);
        } else {
            strings.add(phone);
            phoneMap.put(name, strings);
        }
    }
    public ArrayList<String> get(String name) {
        return phoneMap.get(name);
    }
}