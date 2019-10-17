package com.adc;

public class Main {

    public static void main(String[] args) {

        BookShelf shelf = new BookShelf(10);
        System.out.println("shelf size: " + shelf.size());

        Book book1 = new Book("Scala编程");
        Book book2 = new Book("图解TCP");
        Book book3 = new Book("图解设计模式");
        Book book4 = new Book("Java编程思想");

        shelf.add(book1);
        shelf.add(book2);
        shelf.add(book3);
        shelf.add(book4);

        System.out.println("shelf size: " + shelf.size());


        final Iterator<Book> iterator = shelf.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }



    }
}
