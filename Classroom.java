public class Classroom{ 
    private String teacherName;
    private int numDesks;
    private int numStudents;

    public Classroom(String teacherName, int numDesks, int numStudents){ 
        this.teacherName = teacherName;
        this.numDesks = numDesks;
        this.numStudents = numStudents;
    }
    
    public Classroom(String teacherName){
        this(teacherName, 0, 0);
    }

    public int desks(){
        return this.numDesks;
    }

    public String teacher(){
        return this.teacherName;
    }

    public int students(){
        return this.numStudents;
    }

    public void setDesks(int amt){
        this.numDesks = amt;
    }

    public void setTeacher(String teach){
        this.teacherName = teach;
    }

    public void setStudents(int amt){
        this.numStudents = amt;
    }

    public void printState() {
        System.out.println("Teacher's name: " + teacherName);
        System.out.println("Number of desks: " + numDesks);
        System.out.println("Number of students: " + numStudents);
    }
}
