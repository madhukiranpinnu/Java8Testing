package SupplierDemo;

import java.util.function.Supplier;

public class Example {
    public static void main(String args[]){
        Supplier<Double> supplier =()->Math.random();

        System.out.println(supplier.get());
    }

}
