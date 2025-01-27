package sintaxe;

public class MyClass {

	public static void main(String[] args) {
		System.out.println(
				"Para chamar esse metódo de impressão com atalho basta escreve sysout e "
				+ "apertar CTRL + ESPAÇO");
		
		
		int ano = 2025;
		final String BR = "Brasil";
		
		
		System.out.println("Ano: " + ano + " Pais: " + BR);
		
		// Para declarar uma variavel, TIPO + nome + valor (opcional, você pode declarrar a variavel sem o valor)
		String meuNome = "Marcos";
		int anoFabricacao = 2002;
		
		boolean verdadeira = true;
	
		String primeiroNome = "marcos";
		String segundoNome = "vinicius";
		
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		System.out.println(nomeCompleto);
	}
	
	
	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		
		return primeiroNome.concat(" ").concat(segundoNome); 
	}

}
