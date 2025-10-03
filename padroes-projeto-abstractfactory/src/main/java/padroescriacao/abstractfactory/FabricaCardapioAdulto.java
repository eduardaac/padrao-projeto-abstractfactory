package padroescriacao.abstractfactory;

public class FabricaCardapioAdulto implements FabricaAbstrata {

    @Override
    public Bebida createBebida() {
        return new BebidaAlcoolica();
    }

    @Override
    public Pizza createPizza() { return new PizzaGrande(); }
}
