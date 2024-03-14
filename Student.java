public class Student implements ObjectInformation {
    private String name;
    private int studentID;

    public Student(String name, int studentID){
        this.name = name;
        this.studentID = studentID;
    }

    @Override
    public void displayInformation(){
        System.out.println("Student: " + name + "; \nID: " + studentID );
    }
    
}
