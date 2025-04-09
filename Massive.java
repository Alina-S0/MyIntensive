public class Massive {
        String name;
        String data;
        String maker;
        String country;
        Integer price;
        String bron;

        Massive(String name, String data, String maker, String country, Integer price, String bron) {
            this.name = name;
            this.data = data;
            this.maker = maker;
            this.country = country;
            this.price = price;
            this.bron = bron;

            Massive[] massive = new Massive[5];
            massive[0] = new Massive("Nokia", "01.05.2015", "Nokia Corp.", "Chine", 10000, "bron");
            massive[1] = new Massive("Sony", "01.01.2001", "Sony Corp.", "Chine", 30000, "bron");
            massive[2] = new Massive("Samsung", "11.01.2020", "Samsung Corp.", "USA", 20000, "bron");
            massive[3] = new Massive("Apple", "06.01.2025", "Apple Corp.", "Korea", 30500, "bron");
            massive[4] = new Massive("Alcatel", "02.08.2025", "Alcatel Corp.", "Chine", 20300, "bron");

        }
    }
