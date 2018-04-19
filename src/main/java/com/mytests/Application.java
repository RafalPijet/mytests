package com.mytests;

public class Application {


    public static void main(String[] args) {
        String triangleName = "abc";
        Triangle triangle = new Triangle(triangleName);
        System.out.println(triangle.name);
        triangleName = "hgj";
        System.out.println(triangle.name);
    }
}
