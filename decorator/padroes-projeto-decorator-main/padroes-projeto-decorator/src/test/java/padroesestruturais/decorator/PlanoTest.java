package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlanoTest {

    @Test
    void deveRetornarPrecoPlano() {
        Plano plano = new PlanoCompleto(1000);

        assertEquals(1000, plano.getPreco());
    }

    @Test
    void deveRetornarPrecoComPlano1() {
        Plano plano = new Plano1(new PlanoCompleto(1000));

        assertEquals(1200, plano.getPreco());
    }

    @Test
    void deveRetornarPrecoComPlano2() {
        Plano plano = new Plano2(new PlanoCompleto(1000));

        assertEquals(1400, plano.getPreco());
    }

    @Test
    void deveRetornarPrecoComPlano1Plano2() {
        Plano plano = new Plano1(new Plano2 (new PlanoCompleto(1000)));


        assertEquals( 1600, plano.getPreco());
    }


    @Test
    void deveRetornarCustomPlano() {
        Plano plano = new PlanoCompleto();

        assertEquals("Plano Completo", plano.getCustom());
    }

    @Test
    void deveRetornarCustomPlano1() {
        Plano plano = new Plano1(new PlanoCompleto());

        assertEquals("Plano Completo/Plano1", plano.getCustom());
    }

    @Test
    void deveRetornarCustomPlano2() {
        Plano plano = new Plano2(new PlanoCompleto());

        assertEquals("Plano Completo/Plano2", plano.getCustom());
    }

    @Test
    void deveRetornarCustomComPlano1Plano2() {
        Plano plano = new Plano1(new Plano2 (new PlanoCompleto()));


        assertEquals( "Plano Completo/Plano2/Plano1", plano.getCustom());
    }


}