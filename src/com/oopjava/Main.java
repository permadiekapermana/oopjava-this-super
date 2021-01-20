package com.oopjava;

public class Main {
    public static void main(String[] args) {
        // akan menampilkan method showHero dari class hero
        Hero hero1 = new Hero();
        hero1.showHero();
        System.out.println();

        // akan menampilkan method showHero dari class hero
        NewHero hero2 = new NewHero();        
        hero2.showHero();
        System.out.println();

        // mencoba mengubah nama hero jadi "Naruto"
        hero2.name = "Naruto";
        hero2.showHero2();
        System.out.println();
        // hasilnya akan tetap Vildred karena method pada class NewHero masih mengacu pada super, yakni class Hero bukan class NewHero

        System.out.println(hero2.name);

    }
}
