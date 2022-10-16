package com.company;

import java.util.Scanner;

class Animal{
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak(){

        return "Animal is speaking...";
    }
}

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    @Override
    public String speak() {
        return "The " + this.getName() + " meows ";
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "The " + this.getName() + " barkings ";
    }
}

class Nightingale  extends Animal {
    public Nightingale (String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "The " +this.getName()+ " singing";
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your cat's name:");
        Cat cat1 = new Cat(scanner.nextLine());

        System.out.println("Please enter your dog's name:");
        Dog dog1 = new Dog(scanner.nextLine());

        System.out.println("Please enter your nightingale's name:");
        Nightingale nightingale1 = new Nightingale(scanner.nextLine());


        System.out.println(cat1.speak());
        System.out.println(dog1.speak());
        System.out.println(nightingale1.speak());
    }
}
