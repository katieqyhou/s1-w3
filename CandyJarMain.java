public class CandyJarMain {
    public static void main(String[] args) {
        CandyJar c = new CandyJar();
        CandyJar c1 = new CandyJar();

        c.eat(50);
        c1.eat(100);

        c.refill(12);
        c1.refill(30);
        System.out.println("C: ");
        System.out.println("C1: ");
        c.printState();
        c1.printState();

    }
}