//It`s user, bro

public class Customer  {
    private String name;
    private double sum;
    private Color [] preferedColors;

    public Customer(String name){
        this.sum = Math.round(Math.random() * (50000-25000) + 25000);
        this.name = name;
    }

    public Customer () {

    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getName() {
        return name;
    }
    public void setName (String name){
        this.name = name;
    }
    public Color[] getPreferedColors() {
        return preferedColors;
    }
}
