public class ScoreMain {
    public static void main(String[] args) {
        Score s = new Score();
        Score s1 = new Score (30);


        s1.add(5);
        System.out.println("The score2 is: " + s1.count());

        s.subtract(5);
        System.out.println("The score is: " + s.count());
    }
}
