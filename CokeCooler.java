public class CokeCooler {

    private int numCokes;
    public CokeCooler(int a) {
        numCokes = a;
    }

    public void set() {
        numCokes = 100;
    }

    public void drink(int amt){
        numCokes =+ amt;
    }

    public void refill(int amt){
        numCokes =- amt;
    }

    public int cokeCount(){ //returning the last line, return type must match whatever is being returned (numCokes is an int)
        return numCokes;
    }
    public void printState() {
        System.out.println("Coke Amount: " + numCokes);
    }
}
