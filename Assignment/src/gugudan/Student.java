package gugudan;
import java.util.Comparator;
public class Student implements Comparator<Student>{

	public static final Comparator<Student> WITH_NAME = new WithName();
	public static final Comparator<Student> WITH_DEPT = new WithDept();
	public static final Comparator<Student> WITH_GRADE = new WithGrade();
	
	int ID;
	String name;
	String dept;
	Integer grade;
	
	public Student(int IDln, String nameln, String deptln, Integer gradeln) {
		ID = IDln;
		name = nameln;
		dept = deptln;
		grade = gradeln;
		
	}
	
	public int getID() {return ID;}
	public String getName() {return name;}
	public String getDept() {return dept;}
	public int getGrade() {return grade;}
	
	public static class WithName implements Comparator<Student>{
		public int compare(Student s1, Student s2) {
			return s1.name.compareTo(s2.name);
		}
	}
	
	public static class WithDept implements Comparator<Student>{
		public int compare(Student s1, Student s2) {
			return s1.name.compareTo(s2.name);
		}
	}
	
	public static class WithGrade implements Comparator<Student>{
		public int compare(Student s1, Student s2) {
			return s1.name.compareTo(s2.name);
		}
	}
	
	public int compareTo(Student s1) {
		return this.ID - s1.ID;
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
