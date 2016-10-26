package com.company.Triangle;

public class Triangle {
    private String name;
    private int a;
    private int b;
    private int c;
    private double square;

    public Triangle(String name, int a, int b, int c) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isValid (){
        boolean isValid = false;
        if ((a+b)>c && (a+c)>b && (b+c)>a)
            isValid = true;
        return isValid;
    }

    public String getName() {
        return name;
    }

    public double getSquare (){
        double p = (a+b+c)/2;
        square = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return square;
    }

}
