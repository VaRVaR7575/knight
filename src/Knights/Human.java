package Knights;


import equipment.Armor;
import equipment.Body;
import equipment.Hands;
import equipment.Legs;



public class Human {
    int age;
    String name;
    public Body bodies;
    public Hands handss;
    public Legs legss;

    public Human(int age, String name, Armor bodies, Armor handss, Armor legss ) {
        this.age = age;
        this.name = name;
        this.bodies = (Body) bodies;
        this.handss = (Hands) handss;
        this.legss = (Legs) legss;
    }

    public String getName(){

        return name;
    }

    public void setName() {

        this.name = name;
    }

    public int getAge(){

        return age;
    }

    public void setAge(int age){

        this.age = age;
    }

    public Body getBodies(){
        return bodies;
    }

    public Hands getHandss(){
        return handss;
    }

    public Legs getLegss(){
        return legss;
    }


        public String toString() {
            return "My name is " + this.getName() + ". I'm " + this.getAge() + " years old." + " I'm kazakh knight."
                    + " My armor consist: " + this.getBodies() + ", " + this.getHandss() + ", " + this.getLegss();
        }

}
