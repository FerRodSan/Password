package Password;

public class Passworld implements Generable {

	public static void main(String[] args) {
		Passworld instancia = new Passworld();
		System.out.println(instancia.generatePassword(4, 4, 4));
	}

	@Override
	public String generatePassword(int letter, int numbers, int symbols) {
		int tamanoMaximo = letter + numbers + symbols;
		StringBuilder contrasena = new StringBuilder();
		for (int i = 0; i < tamanoMaximo; i++) {
			int azar = generanumeroAleatorio();
			switch (azar) {
			case 1:
				contrasena.append(ponLetra());
				break;
			case 2:
				contrasena.append(ponNumero());
				break;
			case 3:
				contrasena.append(ponSimbolo());
				break;
			}
		}
		return contrasena.toString();
	}

	private Object ponSimbolo() {
		String simbolos = ",.-*-/@#€+/";
		return simbolos.charAt((int) (Math.random() * simbolos.length()));
	}

	private Object ponNumero() {
		String numeros = "1234567890";
		return numeros.charAt((int) (Math.random() * numeros.length()));
	}

	private Object ponLetra() {
		String letras = "adrhfyoedcjdyagejñopq";
		return letras.charAt((int) (Math.random() * letras.length()));
	}

	private int generanumeroAleatorio() {
		int numAleatorio = (int) (Math.random() * 3) + 1;
		return numAleatorio;
	}

}
