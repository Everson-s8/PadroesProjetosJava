package Factory;

public class Logistica {

    public void criarProduto(String Tipoproduto) throws Exception {
        IFabricaProdutos fabricaProdutos;
        if (Tipoproduto.equalsIgnoreCase("produtoA")){
            fabricaProdutos = new FabricaProdutoA();
        }else if (Tipoproduto.equalsIgnoreCase("produtoB")){
            fabricaProdutos = new FabricaProdutoB();
        }else {
            throw new Exception("produto não encontrado");
        }

        IProduto produto = fabricaProdutos.criarProduto();
        produto.criar();
    }
}
