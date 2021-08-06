import java.util.Random;

public class Car {
        private String name;
        private double price;
        public String color;



        public Car (String name){
            this.price = Math.round(Math.random() * (50000-25000) + 25000);
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public String  getName() {
            return name;
        }
        public String getColor(){
            return color;
        }


    }

