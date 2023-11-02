package Factory;

public class FabricaProdutoB implements IFabricaProdutos{
    @Override
    public IProduto criarProduto() {
        return new ProdutoB();
    }
}
