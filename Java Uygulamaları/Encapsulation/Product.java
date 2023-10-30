public class Product {
    // Attribitude && Field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String kod;

    //Getter
    public int getIdd() {
        // Şu anda id'yi okuyamaz ama yazabilir.
        return id;
    }

    //Setter
    public void setId(int id) {
        // This içersinde bulunulan class demek. Yani Product'un id'si demek.
        // Eşitliğin sağıdnaki id ise int id'den geliyor.
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }
}


