package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardapioTest {

    @Test
    void deveRetornarBebidaAlcoolicaDaFabricaAdulto() {
        FabricaAbstrata fabrica = new FabricaCardapioAdulto();
        Cardapio cardapio = new Cardapio(fabrica);
        
        assertEquals("Exibir bebidas alcoólicas disponíveis", cardapio.exibirBebida());
    }

    @Test
    void deveRetornarBebidaNaoAlcoolicaDaFabricaKids() {
        FabricaAbstrata fabrica = new FabricaCardapioKids();
        Cardapio cardapio = new Cardapio(fabrica);
        
        assertEquals("Exibir bebidas não alcoólicas disponíveis", cardapio.exibirBebida());
    }

    @Test
    void deveRetornarPizzaGrandeDaFabricaAdulto() {
        FabricaAbstrata fabrica = new FabricaCardapioAdulto();
        Cardapio cardapio = new Cardapio(fabrica);
        
        assertEquals("Exibir opções de pizza grande", cardapio.exibirPizza());
    }

    @Test
    void deveRetornarPizzaKidsDaFabricaKids() {
        FabricaAbstrata fabrica = new FabricaCardapioKids();
        Cardapio cardapio = new Cardapio(fabrica);
        
        assertEquals("Exibir opções de pizza kids", cardapio.exibirPizza());
    }
}