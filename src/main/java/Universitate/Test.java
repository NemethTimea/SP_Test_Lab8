package Universitate;

public class Test {
    public static void main(String args[]){
        Element info3 = new An("Informatica aplicata 3")
                .add(new Grupa("Grupa 1")
                        .add(new Semigrupa("Semigrupa 1.1")
                                .add(new Student("Popescu I","popescu@acme.edu"))
                                .add(new Student("Popescu I","popescu@acme.edu"))
                        )
                        .add(new Semigrupa("Semigrupa 1.2")
                                .add(new Student("Vasilescu I", "vasilescu@acm.edu"))
                                .add(new Student("Georgescu E","georgescu`@acm.edu"))
                        )
                )
                .add(new Grupa("Grupa 2"));

        Visitor printVisitor = new RenderContentVisitor();
        info3.accept(printVisitor);
    }
}
