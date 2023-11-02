package Builder;

public interface PersonagemBuilder {
    PersonagemBuilderImpl construirNome(String nome);
    PersonagemBuilderImpl construirClasse(String classe);
    PersonagemBuilderImpl construirNivel(int Nv);
    PersonagemBuilderImpl construirArma(String arma);

}
