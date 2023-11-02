package Prototype;

public class Administrador extends Usuario{

    private String setor;

    private Administrador(Administrador administrador){
        this.nome = administrador.getNome();
        this.email = administrador.getEmail();
        this.setor = administrador.getSetor();
    }

    public Administrador(){
        nome = "Administrador";
        email = "adm@empresa.com";
        setor = "financeiro";
    }

    @Override
    public String exibirInfo() {
        return "Nome   " + getNome() + "\n email   " + getEmail() + "\n Setor  " + getSetor() ;
    }

    @Override
    public Usuario clonar() {
        return new Administrador(this);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
