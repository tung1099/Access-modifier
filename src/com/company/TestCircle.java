package com.company;

import java.util.Scanner;

public class TestCircle {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println("Diện tích hình tròn là " + circle.getArea());
    }
}
