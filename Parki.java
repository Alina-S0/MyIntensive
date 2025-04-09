public class Parki {


        public class Attractions {
            private String name;
            private String time;
            private Float price;

            public void printAttraction() {
                System.out.println("Название " + name);
                System.out.println("Время " + time);
                System.out.println("Цена " + price);
            }
        }

        public void newAttraction() {

            Attractions attraction = new Attractions();
            attraction.name = "Roller";
            attraction.time = "12.00";
            attraction.price = 500.00f;
            attraction.printAttraction();
        }

        public static void main(String[] args) {
            Parki park = new Parki();
            park.newAttraction();
            Parki.Attractions attraction = park.new Attractions();
            attraction.printAttraction();

        }
    }

