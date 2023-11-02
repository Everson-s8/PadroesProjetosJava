package Builder;

public class Director {
    public void construirPersonagem(PersonagemBuilder personagemBuilder){
        personagemBuilder.construirNome("usuario");
        personagemBuilder.construirArma("armamento");
        personagemBuilder.construirClasse("inicial");
        personagemBuilder.construirNivel(0);

    }


}
