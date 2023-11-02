package AbstractFactory;

public class ProdutoB implements IProdutoB {
    @Override
    public void criar() {
        System.out.println("esse é o produto B");
    }
}
