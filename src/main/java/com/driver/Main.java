package com.driver;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p = new Product();
        int x = sc.nextInt(), y = sc.nextInt();
        System.out.println(p.product(x , y));

        int z = sc.nextInt();
        System.out.println(p.product(x , y, z));

        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.println(p.product(a , b));

        sc.close();
    }

    public static class Product{
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }
}