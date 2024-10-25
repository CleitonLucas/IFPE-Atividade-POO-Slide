package meuprojeto.atividades;

import java.util.Scanner;

public class AtividadeAlgoritmoBasico {
	public static void main(String[] args) {
		
	}
	
	//Questão 1
	
	
	//Questão 2
	public static void calcularIMC() {
		Scanner sc = new Scanner(System.in);
		
		double peso;
		double altura;
		double imc;
		
		System.out.println("Beleza ! Vamos calcular seu IMC");
		System.out.print("Primeiro, digite seu peso: ");
		peso = sc.nextDouble();
		System.out.print("Agora, digite sua altura: ");
		altura = sc.nextDouble();
		
		imc = peso/(Math.pow(altura, 2));
		
		if(imc < 19) {
			System.out.println("O seu IMC é: " + imc + ", você esta abaixo do peso");
		}else if((imc >= 19) && (imc < 25)) {
			System.out.println("O seu IMC é: " + imc + ", você esta com o peso normal");
		}else if((imc >= 25) && (imc < 30)) {
			System.out.println("O seu IMC é: " + imc + ", você esta com sobrepeso");
		}else if((imc >=30) && (imc < 40)) {
			System.out.println("O seu IMC é: " + imc + ", você esta com obesidade do tipo 1");
		}else {
			System.out.println("O seu IMC é: " + imc + ", você esta com obesidade mórbida");
		}
	}
	
	//Questão 3
	public static void calcularAreaTrapezio() {
		Scanner sc = new Scanner(System.in);
		
		float baseMenor;
		float baseMaior;
		float altura;
		
		System.out.println("Vamos calular a área do trapézio");
		System.out.println("OBS: é importante que todas as medidas estejam em cm²");
		System.out.print("Primeiro, digite a medida da base menor: ");
		baseMenor = sc.nextFloat();
		System.out.print("Agora, digite a medida da base maior: ");
		baseMaior = sc.nextFloat();
		System.out.println("Por último, digite a medida da altura: ");
		altura = sc.nextFloat();
		
		float areaTrapezio = (float) ((baseMaior + baseMenor) * altura)/ 2;
		
		System.out.println("A área do trapézio em cm² é: " + areaTrapezio);
	}
	
	//Questão 4
	public static void verificarNumeroMaior(int num1, int num2) {
		if(num1 > num2) {
			System.out.println("O número " + num1 + " é maior que o " + num2);
		}else if(num2 > num1) {
			System.out.println("O número " + num2 + " é maior que o " + num1);
		}else {
			System.out.println("Os dois números são iguais");
		}
	}
	
	//Questão 5
	public static void identificarParImpar(int numero) {
		if(numero % 2 == 0) {
			System.out.println("O número " + numero + " é PAR");
		}else {
			System.out.println("O número " + numero + " é ÍMPAR");
		}
	}
	
}
