package Factory;

public class ProdutoA implements IProduto{
    @Override
    public void criar() {
        System.out.println("esse é o produto A");
    }
}
