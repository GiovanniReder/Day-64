package entities;

 public class Animal {
    // ATTRIBUTI
    protected String name;
    private int age;
    // COSTRUTTORI

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // METODI
    public void sayYoureName(){
        System.out.println("Ciao sono un animale e mi chiamo" + this.name);
    }
}
