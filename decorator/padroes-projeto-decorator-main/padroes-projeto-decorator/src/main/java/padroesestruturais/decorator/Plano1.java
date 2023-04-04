package padroesestruturais.decorator;

public class Plano1 extends PlanoDecorator {

    public Plano1(Plano plano) {
        super(plano);
    }

    public float getPrecoConvenio() {
        return 200;
    }

    public String getCustomConvenio() {
        return "Plano1";
    }
}
