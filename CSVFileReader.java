package br.com.everis.exerciciofinal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

/**
 * Programa para leitura de um arquivo CSV
 * @author Vitor Alves
 *
 */

public class CSVFileReader extends Book {

	public Set<Book> read(String fileName)   {

		Set<Book> lerArquivo = new HashSet<Book>();
		BufferedReader livros;
		
			try {
				livros = new BufferedReader(new FileReader(fileName));
				String linha;
				
				/**
				 * Laço que verifica todas as linhas do arquivo CSV e cadastra as informações na classe Book
				 */
				
				while ((linha = livros.readLine()) != null) {
					String[] coluna = linha.split(";");
					String titulo = coluna[0];
					String nome = coluna[1];
					String codigoBarras = coluna[2];
					int ano = Integer.parseInt(coluna[3]);

					lerArquivo.add(new Book(titulo, nome, codigoBarras, ano));
				}
				
				livros.close();
			
			} catch (FileNotFoundException e) {
				System.out.println("Arquivo não encontrado!");
			
			} catch (Exception e) {
				System.out.println("Arquivo incompleto ou corrompido!");
			} 


		return lerArquivo;

	}
	
	/**
	 *  Recebe o arquivo CSV e imprime o resultado no console
	 * @param args
	 */

	public static void main(String[] args) {

		Set<Book> novoArquivo = new CSVFileReader().read("D:\\Curso Java Everis\\ExercicioFinal.csv");

		for (Book book : novoArquivo) {
			System.out.println(book);

		}

	}
}
