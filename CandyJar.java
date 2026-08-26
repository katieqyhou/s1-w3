public class CandyJar {
    private int amount;

    public CandyJar() {
        amount = 10;
    }

    public CandyJar(int a) {
        amount = a; //right to left for a reason, a = amount is not the same thing
    }

    public void eat(int amt) {
        amount =- amt;
    }

    public void refill(int amt) {
        amount =+ amt;
    }

    public void printState() {
        System.out.println("Candy Amount: " + amount);
    }
}