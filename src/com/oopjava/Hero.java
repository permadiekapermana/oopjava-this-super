package com.oopjava;

public class Hero {
    String name = "Vildred";
    int atkPoint = 120;
    int healthPoint = 1000;
    int deffPoint = 500;

    void showHero(){
        System.out.println("Hero Name : "+this.name);
        System.out.println("Attack Point : "+this.atkPoint);
        System.out.println("Health Point : "+this.healthPoint);
        System.out.println("Defense Point : "+this.healthPoint);
    }
}
