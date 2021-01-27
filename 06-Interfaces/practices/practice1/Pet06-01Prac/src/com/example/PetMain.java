package com.example;

public class PetMain {

    public static void main(String[] args) {
        Animal a;
        //test a spider with a spider reference
        Spider s = new Spider();
        s.eat();
        s.walk();
        //test a spider with an animal reference
        a = new Spider();
        a.eat();
        a.walk();

        Cat c = new Cat("Tom");
        c.eat();
        c.walk();
        c.play();

        a = new Cat();
        a.eat();
        a.walk();
        Pet p;
        p = new Cat();
        p.setName("Mr whiskers");
        p.play();

        Fish f = new Fish();
        f.setName("Guppy");
        f.eat();
        f.play();
        f.walk();

        a = new Fish();
        a.eat();
        a.walk();

        playWithAnimal(s);
        
        playWithAnimal(c);
        
        playWithAnimal(f);
        
    }

    public static void playWithAnimal(Animal a) {

        if (a instanceof Pet) {
            Pet p = (Pet) a;
            p.play();
        }else{
            System.out.println("Danger! With Animal");
        }
    }

}
