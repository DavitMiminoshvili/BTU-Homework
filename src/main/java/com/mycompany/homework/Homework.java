/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.homework;

/**
 *
 * @author PCZONE.GE
 */
public class Homework {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setAge(1);
        dog1.setName("Jessey");
        dog1.setWeight(5);
        dog1.playWith();
        dog1.dogSound();
        
        Parrot parrot1 = new Parrot();
        parrot1.setAge(1);
        parrot1.setName("Kesha");
        parrot1.setWeight(100);
        parrot1.parrotSound();
        parrot1.fly();
    }
}
