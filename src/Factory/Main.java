package Factory;

public class Main {

    public static void main(String[] args) throws Exception {
        Logistica fabricaConcreta = new Logistica();

        fabricaConcreta.criarProduto("produtoA");
        fabricaConcreta.criarProduto("produtoB");
    }
}

// Everson Menezes Santos