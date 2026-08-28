public class RefillableMain {
    public static void main(String[] args) {   
        Refillable r = new Refillable();
        Refillable r1 = new Refillable();

        r.addTo(10);
        r.useUp(5);
        System.out.println("The amount is: " + r.count());
        System.out.println(r.avgUse());
    }
}
