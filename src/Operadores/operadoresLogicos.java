package Operadores;

public class operadoresLogicos {
   public static void main(String[] args) {

    // E ( && )
        int idade = 18;
        boolean vistoVerificacao = true;
        boolean resultado = ((idade >= 18) && (vistoVerificacao == true)); // Correção: >= em vez de =>

        System.out.println(resultado);

        //OU ( || )

        String tempo = "Chuva";
        String item = "Sem Guarda Chuva";
        boolean podeSair = (tempo != "Chuva" || item == "Guarda Chuva");

        System.out.println("Pode Sair? " + podeSair);


        //NOT ( ! )

        String tempoverificar = "chuva";
        boolean podeSair2 = (tempoverificar != "chuva");

        System.out.println("Esta chovendo? " + podeSair2);
    }
}
