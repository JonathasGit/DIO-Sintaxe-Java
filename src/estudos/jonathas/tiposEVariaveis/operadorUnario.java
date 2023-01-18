package estudos.jonathas.tiposEVariaveis;

public class operadorUnario {

    public static void main(String[] args) {
        int numero = 5; 
        System.out.println(numero);

        numero = - numero;// Não afeta o valor original
        System.out.println(numero);

        numero = + numero; // aritmetico para somar
        System.out.println(numero); //Volta a ser positivo

        numero =  numero * -1; 
        System.out.println(numero); 


    }
    
}
