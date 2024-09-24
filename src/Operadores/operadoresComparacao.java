package Operadores;

public class operadoresComparacao {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a == 1);
        //retorna falso

        String marca = "Samsung";   
        System.out.println(marca == "Samsung");
        //retorna verdadeiro

        Double preco = 20.0;
        System.out.println(preco != 20.0);
        //retorna falso

        long cpfBloqueado = 12144544896L;  // Usando 'long' para números grandes
        long CPFUsuario = 121457898L;      // Usando 'long' para evitar overflow
        boolean ehCpfBloqueado = (cpfBloqueado == CPFUsuario);  // Comparação numérica com '=='
                
        System.out.println("O usuario pode embarcar? " + !ehCpfBloqueado);  // Inverte o valor para mostrar se pode embarcar

            String cpfPermitido = "12156854545";  // CPF representado como String
            String cpfDoUsuario = "25659896565";  // CPF representado como String
        
            boolean ehCpfEhBloqueado = !cpfDoUsuario.equals(cpfPermitido);  // Comparação correta entre Strings
        
            System.out.println("O usuario pode embarcar? " + !ehCpfEhBloqueado);  // Mostra o resultado se o usuário pode embarcar
        
        




    }
    
}
