package contagemClienteCombustivel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int alcool = 0, gasolina = 0, diesel = 0, cont = 0;

		while (cont != 4) {

			System.out.print("Digite o código do combustível: ");

			double teste = sc.nextDouble();

			while (teste != 1 && teste != 2 && teste != 3 && teste != 4) {
				System.out.print("Digite o código correto: ");
				teste = sc.nextDouble();
			}
			cont = (int) teste;
			if (cont == 1) {
				alcool += 1;
				} else if (cont == 2) {
					gasolina += 1;
				} else if (cont == 3) {
					diesel += 1;
				}
		}
		System.out.println();
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);

		sc.close();

	}

}
