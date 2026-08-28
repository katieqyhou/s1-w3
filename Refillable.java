public class Refillable {
    private int amt;
    private int totalUse;
    private int totalTimeUsedHappens;

    public Refillable() {
        amt = 10;
    }

    public Refillable(int a) {
        amt = a;
    }

    public void useUp(int use){
        amt -= use;
        totalTimeUsedHappens++;
    }

    public void addTo(int use) {
        amt += use;
    }

    public int count() {
        return amt;
    }

    public double avgUse(){
        amt = totalUse;
        return totalUse * 1.0 / totalTimeUsedHappens;
    }
}
