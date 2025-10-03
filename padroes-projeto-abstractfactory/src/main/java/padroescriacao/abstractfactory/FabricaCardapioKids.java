package padroescriacao.abstractfactory;

public class FabricaCardapioKids implements FabricaAbstrata {

    @Override
    public Bebida createBebida() {
        return new BebidaNaoAlcoolica();
    }

    @Override
    public Pizza createPizza() {
        return new PizzaKids();
    }
}
