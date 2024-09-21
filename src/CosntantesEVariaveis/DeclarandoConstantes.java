package CosntantesEVariaveis;
public class DeclarandoConstantes {
      
    public static void main(String[] args){
        
        //declarando uma cosntante em Java
        final String notificao = "Pokemon Go Diz: " ;
            
    System.out.println( notificao + "tem um novo pokemon na região");
    System.out.println(notificao + "você foi derrotado em uma arena.");
    

        //diferença de constante para variável é que não se pode mudar a constante dirente da variável.
        notificao = "DIGIMON" ;

    System.out.println("O nome do jogo agora é: " + notificao);

}

    }