package invertirArray;

import java.util.Scanner;

public class InvertirArray
{
	
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		final int TAM = 10;
		int[] numeros = new int[TAM];
		int aux;
		int cont = 0;
		for(int i = 0; i < TAM; i++)
		{
			System.out.print("Introduce número: ");
			numeros[i] = sc.nextInt();
		}
		sc.close();
		for(int i = TAM - 1; i >= (TAM/2); i--)
		{
			aux = numeros[i];
			numeros[i] = numeros[cont];
			numeros[cont] = aux;
			cont++;  	
		}
		for(int i = 0; i < TAM; i++)
		{
			System.out.println(numeros[i]);
		}
	}
}

