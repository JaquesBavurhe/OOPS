class Animal{
    String name;

    Animal(){
        System.out.println("this is the default constructor");
    }

    Animal(String name){
        this.name = name;
    }

    void sound(){
        System.out.println(name + " makes sound");
    }

    static void adoptMe(){
        System.out.println("Please adopt this pet"); //static methods cannot be overriden by child class
    }
}

class Dog extends Animal{

    Dog(String dogName){
        super(dogName);
    }

    @Override
    void sound() {

        super.sound(); //this inherits the original sound method from the parent class
        System.out.println(super.name + " says woof");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("cat says meow!");
    }
}

public class petShelter {
    static void main() {
        Dog maltese = new Dog("Rexy");
        maltese.sound();
        System.out.println(maltese.name);
        
    }
}
