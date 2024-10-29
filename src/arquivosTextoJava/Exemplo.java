package arquivosTextoJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Exemplo {
	
	//sempre criar os metodos acima do metodo main
	
	public static void gravar(ArrayList<String> lista, String nomedoarquivo) throws IOException {
		FileWriter arq = new FileWriter(nomedoarquivo);  //criando o arquivo
		PrintWriter gravarArq = new PrintWriter(arq);    //abrindo o arquivo
		
		//percorrer a lista e gravar no arquivo linha a linha:
		for (String linha: lista) {
		      gravarArq.println(linha);
		}
		gravarArq.close();//fecha o arquivo

	}
	
	public static void importar(String nomedoarquivo, ArrayList<String> lista) throws IOException {

		FileReader arq = new FileReader(nomedoarquivo); // objeto do tipo arquivo para leitura
		BufferedReader lerArq = new BufferedReader(arq); //buffer para leitura
		String linha = lerArq.readLine(); // lê a primeira linha
		// a variável "linha" recebe o valor "null" quando o processo
		// de repetição atingir o final do arquivo texto
		while (linha != null) {
		    lista.add(linha);
		    linha = lerArq.readLine(); // lê da segunda até a última linha
		arq.close();
		} 
	}


	public static void main(String[] args) {
		ArrayList<String> bandas = new ArrayList<String>();
		bandas.add("Metálica");
		bandas.add("Forró Boys");
		bandas.add("Artic Monkeys");
		bandas.add("Calcinha Preta");
		bandas.add("Soweto");
		
		//gravando no arquivo spotify.txt que foi criado através do metodo FileReader e trabalhando a exceção em caso de erro
		try {
			gravar(bandas,"C:\\Users\\FATEC ZONA LESTE\\Downloads\\spotify.txt");
			System.out.println("Gravação executada com sucesso!");
		} catch (IOException e) {
			System.out.println("Erro na gravação de arquivo :(");
			e.printStackTrace();
		}
		
		//leitura da lista de compras(que foi criada manualmente no computador
		ArrayList<String> compras = new ArrayList<String>();
		try {
			importar("C:\\Users\\FATEC ZONA LESTE\\Downloads\\listadecompras.txt", compras);
			System.out.print(compras);
		} catch (IOException e) {
			System.out.println("Erro de leitura :(");
		}

	}

}
