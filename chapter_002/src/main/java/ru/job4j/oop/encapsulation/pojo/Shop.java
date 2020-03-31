package ru.job4j.oop.encapsulation.pojo;

public class Shop {

    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int i = index; i < products.length-1; i++) {
            products[i] = products[i+1];
        }
        products[products.length - 1] = null;
        return products;
    }

    public static void print(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            Product prods = products[i];
            if (prods != null) {
                System.out.println(prods.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Product products[] = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        print(products);
        print(delete(products, 2));
    }
}
