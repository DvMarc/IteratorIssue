package Iterator;

import java.util.List;

public class GradeBook implements IteratorBy {
	private ConcreteGradeBook gradeBook;
	private Integer index;
	
	
	public GradeBook(ConcreteGradeBook gradeBook) {
		this.gradeBook = gradeBook;
		index = 0;
	}

	@Override
	public boolean hasNext() {
		index++;
		return gradeBook.getList().get(index-1) != null;
	}

	@Override
	public Estudiante getNext() {
		if(hasNext()) {
			return gradeBook.getList().get(index-1);
		}
		return null;
	}

}
