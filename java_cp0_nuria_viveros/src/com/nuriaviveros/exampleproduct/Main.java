package com.nuriaviveros.exampleproduct;

public class Main {

    /**
     * Crear una clase Main
     * Crear 5 productos
     * Crear un array de productos
     *
     */

    public static void main(String[] args) {

        Product product1 = new Product("Champú","Cosmético",5.50D,10D,Boolean.valueOf(false),Boolean.valueOf(false),Boolean.valueOf(false),new Manufacturer("Pantene"));

        Product product2 = new Product("dentífrico","Cosmético",2.35D,0D,Boolean.valueOf(false),Boolean.valueOf(false),Boolean.valueOf(false),new Manufacturer("Colgate"));

        Product product3 = new Product("leche","Alimentación",3.75D,0D,Boolean.valueOf(false),Boolean.valueOf(false),Boolean.valueOf(false),new Manufacturer("Kaiku"));

        Product product4 = new Product("huevos","Alimentación",3.00D,0D,Boolean.valueOf(false),Boolean.valueOf(false),Boolean.valueOf(false),new Manufacturer("Aia"));

        Product product5 = new Product("falda","ropa",20.35D,0D,Boolean.valueOf(false),Boolean.valueOf(false),Boolean.valueOf(false),new Manufacturer("Zara"));

        Product[] products = {product1, product2, product3, product4, product5};



        //Estadísticas
        //Calcular la suma precio total de los productos del array
        Double sumProducts = 0D;
        Double avgPriceProducts = 0D;
        Double maxPriceProducts = 0D;
        if (products != null && products.length >0) {
            Double minPriceProducts = products[0].getPrice();
            for (int i=0; i<=products.length-1; i++ ) {
                if (products[i] != null) {
                    sumProducts += products[i].getPrice();
                    System.out.println(products[i].toString());
                    maxPriceProducts = Double.valueOf(Math.max(maxPriceProducts.doubleValue(),products[i].getPrice().doubleValue()));
                    minPriceProducts = Double.valueOf(Math.min(minPriceProducts.doubleValue(),products[i].getPrice().doubleValue()));
                }
            }
            System.out.println("Total sum of all products: "+sumProducts);
            //Calcular la media de precio de los productos del array
            avgPriceProducts = sumProducts / products.length;
            System.out.println("Average price: "+ avgPriceProducts);
            //Calcular el precio máximo
            System.out.println("Maximun price "+ maxPriceProducts);
            //Calcular el precio minimo
            System.out.println("Minimum price "+ minPriceProducts);
        }

    }



}
