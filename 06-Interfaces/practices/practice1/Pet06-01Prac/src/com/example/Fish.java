/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author dmunguias
 */
public class Fish extends Animal implements Pet{

    private String name;   
    
    public Fish(String name) {
        super(0);
        this.name=name;
    }
    
    
    public Fish(){
    this("Fish00");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Fish eat pond scum");
    }

    @Override
    public void play() {
        System.out.println("Just keep Swimming");
    }

    @Override
    public void walk() {
        System.out.println("Fish of course,caan't walk they swim");
    }
   
}
