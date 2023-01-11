package estudos.jonathas.segundaSemana;

public class MinhaClasse {


    public static void main(String[] args) {
        
        System.out.println("Hello World");
        System.out.println("Teste Commit 2");
        ;

        int ano = 2022;
        final String BR = "Brasil"; //final para nunca ser alterado

        ano = 2023;


        
        // Aula 3 - Tipos de Variaveis
        String meuNome = "Jonathas";
        int anoDeFabricacao = 2023;
        boolean verdadeira = true;
        System.out.println(anoDeFabricacao);



        //alterar variavel

        anoDeFabricacao = 2018;
        System.out.println(anoDeFabricacao);

        String primeiroNome = "Teste";
        String segundoNome = "Teste2";

        String nomeCompleto2 = nomeCompleto (primeiroNome, segundoNome); // chamando o metodo
        System.out.println(nomeCompleto2);

    }

    //Criando um metodo

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

    
}
//Aula 2 de anatomia, falando de Variavel 