package com.driver;

public class Main {

    public static void main(String[] args) {
        Product p = new Product();
        int ans = p.product(4, 10);
        System.out.println(ans);

        ans = p.product(2,2,2);
        System.out.println(ans);

        double dAns = p.product(10.00, 10.00);
        System.out.println(dAns);

    }

    public static class Product{

        public static int product(int x, int y){
            return (x*y);
        }

        public static int product(int x, int y, int z){
            return (x*y*x);
        }

        public static double product(double x, double y){
            return (x*y);
        }

    }
}