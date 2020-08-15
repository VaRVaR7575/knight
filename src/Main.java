import Knights.Human;
import equipment.Armor;
import equipment.MyArmorFactory;
import service.Sorter;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Armor> armors = MyArmorFactory.createSet("A10", "A11", "A12", "A20", "A21", "A22", "A30", "A31", "A32");
        List<Armor> listArmors = (List<Armor>) armors.values();
        Human human = new Human(25, "Talgat", armors.get("A10"), armors.get("A20"), armors.get("A30"));
        System.out.println(human);
        System.out.println("Сортировка по ебучему весу: " + Sorter.sortByWeight(listArmors));
        System.out.println("Сортировка по цене: " + Sorter.sortByPriceInRange(listArmors, 3000, 8000));
    }
}