import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MiListaCalculador {
	private List <Integer> lista;
	public MiListaCalculador(List<Integer> lista2) {
		this.lista=lista2;
	}
	/**
	 * 
	 * @return la suma de todos los elementos de la lista
	 */
	public int sumarTodo() {
		return lista.stream().mapToInt(i->i).sum();
	}
	public int numMayor() {
		return lista.stream().reduce(1, Integer::max);
	}
	public int numMenor() {
		 return lista.stream().reduce(1, Integer::min);
	}
	public List ordenar() {
		return (List) lista.stream().mapToInt(i->i).sorted();
		
	}
	public void imprimirLista() {
		lista.stream().forEach(System.out::println);
	}
}
