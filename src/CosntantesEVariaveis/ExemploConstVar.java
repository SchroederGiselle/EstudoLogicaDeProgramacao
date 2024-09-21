package CosntantesEVariaveis;
public class ExemploConstVar {

    public static void main(String[] args) {
        
        //constante para não precisar escrever várias vezes a mensagem "O que tem na cozinha".
        final String oQueTemNaCozinha = "Na cozinha hoje tem: ";
        
        String poteCafe = "Café Mellita";
        String poteAcucar = "Açucar Mascavo";
        String poteBiscoito = "Biscoito Maizena";
        
        System.out.println(oQueTemNaCozinha + poteAcucar + ", " + poteBiscoito + " e " + poteCafe + ".");
        
        
        //mudando a variável
        
        poteCafe = " Café Bagio"; 
        poteAcucar = "Açucar Mascavo";
        poteBiscoito = "Biscoito de Chocolate";
        
        System.out.println(oQueTemNaCozinha + poteAcucar + ", " + poteBiscoito + " e" + poteCafe + ".");
        
    }
}
