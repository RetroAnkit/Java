import java.util.*;
class Student
{
     private String sname;
     private int srollno;
     private int sage;

     public Student (int srollno, String sname, int sage)
     {
          this.srollno = srollno; this.sname = sname;
          this.sage = sage;
     }

     //getters for overrided compare method
     public String getStudentName()
      {
           return sname;
      }

      public int getStudentRollNo()
      {
           return srollno;
      }

     @Override
     public String toString()
    {
        return ("roll no= "+srollno+",name= "+sname+",age = "+sage);
    }


  /*Comparator for sorting the list by Student Name*/ 
       public static Comparator<Student> NameComparator = new Comparator<Student>()  
    { 	
           public int compare(Student s1, Student s2) 
           { 	 
                 String StudentName1 = s1.getStudentName().toUpperCase(); 	 
                 String StudentName2 = s2.getStudentName().toUpperCase(); 	 
                  /*for ascending order sort*/
                 return StudentName1.compareTo(StudentName2); 	 
                 //for descending order sort*/
                 //return StudentName2.compareTo(StudentName1); 
             }
     }; 

/*Comparator for sorting the list by roll no*/ 
        public static Comparator<Student> RollNoComparator = new Comparator<Student>() 
     { 	
            public int compare(Student s1, Student s2) 
            { 	 
                  int rollno1 = s1.getStudentRollNo(); 	 
                  int rollno2 = s2.getStudentRollNo(); 	 
                 /*For ascending order sort*/ 	 
                 return rollno1-rollno2; 	 
                 /*For descending order sort*/ 	 
                 //rollno2-rollno1; 
             }
     };
}

public class ArrayListObjectSort
{
     public static void main (String[] args)
	 {
          ArrayList<Student> al = new ArrayList<Student>();
          al.add(new Student(23,"Sam",15));
          al.add(new Student(22,"Jimmy",38));
          al.add(new Student(45,"Cooper",12));
          al.add(new Student(68,"Jack",24));

          /*Sorting based on Student Name*/ 	         
          System.out.println("Student Name Sorting:"); 	
      Collections.sort(al,Student.NameComparator);
          for(Student str: al)
                System.out.println(str); 	  	 

          /* Sorting on Rollno property*/ 	      
          System.out.println("RollNum Sorting:"); 	   
          Collections.sort(al, Student.RollNoComparator);	
          for(Student str: al)
	             System.out.println(str); 	 
     }
}

