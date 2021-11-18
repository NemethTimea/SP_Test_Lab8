package Universitate;

public interface Visitor <T>{
    T visitAn(An an);
    T visitGrupa(Grupa grupa);
    T visitSemigrupa(Semigrupa semigrupa);
    T visitStudent(Student student);
}
