
interface Student
{
    void study();
}
class BasicStudent implements Student
{

    @Override
    public void study() {

    }
}
class StudentDesigner implements Student
{
    protected Student student;
    public StudentDesigner(Student student)
    {
        this.student = student;
    }

    @Override
    public void study() {
        System.out.println("study as a student");
    }
}
class NerdStudent extends StudentDesigner
{

    public NerdStudent(Student student) {
        super(student);
    }
    public void study()
    {
        this.student.study();
        System.out.println("study as a nerd");
    }
}
class ClownStudent extends StudentDesigner
{

    public ClownStudent(Student student) {
        super(student);
    }

    @Override
    public void study() {
        this.student.study();
        System.out.println("clown students don't study");
    }
}
class TestDecorator
{
    public static void main(String[] args) {
        Student nerdAndClownStudent = new ClownStudent(new NerdStudent(new BasicStudent()));
        nerdAndClownStudent.study();
    }
}