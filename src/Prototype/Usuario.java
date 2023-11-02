package Prototype;

public abstract class Usuario {

    String nome;String email;
    public abstract String exibirInfo();
    public abstract Usuario clonar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
