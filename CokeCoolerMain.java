public class CokeCoolerMain {
    public static void main(String[] args) {
        CokeCooler c = new CokeCooler(2);
        CokeCooler c1 = new CokeCooler(4);

        System.out.println(c.cokeCount()); //print out whatever was returned, only works with a constructor that has return

        c.drink(20);
        c1.drink(20);

        c.refill(20);
        c1.refill(20);

        System.out.println("C: ");
        System.out.println("C1: ");
        c.printState();
        c1.printState(); 

    }
}