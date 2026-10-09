package module02.problem01;

public class Fruit {
    private String  name;
    private double  weight;
    private double  price;
    private double purchaseAmount;
    private double pricePerKg;

    public Fruit(String name, double weight, double price,double purchaseAmount) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.purchaseAmount = purchaseAmount;
        this.pricePerKg = this.price / this.weight;
    }

    public void printInfo() {
        System.out.println("Nama Buah: " + name);
        System.out.println("Berat: " + weight);
        System.out.println("Harga: " + price);
        System.out.println("Jumlah Beli: " + purchaseAmount);
        System.out.println("Harga Sebelum Diskon: " + getPreDiscountPrice());
        System.out.println("Total Diskon: " + getDiscountTotal());
        System.out.println("Harga Setelah Diskon: " + getPostDiscountPrice());
    }

    public double getPreDiscountPrice() {
        return price * (purchaseAmount / weight);
    }

    public double getDiscountTotal() {
        int discountThresholdKg = 4;
        double discountPercentage = 0.02;

        int discountBatches = (int)(this.purchaseAmount / discountThresholdKg);
        return discountBatches * (this.pricePerKg * discountThresholdKg) * discountPercentage;
    }

    public double getPostDiscountPrice() {
        return getPreDiscountPrice() - getDiscountTotal();
    }
}