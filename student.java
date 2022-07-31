package javaapplication11;
public class student {
    private int Roll;
    private String Name;
    private String FatherName;
    public student(int r, String n, String fn){
    Roll = r;
    Name = n;
    FatherName = fn;
    }
    public void info(){
        System.out.println("Roll number is : "+ Roll);
        System.out.println("Name is : "+ Name);
        System.out.println("Father Name is : "+ FatherName);
    
    }
}
