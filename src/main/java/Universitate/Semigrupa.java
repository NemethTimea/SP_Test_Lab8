package Universitate;

import java.util.ArrayList;
import java.util.List;

public class Semigrupa implements Visitee{
    String semigrupa_nume;
    List<Student> lista_studenti = new ArrayList<>();

    public Semigrupa(String semigrupa_nume){
        this.semigrupa_nume = semigrupa_nume;
    }
    public void add(Student student){
        lista_studenti.add(student);
    };
    public void remove(Semigrupa semigrupa){
        lista_studenti.remove(semigrupa);
    };
    public Student get(Integer index){
        return lista_studenti.get(index);
    };
    public String getSemiGrupaNume(){
        return this.semigrupa_nume;
    }
    public List<Student> getListaStudenti(){
        return this.lista_studenti;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitSemigrupa(this);
    }
}
