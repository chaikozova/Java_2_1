package com.company;

public class Main {

    public static void main(String[] args) {
        Shelter shelter_1 = new Shelter();
        shelter_1.setName("Приют №1");
        shelter_1.setAdress("Советская, 135");

        Shelter shelter_2 = new Shelter("Приют №2", "пр.Мираб 255");

        Dog dog_1 = new Dog();
        dog_1.setAge(5);
        dog_1.setColor(Color.BROWN);
        dog_1.setShelter(shelter_1);
        dog_1.setName("Кристи");
        dog_1.setBreed("Алабай");
        dog_1.setCommands(new String[]{"Сидеть", "Лежать"});

        Dog dog_2 = new Dog("Овчарка", "Пальма", Color.BROWN, shelter_2);
        Dog dog_3 = new Dog("Рэмбо", "Тайган", Color.BLACK, shelter_1, new String[]{"След", "Фас", "Голос"});

        System.out.println(dog_1.getInfo());
        dog_1.makeVoice();
        System.out.println(dog_2.getInfo());
        dog_2.makeVoice(4);
        System.out.println(dog_3.getInfo());
        dog_3.makeVoice("ТЯВ",7);

    }
}
