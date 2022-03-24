package lista_ligada;

public class Programa {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		lista.adicionar("AC");
		lista.adicionar("BA");
		lista.adicionar("CE");
		lista.adicionar("DF");
		lista.adicionar("AM");
		System.out.println("Tamanho: " + lista.getTamanho());
		System.out.println("Primeiro: "+ lista.getPrimeiro().getValor());
		System.out.println("Último: " + lista.getUltimo().getValor());
		/*System.out.println(lista.get(0).getValor());
		System.out.println(lista.get(1).getValor());
		System.out.println(lista.get(2).getValor());
		System.out.println(lista.get(3).getValor());
		System.out.println(lista.get(4).getValor());*/
		for(int i = 0; i < lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
	}

}
