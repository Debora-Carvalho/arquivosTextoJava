package arquivosTextoJava;

import java.util.Scanner;

public class Erros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		
		try {
			System.out.println("Digite um número inteiro: ");
			n = entrada.nextInt();
			System.out.println("Você digitou: "+n);
		} catch (Exception e){
			System.out.println("Valor não é inteiro \n");
			System.out.println("Mensagem de erro: \n" + e.getMessage());
			System.out.println("Classe da exceção: \n" + e.getClass());
			//e.printStackTrace();
		} finally {
			System.out.println("Exemplo de bloco finally");
		}
		
		//no finally, colocamos o que deverá acontecer independentemente de erro ou não. Ex: fechar o arquivo ou banco de dados.

	}

}
