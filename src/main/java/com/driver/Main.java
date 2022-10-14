package com.driver;

public class Main {

    public static void main(String[] args) {
        Product p = new Product();
        int ans = p.product(5, 7);
        System.out.println(ans);

        int sans = p.product(6,8,10);
        System.out.println(sans);

        double dAns = p.product(5.6, 7.2);
        System.out.println(dAns);

    }

    public static class Product{

        public int product(int x, int y){
            return (x*y);
        }

        public int product(int x, int y, int z){
            return (x*y*z);
        }

        public double product(double x, double y){
            return (x*y);
        }

    }
}