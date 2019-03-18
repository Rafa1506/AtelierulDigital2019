package Lab1;

public class Book {
    private String name;
    public int price;

    public Book(int price) {
        this.price = price;
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void rentalCost(int numDays) {
        price = numDays * 10;
    }
}
