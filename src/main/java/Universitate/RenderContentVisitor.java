package Universitate;

public class RenderContentVisitor implements Visitor<Void>{

    @Override
    public Void visitAn(An an) {
        System.out.println(an.getAnul());
        for (Element e : an.getListaElemente()){
            ((Visitee)e).accept(this);
        }
        return null;
    }

    @Override
    public Void visitGrupa(Grupa grupa) {
        System.out.println("    " + grupa.getGrupaNume());
        for (Semigrupa s : grupa.getListaSemiGrupa()){
            ((Visitee)s).accept(this);
        }
        return null;
    }

    @Override
    public Void visitSemigrupa(Semigrupa semigrupa) {
        System.out.println("        " + semigrupa.getSemiGrupaNume());
        for (Student student : semigrupa.getListaStudenti()){
            ((Visitee)student).accept(this);
        }
        return null;
    }

    @Override
    public Void visitStudent(Student student) {
        System.out.println("            " + student.getNumeStudent() + ", " + student.getMail());
        return null;
    }
}
