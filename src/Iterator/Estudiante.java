package Iterator;


public class Estudiante {
	private String name; 
	private double grade; 
	private int idNum; 

	public Estudiante(String name, double grade, int idNum){
		this.name = name;
		this.grade = grade;
		this.idNum = idNum;
	}
	
	public int getIdNum(){
		return idNum;
	}
	public void setIdNum(int idNum){
		this.idNum = idNum;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public double getGrade(){
		return grade;
	}
	public void setGrade(double grade){
		this.grade = grade;
	}
	
}