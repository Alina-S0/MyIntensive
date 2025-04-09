public class Product {
    private String name;
    private String data;
    private String maker;
    private String country;
    private Integer price;
    private String bron;

    Product(String name, String data, String maker, String country, Integer price, String bron) {
        this.name = "Sony";
        this.data = "01.2025";
        this.maker = "Sony Corp.";
        this.country = "Chine";
        this.price = 30000;
        this.bron = "Bron";
    }

    void getInfo() {

        System.out.println("Name: " + name + " Data: " + data + " Maker: " + maker + " Country: " + country + " Price: " + price + " Bron: " + bron);
    }
}
