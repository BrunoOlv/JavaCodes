/*********************************************************************/
/**   ACH2001 - Introdução à Programação                            **/
/**   EACH-USP - Primeiro Semestre de 2020                          **/
/**   2020104 - Norton Trevisan Roman                               **/
/**                                                                 **/
/**   Segundo Exercício-Programa                                   **/
/**                                                                 **/
/**   Bruno de Oliveira Feitosa                    9017099          **/
/**                                                                 **/
/**   06/05/2020                                                    **/
/*********************************************************************/

/*
	Calculo para raiz quadrada
*/
public class Raiz {
	/*
		Calcula a raiz quadrada de um valor, com uma determinada
		precisao. Retorna esse valor, ou -1 quando:
		
		* a < 0
		* epsilon <= 0
		* epsilon >= 1
		
		Parametro:
			a - valor cuja raiz quadrada sera calculada
			epsilon - precisao do calculo
	*/
	static double module(double x_next, double x_previous){
		/*
			Metodo criado para retornar o modulo da diferença entre 2 numeros
		*/
		
		double subtract = x_next - x_previous;
		// Se a diferenca for negativa altero o sinal, caso contrario apenas atribuo a variavel
		double mod_calculated = subtract < 0 ? subtract = subtract*(-1) : subtract;		
		return mod_calculated;		
	}	
	
	static double raizQuadrada(double a, double epsilon) {
			// Retorno -1 aos casos que nao satisfazem as condicoes
			if (a < 0 || epsilon <= 0 || epsilon >= 1){				
				return -1;
			// Retorno 0 para evitar divisão por zero no processo iterativo qunando a = 0
			}else if(a == 0){
				return 0;
			}
			// Processo iterativo
			else{
				double x = a*0.5;				 
				double xi = 0;
				double mod = 1;
				while (mod >= epsilon){
					
					xi = 0.5*(x + a/x);
					mod = module(xi,x);
					x = xi;
					
				}return xi;
			}	
		}


	/*
		Apenas para seus testes. ISSO SERA IGNORADO NA CORRECAO
	*/
	public static void main(String[] args) {
		// escreva seu codigo (para testes) aqui

		// Exemplo de teste:
		double valor = 63;
		double precisao = 0.0001;
		System.out.println("Raiz de : "+valor+" = "+raizQuadrada(valor, precisao));
	}
}