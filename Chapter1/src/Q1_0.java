import java.util.HashMap;

/**
 * Hash table student example
 */
public class Q1_0 {
    private static class Student {
        private String name;
        private Integer id;

        Student(Integer id, String name){
            this.name = name;
            this.id = id;
        }

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
    public static HashMap<Integer, Student> buildMap(Student[] students) {
        HashMap<Integer, Student> map = new HashMap<Integer, Student>();
        for (Student s : students)
        {
            map.put(s.getId(),s);
        }
        return map;
    }

    public static void main(String args[])
    {
        Student[] s = new Student[]{new Student(10401735,"Brandon"), new Student(123349,"Yvonne")};
        HashMap<Integer,Student> m = buildMap(s);
        System.out.println(m.get(10401735).getName());
    }

}
