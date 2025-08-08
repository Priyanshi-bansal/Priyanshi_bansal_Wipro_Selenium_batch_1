package Inheritance;

class Animal {
 String name;

 Animal(String name) {
     this.name = name;
 }

 public void eat() {
     System.out.println(name + " is eating.");
 }

 public void sleep() {
     System.out.println(name + " is sleeping.");
 }

 public void display() {
     System.out.println("Animal Name: " + name);
 }
}

class Bird extends Animal {
 Bird(String name) {
     super(name);
 }

 public void fly() {
     System.out.println(name + " is flying.");
 }

 @Override
 public void display() {
     super.display();
     System.out.println("Type: Bird");
 }
}


class Mammal extends Animal {
 Mammal(String name) {
     super(name);
 }

 public void walk() {
     System.out.println(name + " is walking.");
 }

 @Override
 public void display() {
     super.display();
     System.out.println("Type: Mammal");
 }
}


class Reptile extends Animal {
 Reptile(String name) {
     super(name);
 }

 public void crawl() {
     System.out.println(name + " is crawling.");
 }

 @Override
 public void display() {
     super.display();
     System.out.println("Type: Reptile");
 }
}


public class AnimalTest {
 public static void main(String[] args) {
     Bird bird = new Bird("Parrot");
     Mammal mammal = new Mammal("Elephant");
     Reptile reptile = new Reptile("Snake");

     System.out.println("=== Bird Info ===");
     bird.display();
     bird.eat();
     bird.fly();
     bird.sleep();

     System.out.println("\n=== Mammal Info ===");
     mammal.display();
     mammal.walk();
     mammal.eat();
     mammal.sleep();

     System.out.println("\n=== Reptile Info ===");
     reptile.display();
     reptile.crawl();
     reptile.eat();
     reptile.sleep();
 }
}

