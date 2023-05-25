

//1 - Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do
// Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 10% para o INSS e que
// o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O
// Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário
// o valor da sua hora e a quantidade de horas trabalhadas no mês.

//Desconto do IR:
//Salário Bruto até 900 (inclusive) - isento
//Salário Bruto até 1500 (inclusive) - desconto de 5%
//Salário Bruto até 2500 (inclusive) - desconto de 10%
//Salário Bruto acima de 2500 - desconto de 20%

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe quanto você ganha por hora:");
        double salarioHora = entrada.nextDouble();

        System.out.println("Informe quantas horas foram trabalhadas:");
        double horasTrabalhadas = entrada.nextDouble();

        double salarioBruto = salarioHora * horasTrabalhadas;
        double inss = salarioBruto * 10/100;
        double fgts = salarioBruto * 11/100;
        double impostoRenda = 0;

        if(salarioBruto <= 900){
            impostoRenda += 0;
        } else if (salarioBruto <= 1500) {
            impostoRenda = salarioBruto * 5/100;
        } else if (salarioBruto <= 2500){
            impostoRenda = salarioBruto * 10/100;
        } else {
            impostoRenda = salarioBruto * 20/100;
        }

        double descontos = impostoRenda + inss;
        double salarioLiquido = salarioBruto - inss - impostoRenda;

        System.out.printf("Salário Bruto: R$%.2f \r\n", salarioBruto);
        System.out.printf("(-) IR (5 porcento): R$%.2f \r\n", impostoRenda);
        System.out.printf("(-) INSS (10 porcento): R$%.2f \r\n", inss);
        System.out.printf("FGTS (11 porcento): R$%.2f \r\n", fgts);
        System.out.printf("Total de descontos : R$%.2f \r\n", descontos);
        System.out.printf("Salário Líquido : R$%.2f \r\n", salarioLiquido);

    }
}
