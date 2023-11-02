package Prototype;

public class Funcionario extends Usuario{

    private String cargo;

    private Funcionario(Funcionario funcionario){
        this.nome = funcionario.getNome();
        this.email= funcionario.getEmail();
        this.cargo = funcionario.getCargo();
    }

    public Funcionario(){
        nome = "Funcionario";
        email = "funcionario@empresa.com";
        cargo = "Entregador";
    }
    @Override
    public String exibirInfo() {
        return "Nome   " + getNome() + "\n email   " + getEmail() + "\n Cargo   " + getCargo() ;
    }

    @Override
    public Usuario clonar() {
        return new Funcionario(this);
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
