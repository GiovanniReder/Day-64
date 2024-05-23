package entities;

public class Cat extends Animal{

    public Cat(int age, String name) {
        super(age, name);
    }
    public void sayYoureName(){
        System.out.println("Ciao sono un animale e mi chiamo" + this.name);
    }
}
