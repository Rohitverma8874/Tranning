/*import java.util.*;

public class Sample1 {
        public static void main(String args[]){

            Set<String> names = new TreeSet<>();
            names.add(new String("Samal"));
            names.add(new String("Saraii"));
            names.add(new String("vikas"));
            names.add(new String("umerr"));

            List<Integer> num = Arrays.asList(2,4,1,6);
            for(String name:names){
                System.out.println(name);
            }

            List<Student> students = new ArrayList<>();

            students.add(new Student("Samal", 23, 'A'));
            students.add(new Student("Saraii", 21, 'B'));
            students.add(new Student("vikas", 22, 'A'));
            students.add(new Student("umerr", 24, 'A'));

            Collections.sort(students);

            for(Student student:students){
                System.out.println(student);
            }

            List<String> items= new ArrayList<>();
            items.add("Laptop");
            items.add("Desktop");
            items.add("keyboard");
            items.add("Laptop");

            items.add(2,"Mouse");

            // System.out.println("Removed item is: "+items.remove(1));

            items.set(3, "Speaker");

            for(String item : items){
                System.out.println(item);
            }


        /*Iterator<String> it = names.iterator();
        while(it.hasNext()){
            String str = it.next();
        }*/

