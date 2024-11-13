import java.util.*;
class PriorityQueueSorting 
{
	// compareable class to sorting it 
	static class Student implements Comparable<Student>
	{

		// it is an interface and compareTo method is present in that class
		int rank;
		String name;
		public Student(String name, int rank){
			this. name=name;
			this.rank=rank;
		}
		@Override  // this method is present in interface class
		public  int compareTo(Student s2){
			return this.rank-s2.rank;
		}
	}
	public static void main(String[] args) 
	{
		PriorityQueue<Student> pq= new PriorityQueue<>();
		pq.add(new Student("pratu",36));
		pq.add(new Student("ashu",10));
		pq.add(new Student("suraj",50));
		pq.add(new Student("naved",20));
		while (!pq.isEmpty())
		{
			System.out.println(pq.peek().name+ "  =>"+pq.peek().rank);
			pq.remove();
		}
	}
}
