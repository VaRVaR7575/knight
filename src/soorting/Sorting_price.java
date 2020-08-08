package soorting;

import equipment.Armor;

import java.util.ArrayList;
import java.util.List;


public class Sorting_price {
    public static ArrayList<String> prices (List<Armor> array, int a, int b){
        ArrayList<String> armorName = new ArrayList<>();
        for (Armor prices : array){
            if (prices.getPrice() > a && prices.getPrice() < b){
                armorName.add(prices.getName());

            }
        }
        return armorName;
    }
}





