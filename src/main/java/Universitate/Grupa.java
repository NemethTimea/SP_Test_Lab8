package Universitate;

import java.util.ArrayList;
import java.util.List;

public class Grupa implements Visitee{
    String grupa_nume;

    List<Semigrupa> lista_semigrupa = new ArrayList<>();

    public Grupa(String grupa_nume){
        this.grupa_nume = grupa_nume;
    }
    public void add(Semigrupa semigrupa){
        lista_semigrupa.add(semigrupa);
    };
    public void remove(Semigrupa semigrupa){
        lista_semigrupa.remove(semigrupa);
    };
    public Semigrupa get(Integer index){
        return lista_semigrupa.get(index);
    };
    public String getGrupaNume(){
        return this.grupa_nume;
    }
    public List<Semigrupa> getListaSemiGrupa(){
        return this.lista_semigrupa;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitGrupa(this);
    }
}
