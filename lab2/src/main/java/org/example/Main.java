package org.example;

public class Main {
    public String sayHello() {
        return "Hello, BHOS!";
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.sayHello());
    }
}