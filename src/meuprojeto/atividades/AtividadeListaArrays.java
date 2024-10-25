package meuprojeto.atividades;

import java.util.Scanner;

public class AtividadeListaArrays {
	public static void main(String[] args) {
		
	}
	
	//Questão 1
	public static void calcularMediaPonder() {
		Scanner sc = new Scanner(System.in);
		
		double notaMatematica;
		double notaPortugues;
		double notaFisica;
		double notaLiteratura;
		double notaIngles;
		double mediaPonderada;
		
		System.out.println("Vamos calcular a media ponderada das suas notas !");
		System.out.print("Digite uma nota de Matemática: ");
		notaMatematica = sc.nextDouble();
		System.out.print("Digite uma nota de Português: ");
		notaPortugues = sc.nextDouble();
		System.out.print("Digite uma nota de Física: ");
		notaFisica = sc.nextDouble();
		System.out.print("Digite uma nota de Literatura: ");
		notaLiteratura = sc.nextDouble();
		System.out.print("Digite uma nota de Inglês: ");
		notaIngles = sc.nextDouble();
		
		mediaPonderada = (notaPortugues + notaFisica + notaIngles + notaLiteratura + notaMatematica) / 5;
		
		System.out.println("A média ponderado das suas notas é: " + mediaPonderada);
	}
	
	//Questão 2
	public static void imprimirInverso10() {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		for(int indice = array.length - 1; indice >= 0; indice-- ) {
			if(indice == 0) {
				System.out.print(array[indice]);
			}else {
				System.out.print(array[indice] + ",");
			}
		}
	}
	
	//Questão 3
	public static void imprimirInverso100(){
		int[] array = new int[100];
		
		for(int i = 0; i< array.length; i++) {
			array[i] = (int) (Math.random() * 50);
		}
		
		for(int indice = 0; indice < array.length; indice++ ) {
			if(indice == array.length - 1) {
				System.out.print(array[indice]);
			}else {
				System.out.print(array[indice] + ",");
			}
		}
		
		System.out.println();
		
		for(int indice = array.length - 1; indice >= 0; indice-- ) {
			if(indice == 0) {
				System.out.print(array[indice]);
			}else {
				System.out.print(array[indice] + ",");
			}
		}
	}
	
	//Questão 4
	public static void imprimirPrimo100() {
		int[] array = new int[100];
		
		for(int i = 0; i< array.length; i++) {
			array[i] = (int) (Math.random() * 50);
		}
		
		for(int indice = 0; indice < array.length; indice++ ) {
			if(indice == array.length - 1) {
				System.out.print(array[indice]);
			}else {
				System.out.print(array[indice] + ",");
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < array.length; i++) {
			int contador = 0;
			if(array[i] > 2) {
				for(int j = 1; j <= array[i]; j++) {
					if(array[i] % j == 0) {
						contador++;
					}
				}
				if(contador == 2) {
					System.out.print(array[i] + " ");
				}
			}
		}
	}
	
	//Questão 5
	public static void imprimirImpar100() {
		int[] array = new int[100];
		
		for(int i = 0; i< array.length; i++) {
			array[i] = (int) (Math.random() * 50);
		}
		
		for(int indice = 0; indice < array.length; indice++ ) {
			if(indice == array.length - 1) {
				System.out.print(array[indice]);
			}else {
				System.out.print(array[indice] + ",");
			}
		}
		
		System.out.println();
		
		for(int indice = 0; indice < array.length; indice++) {
			if(array[indice] % 2 != 0) {
				System.out.print(array[indice] + " ");
			}
		}
	}
	
	//Questão 6
	public static void imprimirPar100() {
		int[] array = new int[100];
		
		for(int i = 0; i< array.length; i++) {
			array[i] = (int) (Math.random() * 50);
		}
		
		for(int indice = 0; indice < array.length; indice++ ) {
			if(indice == array.length - 1) {
				System.out.print(array[indice]);
			}else {
				System.out.print(array[indice] + ",");
			}
		}
		
		System.out.println();
		
		for(int indice = 0; indice < array.length; indice++) {
			if(array[indice] % 2 == 0) {
				System.out.print(array[indice] + " ");
			}
		}
	}
	
	//Questão 7
	public static void imprimirMaiorMenor100() {
		int[] array = new int[100];
		
		for(int i = 0; i< array.length; i++) {
			array[i] = (int) (Math.random() * 50);
		}
		
		for(int indice = 0; indice < array.length; indice++ ) {
			if(indice == array.length - 1) {
				System.out.print(array[indice]);
			}else {
				System.out.print(array[indice] + ",");
			}
		}
		
		System.out.println();
		
		int maiorNumero = array[0];
		int menorNumero = maiorNumero;
		
		for(int indice = 0; indice < array.length; indice++) {
			if(array[indice] > maiorNumero) {
				maiorNumero = array[indice];
			}else if(array[indice] < menorNumero) {
				menorNumero = array[indice];
			}
		}
		
		System.out.print(maiorNumero + " " + menorNumero + " ");
	}
	
	//Questão 8
	public static void imprimirMedia100() {
		int[] array = new int[100];
		
		for(int i = 0; i< array.length; i++) {
			array[i] = (int) (Math.random() * 50);
		}
		
		for(int indice = 0; indice < array.length; indice++ ) {
			if(indice == array.length - 1) {
				System.out.print(array[indice]);
			}else {
				System.out.print(array[indice] + ",");
			}
		}
		
		System.out.println();
		
		float somaNumeros = 0f;
		
		for(int indice = 0; indice < array.length; indice ++) {
			somaNumeros = (float) (somaNumeros + array[indice]); 
		}
		
		float media = somaNumeros / array.length;
		
		System.out.println("A média do array é: " + media);
	}
	
}
