package appSorteador;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("Digite número máximo a sortear: ");
		int numeroMaximo = ler.nextInt();
		System.out.print("Quantos números deseja sortear: ");
		int quantidade = ler.nextInt();
		int numeros [] = new int[quantidade];
		
		for(int i = 0; i< quantidade; i++) {
			numeros[i] = random.nextInt(numeroMaximo);
		}		
		System.out.println("Números sorteados: " + Arrays.toString(numeros));
		
		ler.close();
	}

}
