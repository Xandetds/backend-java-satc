package aula06condicionais.aula01ifelse;

import java.util.Scanner;

public class IfElse {

	/*
	* Escreva um programa que solicite ao usuário o preço de um item e,
	* com base no valor informado, exiba uma sugestão de ação:
	* CONDIÇÔES:
	* Se o valor for menor ou igual a 10, exiba: "Está barato, pode comprar."
	* Se o valor for maior que 10 e menor que 15, exiba: "Você pode pedir um desconto."
	* Se o valor estiver entre 15 (inclusive) e 17 (exclusive), exiba: "Pode pesquisar mais."
	* Se o valor for maior ou igual a 17, exiba: "Muito caro."
	**/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o preço do item");
		double valor = scan.nextDouble();

		if (valor <= 10){
			System.out.println("Está barato, pode comprar");
		} else if (valor > 10 && valor < 15){ //Da pra Simplificar!!
			System.out.println("Você pode pedir um desconto");
		} else if (valor >=15  && valor < 17){
			System.out.println("Pode pesquisar mais");
		}else { // valor >= 17
			System.out.println("Muito caro");
		}
	}
}
