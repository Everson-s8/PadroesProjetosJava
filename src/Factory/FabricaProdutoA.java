package Factory;

public class FabricaProdutoA implements IFabricaProdutos{
    @Override
    public IProduto criarProduto() {
        return new ProdutoA();
    }
}
