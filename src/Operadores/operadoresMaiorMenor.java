package Operadores;

class operadoresMaiorMenor {

    public static void main(String[] args) {

        int idadeMinima = 18;
        int idadeUsuario = 17;
        boolean idadePermitida = idadeUsuario >= idadeMinima;

        System.out.println("A idade é permitida? " + idadePermitida);

        int idadeCorte = 60;
        int idadeUsuario2 = 65;

        boolean ehTerceiraIdade = idadeUsuario2 >= idadeCorte;
        System.out.println("A idade é de terceira idade? " + ehTerceiraIdade);
    }
}