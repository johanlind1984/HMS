package sample;

public class Drug {

    private final String name;
    private String manufacturer;
    private int inStock;
    private int burnRate;

    public Drug(String name, String manufacturer, int inStock) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.inStock = inStock;
        this.burnRate = 0;
    }

    public void addStock(int quantity) {
        if(quantity > 0) {
            inStock += quantity;
        } else {
            System.out.println(name + ": quantity given less than 0, No changes were made");
        }
    }

    public void removeStock(int quantity) {
        if(quantity > 0 && (inStock - quantity) > 0) {
            inStock -= quantity;
        } else {
            System.out.println(name + ": quantity less than 0,  or quantity more than whats in stock! No changes were made");
        }

    }

    public void addBurnRate(int quantity) {
        burnRate += quantity;
    }

    public void decreaseBurnRate(int quantity) {
        burnRate -= quantity;
    }

    public String getName() {
        return name;
    }

    public int getInStock() {
        return inStock;
    }

    public int getBurnRate() {
        return burnRate;
    }
}
