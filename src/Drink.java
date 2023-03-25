public class Drink {

    private String type;
    private String size;
    private double price;

    public Drink(String type, String size) {
        this.type = type;
        this.size = size;
        if (size == "small") {
            this.price = 3.00;
        } else if (size == "big") {
            this.price = 5.00;
        }
    }
}
