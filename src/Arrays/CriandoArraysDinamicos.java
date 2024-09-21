package Arrays;

// Bibliotecas para lidar com arrays e listas
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class CriandoArraysDinamicos {
    public static void main(String[] args) {

        final String mensagemPokemonEscolhido = "O Pokemon escolhido foi: ";
        final String mensangemPokemonsRestantes = "Os Pokemons Restantes são: ";

         // Declarar o array de Pokémons

         String[] nomePokemon = {"Pikachu", "Bulbasaur", "Charmander"};

        
        // Criar o array para uma lista (ArrayList) para permitir remoção de elementos

        List<String> nomes = new ArrayList<>(Arrays.asList(nomePokemon));
        
        System.out.println("Os Pokemons são: " + nomes);

        // Acessar um elemento específico do array
        System.out.println(mensagemPokemonEscolhido + nomes.get(0));

        // Remover o primeiro elemento (índice 0)
        nomes.remove(0);

        System.out.println(mensangemPokemonsRestantes + nomes );

        // Remover o último elemento (baseado no tamanho da lista)
        nomes.remove(nomes.size() - 1);

        // Iterar e exibir os elementos restantes
        for (String p : nomes) {
            System.out.println(p);
        }
    }
}
