package equipment;


import java.util.HashMap;
import java.util.Map;

public class MyArmorFactory {
    public static Armor createArmorByType(String typeofArmor){

        switch (typeofArmor){
            case "A10": return new Body(5000,30,"Латы Путина");
            case "A11": return new Body(6000,40,"Латы Кадырова");
            case "A12": return new Body(7000,50,"Латы Братков");

            case "A20": return new Hands(500,2,"Наручи Путина");
            case "A21": return new Hands(700, 4,"Наручи Кадырова");
            case "A22": return new Hands(900,6,"Наручи Братков");

            case "A30": return new Legs(1000,10, "Наголенники Путина" );
            case "A31": return new Legs(2000,15,"Наголенники Кадырова");
            case "A32": return new Legs(3000, 20, "Наголенники Братков");
            default: return null;

        }
    }

    public static Map<String, Armor> createSet (String... typesOfArmor) {
        Map<String, Armor> armors = new HashMap<>();
        for (String type : typesOfArmor) {
            armors.put(type, createArmorByType(type));
        }
        return armors;
    }
}
