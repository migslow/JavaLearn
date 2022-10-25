package busca;


public class Busca {
	//B�squeda binaria. El vector debe estar ordenado.
	public	static int busquedaBinaria(int[] superonce, int valorbuscado)
	 {
	 	int izquierda=0, derecha = superonce.length -1, centro;
	 	while (izquierda <= derecha)
	 	{
	 		centro = (derecha-izquierda)/2 + izquierda;
	 		if (superonce[centro]==valorbuscado)
	 			return centro;
	 		if (valorbuscado < superonce[centro])
	 			derecha= centro -1;
	 		else
	 			izquierda=centro+1;
	 		
		} // del while
		return -1; // No lo ha encontrado
	 	
	 } // de busquedaBinaria
/**
 * 
 */


	//B�squeda binaria recursiva. El vector debe estar ordenado.
public static int buscaBinariaRecursiva(int[] array, int izquierda, int derecha, int valorBuscado) {
	int media = (derecha + izquierda) / 2;
	int valorMedio = array[media];
	if (izquierda > derecha)
		return -1;
	else if(valorMedio == valorBuscado) 
		return media;
	else if (valorMedio < valorBuscado)
		return buscaBinariaRecursiva(array, media+1, derecha, valorBuscado);
	else
		return buscaBinariaRecursiva(array, izquierda, media-1, valorBuscado);
}// de busquedaBinariaRecursiva



} // de Busca
