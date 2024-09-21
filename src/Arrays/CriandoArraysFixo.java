package Arrays;

//bibliotecas para lidar com arrays
import java.util.Arrays;

public class CriandoArraysFixo {
    public static void main(String[] args) {

        final String menssagem = "O Pokemon escolhido foi: ";
        
    //formas de declarar arryas tipo String

    // String[] nomePokemon = {"Pikachu" , "Bulbasaur" , "Charmander"};

        String[] nomes = new String[3];
        nomes[0] = "Pikachu";
        nomes[1] = "Bulbasaur";
        nomes[2] = "Charmander";
        
        //para acessar o array inteiro 

        System.out.println("Os Pokemons são: " +  Arrays.toString(nomes));

        //para acessar um elemento específico do array 
        
        System.out.println(menssagem + nomes[0]);

        

    }
}
