import java.util.*;
class Student implements Comparable<Student>
{
     private String sname;
     private int srollno;
     private int sage;

     public Student (int srollno, String sname, int sage)
     {
          this.srollno = srollno; this.sname = sname;
          this.sage = sage;
     }

     //getter for overriding compareTo method
     public int getStudentAge()
      {
           return sage;
      }

     @Override
     public String toString()
    {
        return ("roll no= "+srollno+",name= "+sname+",age = "+sage);
    }

    @Override
     public int compareTo(Student st)
     {
           int cmp_age = st.getStudentAge();
           return (this.sage - cmp_age);
      }
}

public class ArrayListObjectSort
{
     public static void main (String[] args)
	 {
          ArrayList<Student> al = new ArrayList<Student>();
          al.add(new Student(23,"Sam",15));
          al.add(new Student(22,"Jimmy",39));
          al.add(new Student(45,"Cooper",12));
          al.add(new Student(68,"Jack",24));
          Collections.sort(al);
          for (Student s:al) System.out.println(s);
     }
}

