package Builder;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        PersonagemBuilderImpl personagem = new PersonagemBuilderImpl();


        director.construirPersonagem(personagem);

        System.out.println(personagem.build());

        personagem
                .construirNome("Odisley")
                .construirArma("Espada")
                .construirClasse("Guerreiro")
                .construirNivel(15)
                        .build();

        System.out.println();
        System.out.println(personagem.build());
        System.out.println();

        PersonagemBuilderImpl personagem2 = new PersonagemBuilderImpl()
                .construirNome("Gabriel")
                .construirArma("Arma de fogo")
                .construirClasse("Ladino")
                .construirNivel(30);

        System.out.println(personagem2.build());



        // Everson Menezes Santos

    }
}
