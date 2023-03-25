public class Burger {

    private String type;
    private double price;

    public Burger(String type) {
        this.type = type;

        this.price = switch (type) {
            case "cheese" -> 6.00;
            case "double" -> 7.00;
            default -> 5.00;
        };

    }


}
