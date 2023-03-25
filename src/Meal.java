public class Meal {
    private Burger burger;
    private Drink drink;
    private Side side;

    public Meal() {
        this(new Burger("regular"), new Drink("coke", "small"),
                new Side("fries"));
    }

    public Meal(Burger burger, Drink drink, Side side) {
        this.burger = burger;
        this.drink = drink;
        this.side = side;
    }
}
