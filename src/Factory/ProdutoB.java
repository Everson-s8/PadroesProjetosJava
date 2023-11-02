package Factory;

public class ProdutoB implements IProduto{
    @Override
    public void criar() {
        System.out.println("esse é o produto B");
    }
}
