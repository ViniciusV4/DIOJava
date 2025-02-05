package candidatura;

import java.util.Scanner;

public class ControleDeFluxo {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int valor1 = leitor.nextInt();

        System.out.println("Digite o segundo valor:");
        int valor2 = leitor.nextInt();

        try {
          
            contar(valor1, valor2);
        } catch (ParametrosInvalidosException exception) {
         
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

   
    static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException() {
            super("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
}
