package Prototype;

public class Cliente extends Usuario{

    private String endereco;
    private String Cep;
    private int numeroResidencia;

    private Cliente(Cliente cliente){
        nome = cliente.getNome();
        email = cliente.getEmail();
        endereco = cliente.getEndereco();
        Cep = cliente.getCep();
        numeroResidencia = cliente.getNumeroResidencia();
    }

    public Cliente(){
        nome = "Cliente";
        email = "cliente@empresa.com";
        endereco = "Rua Brasilia";
        Cep = "49360-000";
        numeroResidencia = 0;
    }


    @Override
    public String exibirInfo() {
        return "Nome   " + getNome() + "\n email   " + getEmail() + "\n Endereco   " + getEndereco() + "\n CEP   " + getCep() + "\n Numero Residencia    " + getNumeroResidencia();
    }

    @Override
    public Usuario clonar() {
        return new Cliente(this);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String cep) {
        Cep = cep;
    }

    public int getNumeroResidencia() {
        return numeroResidencia;
    }

    public void setNumeroResidencia(int numeroResidencia) {
        this.numeroResidencia = numeroResidencia;
    }
}
