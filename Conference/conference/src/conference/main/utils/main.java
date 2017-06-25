package conference.main.utils;

public class main {

	public static void main(String[] args) {
		int a = entryTime("91566165", "639485712");
	}
		
	static int entryTime(String s, String keypad) {
		// read the keyboard numbers
		char[] first = keypad.substring(0, 3).toCharArray();
		char[] second = keypad.substring(3, 6).toCharArray();
		char[] third = keypad.substring(6, 9).toCharArray();

		// read the numbers to calculate time
		char[] numbers = s.toCharArray();

		// matrix keyboard
		char[][] keyPadNumbers = new char[3][3];

		putInMatrixNumbersValues(keyPadNumbers, 0, first);
		putInMatrixNumbersValues(keyPadNumbers, 1, second);
		putInMatrixNumbersValues(keyPadNumbers, 2, third);

		// calculate time
		int cont = calculateTimer(numbers, keyPadNumbers);
		return cont;
	}

	private static void putInMatrixNumbersValues(char[][] keyPadNumbers, int file, char[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			keyPadNumbers[file][i] = numbers[i];
		}
	}

		private static int calculateTimer(char[] numbers, char[][] keyPadNumbers) {
			int cont = 0;
			int fila = 0;
			int columna = 0;
			int aux = 0;
			boolean encontrado;
			
			for(int i = 0; i< numbers.length; i++){
				encontrado = false;
				for(int x = 0; x<3;x++){
					if(!encontrado){
						for(int k = 0; k<3;k++){
							if(numbers[i] == keyPadNumbers[x][k]){
								if(i != 0){
									if(fila == x)
									{
										aux = k-columna;
										aux = convertPositive(aux);
										cont = cont + (aux);
									}
									else
									{
										aux = k-columna;
										aux = convertPositive(aux);
										
										if(aux<=1){
											aux = x-fila;
											aux = convertPositive(aux);
										}
										cont = cont + (aux);
									}
								}
								fila = x;
								columna = k;
								encontrado = true;
								break;
							}
						}
					}
					else
						break;
				}
			}
			return cont;
		}
		
		private static int convertPositive(int aux){
			if(aux<0)
				aux = aux * -1;
			return aux;
		}

}
