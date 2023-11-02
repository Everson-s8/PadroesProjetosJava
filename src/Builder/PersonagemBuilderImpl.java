package Builder;

public class PersonagemBuilderImpl implements PersonagemBuilder{
    String nome;
    String classe;
    int nivel;
    String arma;

    @Override
    public PersonagemBuilderImpl construirNome(String name) {
        nome = name;
        return this;
    }

    @Override
    public PersonagemBuilderImpl construirClasse(String classes) {
        classe = classes;
        return this;
    }

    @Override
    public PersonagemBuilderImpl construirNivel(int niveis) {
        nivel = niveis;
        return this;
    }

    @Override
    public PersonagemBuilderImpl construirArma(String armamento) {
        arma = armamento;
        return this;
    }

    public Personagem build(){
        return new Personagem(nome,classe,nivel,arma);
    }
}
