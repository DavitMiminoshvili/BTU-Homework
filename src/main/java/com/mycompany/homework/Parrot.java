/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework;

/**
 *
 * @author PCZONE.GE
 */
public class Parrot implements Bird{
    private String name;
    private Integer age;
    private long weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }
    
    public void parrotSound() {
      System.out.println("Btu magaria (Parrot)");
    }

  

    @Override
    public void fly() {
        System.out.println("mifrinavs chitiiii");
    }
}
