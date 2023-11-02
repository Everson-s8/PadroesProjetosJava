package AbstractFactory;

public class FabricaProduto implements IFabricaProdutos{
    @Override
    public ProdutoA criarProdutoA() throws Exception {
        return new ProdutoA();
    }

    @Override
    public ProdutoB criarProdutoB() throws Exception {
        return new ProdutoB();
    }

}
