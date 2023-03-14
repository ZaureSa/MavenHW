public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long expected = 15;
        long actual = service.calculate(500, true);
        System.out.println("1. " + expected + " == ? == " + actual);

        expected = 50;
        actual = service.calculate(500, true);
        System.out.println("2. " + expected + " == ? == " + actual);
    }
}
