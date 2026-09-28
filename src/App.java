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


/*        int numero = 10; // Exemplo de número inteiro positivo
        int soma = 0;

         // Calcula a soma dos números inteiros positivos
         do {
            soma += numero;
            numero--; // Decrementa o número para a próxima iteração
         } while (numero > 0);

         // Exibe o resultado da soma
         System.out.println("A soma dos números inteiros positivos é: " +
        soma);
*/

    int codigoDeSaida = 9;

        for (int codigoCarteirinha= 1; codigoCarteirinha <= 10; codigoCarteirinha++) {

            if (codigoCarteirinha == codigoDeSaida) {
                System.out.println("Código de saída encontrado: " + codigoDeSaida);
                break; // Sai do loop quando o código de saída é encontrado
            }

            System.out.println("Código da carteirinha: " + codigoCarteirinha);

            if (codigoCarteirinha == 3 || codigoCarteirinha == 7 || codigoCarteirinha == 10) {
                System.out.println("O codigo da carteirinha " + codigoCarteirinha + " é aceito pelo hospital Santa Clara");
                continue; // Pula para a próxima iteração do loop
            }

            System.out.println("O código da carteirinha " + codigoCarteirinha + " não é aceito pelo hospital Santa Clara");
        }

    }
}
