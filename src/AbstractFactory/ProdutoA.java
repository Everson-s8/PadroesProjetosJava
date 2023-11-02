package AbstractFactory;

public class ProdutoA implements IProdutoA {
    @Override
    public void criar() {
        System.out.println("esse é o produto A");
    }


}
