package com.oopjava;

public class NewHero extends Hero{
    
    String name;
    int atkPoint;
    int healthPoint;
    int deffPoint;

    // super akan mengacu pada class utama yakni hero
    void showHero2() {
        System.out.println("Hero Name : "+super.name);
        System.out.println("Attack Point : "+super.atkPoint);
        System.out.println("Health Point : "+super.healthPoint);
        System.out.println("Defense Point : "+super.healthPoint);
    }

}
