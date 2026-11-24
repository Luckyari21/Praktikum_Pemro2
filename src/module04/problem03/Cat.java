package module04.problem03;

public class Cat extends Pet {
    private String furColor;

    public Cat (String name, String breed, String furColor) {
        super (name, breed);
        this.furColor = furColor;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Memiliki Warna Bulu: " + furColor);
    }
}