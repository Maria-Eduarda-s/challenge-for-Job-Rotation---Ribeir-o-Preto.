
/*
 * Observe o trecho de código abaixo:

int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça

{

K = K + 1;

SOMA = SOMA + K;

}

imprimir(SOMA);

Ao final do processamento, qual será o valor da variável SOMA?
 */

package cod;

public class ex01 {

	public static void main(String[]args) {
		
		int indice = 13;
		int soma = 0;
		int k = 0;
		
		while (k < indice) {
		k = k + 1;
		soma = soma + k;
		}
		
		System.out.println(soma);
	}
}
/* O valor da variável soma é 91, pois devido ao laço de repetição while(enquanto)
 *  houve a adição de 1 à variável k(que faz o controle de repetição)
 *  e a adição de k + soma resultando nas seguintes operações:
 *
 *	1. k(0) = k(0) + 1
 *		soma(0) = soma(0) + k(1)
 *	
 *	2. k(1) = k(1) + 1
 *		soma(1) = soma(1) + k(2)
 *	
 *	3. k(2) = k(2) + 1
 *		soma(3) = soma(3) + k(3)
 *
 *	4. k(3) = k(3) + 1
 *		soma(6) = soma(6) + k(4)
 *
 *	5. k(4) = k(4) + 1
 *		soma(10) = soma(10) + k(5)
 *
 *	6. k(5) = k(5) + 1
 *		soma(15) = soma(15) + k(6)
 *
 *	7. k(6) = k(6) + 1
 *		soma(21) = soma(21) + k(7)
 *
 *	8. k(7) = k(7) + 1
 *		soma(28) = soma(28) + k(8)
 *
 *	9. k(8) = k(8) + 1
 *		soma(36) = soma(36) + k(9)
 *
 *	10. k(9) = k(9) + 1
 *		soma(45) = soma(45) + k(10)
 *
 *	11. k(10) = k(10) + 1
 *		soma(55) = soma(55) + k(11)
 *	
 *	12. k(11) = k(11) + 1
 *		soma(66) = soma(66) + k(12)
 *		
 *	13. k(12) = k(12) + 1
 *		soma(78) = soma(78) + k(13)
 *
 */