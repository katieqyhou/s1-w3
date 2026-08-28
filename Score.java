public class Score {
    private int score;

    public Score() {
        score = 20;
    }
    public Score(int a){
        score = a;
    }

    public void add(int amt){
        score += amt;
    }

    public void subtract(int amt){
        score -= amt;
    }

    public int count(){
        return score;
    }

    public void printState(){
        System.out.println("The score is: " + score); 
    }
}
