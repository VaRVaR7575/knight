package soorting;


import java.util.Comparator;

import equipment.Armor;


public class Sorting_Weight implements Comparator<Armor> {
    @Override
    public int compare(Armor o1, Armor o2){
        return o1.getWeight() - o2.getWeight();
    }






}
