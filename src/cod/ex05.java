/*
 * 5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:

a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

b) Evite usar funções prontas, como, por exemplo, reverse;
 */

package cod;

import java.util.Scanner;

public class ex05 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		
		char[] chars = input.toCharArray();
		int x = chars.length - 1;
		int y = 0;
		
			while(y < x) {
			char temp = chars[y];
			chars[y] = chars[x];
			chars[x] = temp;
			y++;
			x--;
			}
		
		String newstring = new String(chars);
		System.out.println(newstring);
	}

}
/*a string input foi é convertida em um array de char(caracteres).
		 *x recebe chars.length - 1 que define a última posição do array(subtraindo -1 do valor total do array, obtemos a última posição).
		 *y recebe 0 dando a ele a primeira posição do array.
		 *
		 *com o laço de repetição while invertemos a posição dos caracteres armazenados no array
		 *, obtemos a seguinte lógica:
		 *
		 *exemplo de entrada: dado
		 *
		 *tamanho do array: 3
		 *
		 *
		 *enquanto y < x (y=0 e x=3)
		 *char temp = chars[y] 
		 *chars[y] = chars[x] (caractere na posição 0 é trocado pelo caractere na posição 3)
		 *chars [x] = temp
		 *y++ (y+1)
		 *x-- (x-1)
		 *(d a d o)
		 *(o a d d)
		 *
		 *enquanto y < x (y=1 e x=2)
		 *char temp = chars[y] 
		 *chars[y] = chars[x] (caractere na posição 1 é trocado pelo caractere na posição 2)
		 *chars [x] = temp
		 *y++ (y+1)
		 *x-- (x-1)
		 *(o a d d)
		 *(o d a d)
		 *
		 *enquanto y < x (y=2 e x=1)
		 *
		 *
		 *após a troca de posições dos caracteres, chars é convertido novamente em
		 *String e é mostrado na tela a partir do system.out.println().
		 *
		 *
		*/