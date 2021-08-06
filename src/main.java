import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class main {


    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(new Audi(), new t10(), new BMW(), new x8(), new Scoda(), new KIA(), new Fabia(), new Reno());
        List<Customer> customers = Arrays.asList(new Customer("Олега"), new Customer("Івана"), new Customer("Василя") );



        for (Car car : cars){
            for ( Customer customer: customers){

                if (car.getPrice() <=customer.getSum()) {
                    System.out.println("В кишені у " + customer.getName() + " "+ customer.getSum() + " доларів" + ". Цього достатньо, щоб купити " + car.getName() + " за " + car.getPrice());

                }
            }
        }











    }
}
