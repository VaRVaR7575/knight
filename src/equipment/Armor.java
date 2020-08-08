package equipment;

public class Armor {
    int price;
    int weight;
    String name;

    public Armor(int price, int weight, String name){
        this.price = price;
        this.weight = weight;
        this.name = name;

    }
    public String getName(){

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getPrice(){

        return price;
    }

    public void setPrice(int price){

        this.price = price;
    }

    public int getWeight(){

        return weight;
    }

    public void setWeight(int weight){

        this.weight = weight;
    }
    public String toString(){
        return this.getName() + ", вес которых: " + this.getWeight() + "кг и цена: " + this.getPrice() + "рублей";
    }
}

