package Prototype;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        Cliente cliente = new Cliente();
        Administrador administrador = new Administrador();

        // Cliente
        // Caso onde tenha dois clientes que moram no mesmo endereço
        // Mas com nomes diferentes
        // Clonando as informações do cliente em comum e mudando só a diferença

        cliente.setEndereco("Rua Manoel dos Santos");
        cliente.setCep("49100-000");
        cliente.setNumeroResidencia(122);
        cliente.setNome("Carlos");


        Usuario usuario = cliente.clonar();
        usuario.setNome("Matheus");
        System.out.println(cliente.exibirInfo());
        System.out.println();
        System.out.println(usuario.exibirInfo());

        System.out.println();

        // Administrador
        // Clonar um Administrador do setor financeiro

        Usuario usuario1 = administrador.clonar();
        System.out.println(usuario1.exibirInfo());
        System.out.println();
        // Funcionario
        // Funcionarios com cargos diferentes

        Usuario usuario2 = funcionario.clonar();
        funcionario.setCargo("Caixa");
        Usuario usuario3 = funcionario.clonar();
        System.out.println(usuario2.exibirInfo());
        System.out.println();
        System.out.println(usuario3.exibirInfo());


        //teste









       
    }
}
