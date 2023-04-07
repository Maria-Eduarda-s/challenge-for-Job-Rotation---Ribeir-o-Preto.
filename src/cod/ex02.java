
/*2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores 
 * anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, 
 * informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado 
 * pertence ou não a sequência.

IMPORTANTE:

Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser
previamente definido no código;
 * 
 */

package cod;

import java.util.Scanner;
public class ex02{
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int num1 = 0, num2 = 1, num3 = 0;
		
		
		while(num1 <= num) {
			num3 = num1;
			num1 = num1 + num2;
			num2 = num3;
			System.out.print(num3 ", ");
		}
		
		if(num3 == num) {
			System.out.println("O número informado pertence a sequência Fibonacci.");
		}
		else {
			System.out.println("O número informado não pertence a sequência Fibonacci.");
		}
		
	}

}

/*
 * ex entrada: num = 8
 * sequencia: 0,
 * num3(0) = num1(0)
 * num1(0) = num1(0) + num2(1)
 * num2(1) = num3(0)
 * 
 * sequencia: 0, 1,
 * num3(0) = num1(1)
 * num1(1) = num1(1) + num2(0)
 * num2(0) = num3(1)
 * 
 * sequencia: 0, 1, 1,
 * num3(1) = num1(1)
 * num1(1) = num1(1) + num2(1)
 * num2(1) = num3(1)
 * 
 * sequencia: 0, 1, 1, 2,
 * num3(1) = num1(2)
 * num1(2) = num1(2) + num2(1)
 * num2(2) = num3(2)
 *
 * sequencia: 0, 1, 1, 2, 3
 * num3(2) = num1(3)
 * num1(3) = num1(3) + num2(2)
 * num2(2) = num3(3)
 * 
 * sequencia: 0, 1, 1, 2, 3, 5
 * num3(3) = num1(5)
 * num1(5) = num1(5) + num2(3)
 * num2(3) = num3(5)
 * 
 * sequencia: 0, 1, 1, 2, 3, 5, 8
 * num3(5) = num1(8)
 * num1(8) = num1(8) + num2(5)
 * num2(5) = num3(8)
 * 
 */
