import java.util.*;

class Student {
    String name;
    int rollno;
    char section;

    Student(String name, int rollno, char section) {
        this.name = name;
        this.rollno = rollno;
        this.section = section;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rollno=" + rollno + ", section=" + section + '}';
    }
}

class CustomSorting {
    public static void main(String[] args) {
        Student s1 = new Student("pratu", 36, 'B');
        Student s2 = new Student("pratu", 90, 'C');
        Student s3 = new Student("ansar", 20, 'A');
        Student s4 = new Student("naved", 100, 'B');

        ArrayList<Student> ans = new ArrayList<>();
        ans.add(s1);
        ans.add(s2);
        ans.add(s3);
        ans.add(s4);

        // Using Collections.sort() to sort the ArrayList
        Collections.sort(ans, (st1, st2) -> {
            if (st1.name.compareTo(st2.name) == 0) {
                return Integer.compare(st1.rollno, st2.rollno);
            } else {
                return st1.name.compareTo(st2.name);
            }
        });

        for (Student s : ans) {
            System.out.println(s);
        }
    }
}
