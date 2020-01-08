package Strategy;


public class StrategyPatternMain {

    public static void main(String[] args) {
        Choices context = new Choices(new Add());
        System.out.println("20 + 8 = " + context.executeStrategy(20, 8));

        context = new Choices(new Minus());
        System.out.println("20 - 8 = " + context.executeStrategy(20, 8));
    }
}
