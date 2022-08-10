import java.lang.reflect.Array;
import java.util.Scanner;

public class ExercicioUm {

  public static void call(Scanner scanner) {
    System.out.println("=== EXERCÍCIOS - LISTA 1 ===");

    System.out.println("+-------------------------------------------------------+");
    System.out.println("| 1 - Calcule a Média                                   |");
    System.out.println("| 2 - Calcule a Área                                    |");
    System.out.println("| 3 - Calcule o Volume                                  |");
    System.out.println("| 4 - Valor é maior que o dobro de outro valor          |");
    System.out.println("| 5 - Cálculo de Bhaskara                               |");
    System.out.println("| 6 - Velocidade Média                                  |");
    System.out.println("| 7 - Percentual de Imposto                             |");
    System.out.println("| 8 - Valor é par ou ímpar                              |");
    System.out.println("| 9 - Comparar dois valores de String                   |");
    System.out.println("| 10 - Valor double em string e convertido para inteiro |");
    System.out.println("| 11 - Imposto de renda de um salário                   |");
    System.out.println("| 12 - DESAFIO                                          |");
    System.out.println("+-------------------------------------------------------+");

    int menu = 0;
    try {
      menu = scanner.nextInt();
    } catch (Exception e) {
      System.err.println(e.getMessage());
      menu = 0;
    }

    switch (menu) {
      // 1) Crie um programa que calcule a média (`(nota1 + nota2 + nota3 / 3)`)
      case 1:

        break;
      // 2) Crie um programa que calcule a área (`lado1 * lado2`)
      case 2:
        break;
      // 3) Crie um programa que calcule o volume (`largura * altura * profundidade`)
      case 3:
        // volume(double largura, double altura, double profundidade)
        break;
      // 4) Crie um programa que avalie se um valor é maior do que o dobro de outro
      // valor
      case 4:
        break;
      // 5) Crie um programa que calcule _bhaskara_
      case 5:
        // bhaskara(int a, int b, int c);
        break;
      // 6) Crie um programa que calcule a velocidade média de uma viagem (`distancia
      // (km) / tempo (h)`)
      case 6:
        // mediaViagem(double distancia, double tempo)
        break;
      // 7) Crie um programa que calcule o percentual de imposto pago (`faturamento \
      // qtd imposto`)
      case 7:
        // percentualImposto(double faturamento, double qtdImposto)
        break;
      // 8) Crie um programa que teste se um valor é par ou ímpar
      case 8:
        // parOuImpar(int valor)
        break;
      // 9) Crie um programa que compare dois valores Strings
      case 9:
        // compareString(String stringUm, String stringDois)
        break;
      // 10) Crie um programa que tenha uma variável com ponto em String e converta
      // seu valor para inteiro
      case 10:
        // convertString(String valor);
        break;
      // 11) Crie um programa que receba o salário e diga o valor de imposto de renda
      // conforme abaixo:
      // Base | Alíquota
      // --------- | ------
      // Até 1.903,98 | Isento
      // De 1.903,99 até 2.826,65 | 7,5%
      // De 2.826,66 até 3.751,05 | 15%
      // De 3.751,06 até 4.664,68 | 22,5%
      // Acima de 4.664,68 | 27,5%
      case 11:
        // percentualImpostoSalario(double salario);
        break;
      // DESAFIO - Crie um programa que teste se um número é primo
      case 12:
        // testePrimo(int valor)
        break;
      default:
        System.out.println("Operação inválida");
        break;
    }
  }

  public static double media(double notaUm, double notaDois, double notaTres) {

    return (notaUm + notaDois + notaTres) / 3;
  }

  public static double area(double ladoUm, double ladoDois) {
    return ladoUm * ladoDois;
  }

  public static double volume(double largura, double altura, double profundidade) {
    return largura * altura * profundidade;
  }

  public static boolean valorMaiorQueDobro(double base, double verificar) {

    return true ? base > verificar * 2 : false;
  }

  public static double[] bhaskara(int a, int b, int c) {
    double delta = (b * b) - (4 * a * c);

    double xLinha[] = new double[] { 0, 0 };
    xLinha[0] = (-b + Math.sqrt(delta)) / (2 * a);
    xLinha[1] = (-b - Math.sqrt(delta)) / (2 * a);
    return xLinha;
  }

  public static double mediaViagem(double distancia, double tempo) {

    return distancia / tempo;
  }

  public static double percentualImposto(double faturamento, double qtdImposto) {
    return (qtdImposto / faturamento) * 100;
  }

  public static boolean parOuImpar(int valor) {
    return true ? valor % 2 == 0 : false;
  }

  public static boolean compareString(String stringUm, String stringDois) {
    return true ? stringUm.equals(stringDois) : false;
  }

  public static int convertString(String valor) {
    return (int) Double.parseDouble(valor);
  }

  public static double percentualImpostoSalario(double salario) {
    if (salario <= 1903.98) {
      return 0;
    } else if (salario >= 1903.99 && salario <= 2826.65) {
      return 7.5;
    } else if (salario >= 2826.66 && salario <= 3751.05) {
      return 15;
    } else if (salario >= 3751.06 && salario <= 4664.68) {
      return 22.5;
    } else {
      return 27.5;
    }

  }

  public static boolean testePrimo(int valor) {
    int contador = 0;
    for (int i = 1; i <= valor; i++) {
      if (valor % i == 0) {
        contador++;
      }
    }
    return true ? contador == 2 : false;
  }

}
