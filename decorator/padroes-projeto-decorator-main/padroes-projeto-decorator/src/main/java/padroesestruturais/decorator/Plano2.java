package padroesestruturais.decorator;

public class Plano2 extends PlanoDecorator {

    public Plano2(Plano plano) {
        super(plano);
    }

    public float getPrecoConvenio() {
        return 400;
    }

    public String getCustomConvenio() {
        return "Plano2";
    }
}
