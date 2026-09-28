public class App {
    public static void main(String[] args) {

 /*       int soma = 0;
        
        for (int i = 0; i <= 10; i++) {

            soma += i;
        }

            System.out.println("A soma dos numeros é de: " + soma);
      */  
//---------------------------------------------------------------
        int contadorDoces = 1;

        while (contadorDoces <= 3) {

            System.out.println("Número de doces: " + contadorDoces);

            contadorDoces++;
        }

        System.out.println("Não pode comer mais doces.");


//---------------------------------------------------------------


        int numero = 10; // Exemplo de número inteiro positivo
        int soma = 0;

         // Calcula a soma dos números inteiros positivos
         do {
            soma += numero;
            numero--; // Decrementa o número para a próxima iteração
         } while (numero > 0);

         // Exibe o resultado da soma
         System.out.println("A soma dos números inteiros positivos é: " +
        soma);

    }
}
