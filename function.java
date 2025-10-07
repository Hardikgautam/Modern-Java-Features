package predicates;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class function {
    public static void main(String[] args) {
        //this function takes the length of given string
        Function<String, Integer> getLength_function = x -> x.length();

        //function takes the first three letters of a String
        Function<String, String> function = s -> s.substring(0, 3);

        //we want the names of students on a specific criteria here : vip in preffix
        Function<List<Student>, List<Student>> studentsWithVipAsPrefix = li -> {
               List<Student> result = new ArrayList<>();
                for(Student s: li ){
                   if( function.apply(s.getName()).equalsIgnoreCase("vip")){
                      result.add(s);
                    }
                }
                return result;
        };
        //adding some students

        Student s1 = new Student(2,"Vipin");
       Student s2 =  new Student(3,"Vipun");
        Student s3 = new Student(4,"Vijay");

        List<Student> students = Arrays.asList(s1,s2,s3);
    List<Student> filteredStudents = studentsWithVipAsPrefix.apply(students);

        System.out.println(filteredStudents);
        //function calling here
        System.out.println(getLength_function.apply("Hardik_Gautam"));
        System.out.println(function.apply("ABCDEFGHabcdefgh"));
    }
    private static class Student{

        private int id;

        private String name;

        public Student(int id, String name){
            this.id =id;
            this.name = name;

        }
        public int getId(){
            return id;
        }
        public void setId(int id){
            this.id =id;
        }
        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
