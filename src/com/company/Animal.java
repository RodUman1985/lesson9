package com.company;

public class Animal {
    public String color;
    //дефолтный конструктор
   //public Animal () {};
  // если в классе рписутствует хотя бы один конструктор отличный от дефолтного,
  // то дефолтный конструктор добавляться автоматически не будет не будет.
    public Animal (String color) {
        this.color = color;
    }
}
