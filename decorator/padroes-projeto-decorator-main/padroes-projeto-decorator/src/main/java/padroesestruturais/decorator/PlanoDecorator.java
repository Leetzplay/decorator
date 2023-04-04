package padroesestruturais.decorator;

public abstract class PlanoDecorator implements Plano {

    private Plano plano;
    public String custom;

    public PlanoDecorator(Plano plano) {
        this.plano = plano;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public abstract float getPrecoConvenio();

    public float getPreco() {
        return this.plano.getPreco() + (this.getPrecoConvenio() );
    }

    public abstract String getCustomConvenio();

    public String getCustom() {
        return this.plano.getCustom() + "/" + (this.getCustomConvenio() );
    }
}


