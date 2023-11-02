package AbstractFactory;

public class Main {

    public static void main(String[] args) throws Exception {

        IFabricaProdutos fabricaProduto = new FabricaProduto();
        IProdutoA produtoA = fabricaProduto.criarProdutoA();
        IProdutoB produtoB = fabricaProduto.criarProdutoB();
        produtoA.criar();
        produtoB.criar();

    }
}

// Everson Menezes Santos