public class l1 {

    static boolean showExpectedResult = false;
    static boolean showHints = false;

    static Cake createCake() {
        Cake cake = new Cake();
        cake.setPrice(29.99);
        return cake;
    }

    static BirthdayCake createBirthdayCake() {
        return new BirthdayCake();
    }

    static WeddingCake createWeddingCake() {
        WeddingCake weddingCake = new WeddingCake();

        weddingCake.setFlavor("pina colada");
        weddingCake.setPrice(350);

        return weddingCake;
    }
}

class BirthdayCake extends Cake {

    private int candles;

    public BirthdayCake() {
        super("chocolate");
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}

class WeddingCake extends Cake {

    private int tiers;

    public WeddingCake() {
        super("almond");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}

class Cake {
    private String flavor;
    private double price;

    public Cake() {
        this("vanilla");
    }

    public Cake(String flavor) {
        setFlavor(flavor);
        setPrice(9.99);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

