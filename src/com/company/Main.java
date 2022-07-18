package com.company;

public class Main {

    public static void main(String[] args) {
	// Animal a1 = new Animal ();
	 Animal a2 = new Animal ("White");
	 Cat cat = new Cat ();
	 cat.color = "blue";
	 // java в неявном виде наследует класс Object  в  каждый пользовательский класс
		System.out.println(cat);
		System.out.println(a2);

		System.out.println(cat.hashCode());
		Cat cat2= new Cat ();
		Cat cat3= new Cat ();
		cat2.color = "blue";
		cat2=cat;
		System.out.println(cat.equals(cat));// true
		System.out.println(cat.equals(cat2));// true
		System.out.println(cat.equals(cat3));// false
		System.out.println(cat.equals("mu-mu"));// false

    }
}
