package Iterator;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class ConcreteGradeBook implements CollectionIterable {
	private Comparator<Estudiante> cmp;
	private List<Estudiante> lista;
	
	public ConcreteGradeBook(Comparator<Estudiante> cmp, List<Estudiante> lista) {
		this.cmp = cmp;
		this.lista = lista;
	}
	
	public List<Estudiante> getList(){
		return this.lista;
	}

	@Override
	public IteratorBy createIteratorBy() {
		Collections.sort(lista, cmp);
		return new GradeBook(this);
	}

}
