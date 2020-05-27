/*********************************************************************/
/**   ACH2001 - Introdução à Programação                            **/
/**   EACH-USP - Primeiro Semestre de 2020                          **/
/**   2020104 - Norton Trevisan Roman                               **/
/**                                                                 **/
/**   Primeiro Exercício-Programa                                   **/
/**                                                                 **/
/**   Bruno de Oliveira Feitosa                    9017099          **/
/**                                                                 **/
/**   29/03/2020                                                    **/
/*********************************************************************/

/*
	Caixa eletrônico das Ilhas Weblands, com estoque ilimitado de cédulas
	de B$50,00, B$10,00, B$5,00 e B$1,00.
*/
public class CaixaEletronico {
	// Número de cédulas de B$50,00
	static int n50;
	
	// Número de cédulas de B$10,00
	static int n10;

	// Número de cédulas de B$5,00
	static int n5;
	
	// Número de cédulas de B$1,00
	static int n1;


	/*
		Determina a quantidade de cada nota necessária para totalizar
		um determinado valor de retirada, de modo a minimizar a quantidade
		de cédulas entregues.
		
		Abastece as variáveis globais n50,n10, n5 e n1 com seu respectivo
		número de cédulas.
		
		Parâmetro:
			valor - O valor a ser retirado
	*/
	static void fazRetirada(int valor){
		
			/*
				Estrutura para identificar se o valor é nulo, negativo ou positivo.
			*/
			
			//Caso o valor seja nulo, o método termina atribuindo zero às variáveis.
			if (valor == 0){
				n1 = 0;
				n5 = 0;
				n10 = 0;
				n50 = 0;
				
			// Caso o valor seja um inteiro negativo, o método termina atribuindo -1 às variáveis.	
			}else if(valor < 0){
				n1 = -1;
				n5 = -1;
				n10 = -1;
				n50 = -1;
				
			/*			
				Se o valor for um inteiro positivo e maior que zero,
				o método identifica o número e tipo de cada uma das notas necessárias 
				atribuindo os números às variáveis correspondentes.			
			*/
			}else{
				/*
					A ordem de verificação é proposital para que o menor número de notas seja atingido.
					Para cada if o número inteiro de notas é armazenado na variável correspondente 
					e o resto da divisão atualiza a variável de valor.
					
				*/
				if(valor >= 50){
					n50 = valor / 50;
					valor = valor % 50;				
				}
				if(valor >= 10){
					n10 = valor / 10;
					valor = valor % 10;
				}
				if (valor >= 5){
					n5 = valor / 5;
					valor = valor % 5;
				}
				if(valor >= 1){
					n1 = valor;
				}
				
			}
		}
	
	
	
	public static void main(String[] args) {
		// escreva seu código para testes

		// Exemplo de teste:
		fazRetirada(-3);
		System.out.println("\nNotas de 50: "+n50);
		System.out.println("Notas de 10: "+n10);
		System.out.println("Notas de 5:  "+n5);
		System.out.println("Notas de 1:  "+n1);
	}
}
