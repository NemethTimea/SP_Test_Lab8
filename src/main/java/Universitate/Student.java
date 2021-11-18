package Universitate;

public class Student implements Visitee{
    String nume_student;
    String mail;

    public Student(String nume_student, String mail){
        this.nume_student = nume_student;
        this.mail = mail;
    }
    public String getNumeStudent(){
        return this.nume_student;
    }
    public String getMail(){
        return this.mail;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitStudent(this);
    }
}
