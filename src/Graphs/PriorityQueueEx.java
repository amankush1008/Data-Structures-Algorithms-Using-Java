package graphs;
import java.util.PriorityQueue;

class Student implements Comparable<Student>{
	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Student o) {
		return o.age-this.age;
	}
}
public class PriorityQueueEx {
	public static void main(String[] args) {
		Student s1=new Student("Rochak",19);
		Student s2=new Student("Mochak",20);
		Student s3=new Student("Chochak",18);
		Student s4=new Student("Lochak",25);
		Student s5=new Student("Sochak",5);
		
		PriorityQueue<Student> pq=new PriorityQueue<>();
		pq.add(s1);
		pq.add(s2);
		pq.add(s3);
		pq.add(s4);
		pq.add(s5);
		
		for(Student s:pq)
			System.out.println(s.name+" "+s.age);
	}
}
