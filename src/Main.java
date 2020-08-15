import Knights.Human;
import equipment.*;
import service.Sorter;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Body A10 = (Body) MyArmorFactory.create("A10");
        Body A11 = (Body) MyArmorFactory.create("A11");
        Body A12 = (Body) MyArmorFactory.create("A12");
        Hands A20 = (Hands) MyArmorFactory.create("A20");
        Hands A21 = (Hands) MyArmorFactory.create("A21");
        Hands A22 = (Hands) MyArmorFactory.create("A22");
        Legs A30 = (Legs) MyArmorFactory.create("A30");
        Legs A31 = (Legs) MyArmorFactory.create("A31");
        Legs A32 = (Legs) MyArmorFactory.create("A32");
        List<Armor> armor = Arrays.asList(A10, A11, A12, A20, A21, A22, A30, A31, A32);
        Human human = new Human(25, "Talgat", A10, A20, A30 );
        System.out.println(human);
        System.out.println("Сортировка по ебучему весу: " + Sorter.sortByWeight(armor));
        System.out.println("Сортировка по цене: " + Sorter.sortByPriceInRange(armor, 3000, 8000));
    }
}