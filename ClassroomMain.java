public class ClassroomMain {
    public static void main(String[] args) {
        Classroom c = new Classroom("Morris", 20, 15);
        Classroom c1 = new Classroom("Castle");

        c1.setDesks(30);
        c.printState();
    }
}
