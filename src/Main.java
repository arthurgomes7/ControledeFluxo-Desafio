import Exceptions.InvalidParametersException;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número (Ex...3): ");
        var num1 = scanner.nextInt();
        System.out.print("Digite o segundo número (Ex...1): ");
        var num2 = scanner.nextInt();
        try{
            contagemDeOcorrencias(num1, num2);
        } catch (InvalidParametersException ex){
            System.out.println();
        }
    }
    static void contagemDeOcorrencias(int num1, int num2) throws InvalidParametersException {
        var valores = num1 - num2;
        if (num1 < num2){
            throw new InvalidParametersException();
        } else {
            for (var contagem = 1; contagem <= valores ; contagem++){
                System.out.printf("Imprimindo o número %s\n", contagem);
            }
        }
    }
}