package padroescriacao.abstractfactory;

public class Cardapio {

    private Bebida bebida;
    private Pizza pizza;

    public Cardapio(FabricaAbstrata fabrica) {
        this.bebida = fabrica.createBebida();
        this.pizza = fabrica.createPizza();
    }

    public String exibirBebida() { return this.bebida.exibir(); }

    public String exibirPizza() {
        return this.pizza.exibir();
    }
}
