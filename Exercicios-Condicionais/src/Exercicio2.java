//Um posto está vendendo combustíveis com a seguinte tabela de descontos:
//Álcool:
//até 20 litros, desconto de 3% por litro
//acima de 20 litros, desconto de 5% por litro
//Gasolina:
//até 20 litros, desconto de 4% por litro
//acima de 20 litros, desconto de 6% por litro
//Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível
// (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a
// ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 e o preço
// do litro do álcool é R$ 1,90

import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de litros vendidos:");
        double litrosVendidos = entrada.nextDouble();

        System.out.println("Informe o tipo de combustível: a - álcool, g - gasolina");
        String combustivel = entrada.next();


        double valorPagar = 0;

        if (litrosVendidos <= 20){
            if (combustivel.equals("a")){
                double desconto = litrosVendidos * 1.90 * 3/100;
                valorPagar = litrosVendidos * 1.90 - desconto;
            } else if (combustivel.equals("g")) {
               double desconto = litrosVendidos * 2.50 * 4/100;
               valorPagar = litrosVendidos * 2.50 - desconto;
            }
        } else if (litrosVendidos > 20) {
            if(combustivel.equals("a")){
                double desconto = litrosVendidos * 1.90 * 5/100;
                valorPagar = litrosVendidos * 1.90 - desconto;
            } else if (combustivel.equals("b")) {
                double desconto = litrosVendidos * 2.50 * 6/100;
                valorPagar = litrosVendidos * 2.50 - desconto;
            }
        }

        System.out.printf("O valor a ser pago é R$%.2f",valorPagar);
    }
}
