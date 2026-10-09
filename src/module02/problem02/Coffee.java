package module02.problem02;

public class Coffee {
    public String name;
    public String size;
    public double price;
    private String buyer;

    public void printInfo() {
        System.out.println("Nama Kopi: " + name);
        System.out.println("Ukuran: " + size);
        System.out.println("Harga: Rp. " + price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getBuyer() {
        return buyer;
    }

    public double getTax() {
        double coffeTax = 0.11;

        return price * coffeTax;
    }
}