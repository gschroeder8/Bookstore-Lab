package edu.wctc.isp;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Original Program:\n");

        Product book1 = new HardcoverBook("The Hunger Games", "9780439023528",
                8.79, 12,
                LocalDate.of(2010, Month.JULY, 3),
                "Suzanne Collins", 384);
        Product book2 = new PaperbackBook("A Wrinkle in Time", "9780312367541",
                6.19, 4,
                LocalDate.of(2007, Month.MAY, 1),
                "Madeleine L'Engle", 256);
        Product record = new VinylRecord("Kind of Blue",
                13.54, 18,
                LocalDate.of(2011, Month.APRIL, 12),
                "Miles Davis", Duration.ofMinutes(46));

        System.out.println(book1.toString());
        System.out.println("\n");
        System.out.println(book2.toString());
        System.out.println("\n");
        System.out.println(record.toString());

        System.out.println("\n\nRefactored Program:\n");

        List<Product> products = new ArrayList<>();

        products.add(book1);
        products.add(book2);
        products.add(record);

        for (Product product : products) {
            System.out.println(product.toString());
        }

    }
}
