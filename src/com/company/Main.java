package com.company;


import com.company.model.Product;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");

        Product product = new Product("Keyboard");

        System.out.println(product.getName());
    }
}
