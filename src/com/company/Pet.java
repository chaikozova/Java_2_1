package com.company;

import java.util.Random;

public class Pet extends Shelter {
    private int age;
    private Color color;
    private Shelter shelter;

    public Pet() {

    }

    public Pet(int age, Color color, String adress, String name) {
        super(name, adress);
        this.age = age;
        this.color = color;
    }

    public Pet(Color color, String name, String adress) {
        super(name, adress);
        this.color = color;
    }


    private int generateDefaultAge() {
        Random random = new Random();
        int randInt = random.nextInt(100);
        return randInt;
    }

    public String getInfo () {
        return "Питомец [" +
                "возраст = " + age +
                ", приют = " + shelter.getName() + " " + shelter.getAdress() +
                ", цвет = " + color +
                "]";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = generateDefaultAge();
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
}