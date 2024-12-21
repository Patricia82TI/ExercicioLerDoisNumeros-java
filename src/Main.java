import java.util.Scanner;

//Faça um programa que leia 2 números inteiros e imprima na tela se a soma
//entre eles for maior que 10
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


        System.out.println("Digite um número:");
        int a = sc.nextInt();

        System.out.println("Digite um número:");
        int b = sc.nextInt();

        int soma = a + b;

        if(soma > 10){
            System.out.println("A soma é maior que 10");
        }else{
            System.out.println("A soma não é maior que 10");
        }
    }
}