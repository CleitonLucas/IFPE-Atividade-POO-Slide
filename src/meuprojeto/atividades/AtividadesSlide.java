package meuprojeto.atividades;

import java.util.Scanner;

public class AtividadesSlide {
	
	//Método main define o ponto de partida do nosso código
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		String nome;
		
		System.out.print("Digite seu nome: ");
		nome = sc.next();
		
		System.out.println("Olá " + nome + " bem-vindo ao nosso teste de programa");
		System.out.println("Digite o número da opção que você gostaria de fazer:");
		System.out.println("Opção 1 - Calcular IMC");
		System.out.println("Opção 2 - Calcular Metabolismo Basal");
		System.out.println("Opção 3 - Verificar se um número é par ou ímpar");
		opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			calcularIMC();
			break;
		case 2:
			calcularMetaBasal();
			break;
		case 3:
			verificarParImpar();
			break;
		default:
			System.err.println("Opção inválida ! Reinicie o programa");
			break;
		}
		
		sc.close();
	}
	
	//Podem ser acessadas de qualquer lugar, seja de dentro da mesma classe, de outras classes do mesmo pacote, ou até de classes externas em outros pacotes.
	//São usadas para definir a interface pública de uma classe, ou seja, os métodos que devem estar disponíveis para outros objetos ou classes.
	public static void calcularIMC() {
		Scanner sc2 = new Scanner(System.in);
		
		//Utilizar o tipo double ao invés de float para calcular o imc pois possui maior precisão de casas decimais, além da quantidade de memória 
		double peso;
		double altura;
		double imc;
		
		System.out.println("Beleza ! Vamos calcular seu IMC");
		System.out.print("Primeiro, digite seu peso: ");
		peso = sc2.nextDouble();
		System.out.print("Agora, digite sua altura: ");
		altura = sc2.nextDouble();
		
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
		
		sc2.close();
		
	}
	
	//Só podem ser acessadas dentro da própria classe onde foram definidas. Nenhuma outra classe, nem mesmo subclasses, tem acesso a esses métodos.
	//São usadas para encapsular a lógica que não deve ser exposta externamente, mantendo a implementação interna da classe isolada e controlada.
	private static void calcularMetaBasal() {
		Scanner sc3 = new Scanner(System.in);
		
		String sexo;
		int idade;
		double peso;
		double metaBasal;
		
		System.out.println("Vejo que optou por calcular seu Metabolismo Basal, vamos lá !");
		System.out.print("Primeiro, digite seu peso: ");
		peso = sc3.nextDouble();
		System.out.print("Segundo, digite sua idade: ");
		idade = sc3.nextInt();
		System.out.print("Por último, digite seu sexo, sendo 'M' (masculino) ou 'F' (feminino): ");
		sexo = sc3.next();
		
		if(sexo.equals("M")) {
			if((idade <= 18) && (idade < 30)) {
				metaBasal = (15.057 * peso) + 679;
				System.out.println("Seu metabolismo basal é de " + metaBasal + " cal/dia");
			}else if((idade >= 30) && (idade < 60)) {
				metaBasal = (11.6 * peso) + 879;
				System.out.println("Seu metabolismo basal é de " + metaBasal + " cal/dia");
			}else {
				metaBasal = (13.5 * peso) + 487;
				System.out.println("Seu metabolismo basal é de " + metaBasal + " cal/dia");
			}
		}else if(sexo.equals("F")){
			if((idade <= 18) && (idade < 30)) {
				metaBasal = (14.7 * peso) + 486.6;
				System.out.println("Seu metabolismo basal é de " + metaBasal + " cal/dia");
			}else if((idade >= 30) && (idade < 60)) {
				metaBasal = (8.7 * peso) + 829;
				System.out.println("Seu metabolismo basal é de " + metaBasal + " cal/dia");
			}else {
				metaBasal = (10.5 * peso) + 597;
				System.out.println("Seu metabolismo basal é de " + metaBasal + " cal/dia");
			}
		}else {
			System.err.println("Sexualidade informada inválida ! verifique a opção escolhida, lembre-se utilize letras maiúculas");
		}
		
		sc3.close();
		
	}
	
	public static void verificarParImpar() {
		Scanner sc4 = new Scanner(System.in);
		
		double numero;
		
		System.out.print("Digite o número que você quer verificar (Por favor digite numero inteiros): ");
		numero = sc4.nextDouble();
		
		if(numero == Math.floor(numero)) {
			if(numero % 2 == 0) {
				System.out.println("O número " + numero + " é Par.");
			}else {
				System.out.println("O número " + numero + " é Ímpar.");
			}
		}else {
			System.err.println("Este número não é um inteiro !");
		}
		
		sc4.close();
	}
	
}
