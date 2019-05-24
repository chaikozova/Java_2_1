package com.company;

import java.util.Arrays;

public class Dog extends Pet {

    private String name;
    private String breed;
    private String[] commands;

    public Dog (String name, String breed, String[] commands) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public Dog(String name, String breed, Color color, Shelter shelter) {
        this.breed = breed;
        this.name = name;
        super.setColor(color);
        super.setShelter(shelter);
    }

    public Dog (String name,  String breed, Color color, Shelter shelter, String[] commands) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setColor(color);
        super.setShelter(shelter);
    }

    public Dog() {

    }

    public void makeVoice () {
        System.out.println("Тяв-тяв");
    }

    public void makeVoice (String voice, int number) {
        for (int i = 0; i<number; i++) {
            System.out.print(voice + " ");
        }
        System.out.println();
    }

    public void makeVoice (String voice) {
        System.out.println(voice);
    }

    public void makeVoice (int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("Гав-гав ");
        }
        System.out.println();
    }

    @Override
    public String getInfo () {
        return "Собака [" +
                "кличка = " + name +
                ",порода = " + breed +
                ",команды = " + Arrays.toString(commands) +
                "]" + super.getInfo();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }
}
