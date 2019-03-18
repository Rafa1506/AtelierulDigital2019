package Lab1;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hai noroc cumetre :P ! ");

        Book book = new Book(30);
        System.out.println("The price is " + book.getPrice());
        displayMethods(book);

        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        myAnimal.instanceMethod();
        Animal.classMethod();
        myCat.classMethod();
    }


    public static void displayMethods(Book book) {
        Class c = book.getClass();

        Method[] allMethods = c.getMethods();
        for (Method m : allMethods)
            System.out.println(m);
    }


}