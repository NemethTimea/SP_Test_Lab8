package Universitate;

import java.util.ArrayList;
import java.util.List;

public class An implements Element, Visitee{
    String anul;
    List<Element> lista_elemente = new ArrayList<>();

    public An(String anul){
        this.anul = anul;
    }
    public void add(Element element){
        lista_elemente.add(element);
    };
    public void remove(Element element){
        lista_elemente.remove(element);
    };
    public Element get(Integer index){
        return lista_elemente.get(index);
    };
    public String getAnul(){
        return this.anul;
    }
    public List<Element> getListaElemente(){
        return this.lista_elemente;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitAn(this);
    }
}
