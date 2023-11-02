package AbstractFactory;

public interface IFabricaProdutos {

    public ProdutoA criarProdutoA() throws Exception;

    public ProdutoB criarProdutoB() throws Exception;

}
