package Arrays;

public class CriandoMatrizes {
    
    public static void main(String[] args) {

        final String pokemonEscolhido = "O Pokémon escolhido foi: ";
        final String informaçõesDoPokemon = "Informações do seu Pokémon: ";

        // Criar uma matriz de objetos para armazenar Pokémon
        Object[][] pokemons = {
            {"Pikachu", 'M', 25},
            {"Bulbasaur", 'F', 15},
            {"Charmander", 'M', 20}
        };
        
        // Para selecionar informações
        System.out.println(pokemonEscolhido + pokemons[1][0]);
        
        // Exibir informações do Pokémon escolhido
        System.out.printf(informaçõesDoPokemon + "\nNome: %s\nGênero: %c\nNível: %d\n", 
                          pokemons[1][0], pokemons[1][1], pokemons[1][2]);
                          
                          
            
            // Obter a quantidade de itens no array
            int quantidadePokemons = pokemons.length;

            // Imprimir a quantidade de Pokémons
            System.out.println("Quantidade de Pokémons: " + quantidadePokemons);
    }

}
