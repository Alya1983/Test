package by.itovereone.service;

import by.itovereone.entity.Student;

import java.util.*;

public class ServiceStudent {

    public static List<Student> getStudents(Scanner sc) {
        System.out.println("Введите количество студентов");
        int size = sc.nextInt();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Введите имя");
            String name = sc.next();
            System.out.println("Введите пол");
            String gender = sc.next();
            System.out.println("Введите id");
            int id = sc.nextInt();
            System.out.println("Введите возраст");
            int age = sc.nextInt();
            System.out.println("Введите название кафедры");
            String nameCafedra = sc.next();
            System.out.println("Введите название группы");
            String group = sc.next();
            System.out.println("Введите номер курса");
            int course = sc.nextInt();

            Map<String, List<Integer>> marks = new HashMap<>();
            System.out.println("Введите количество предметов");
            int sizeSabj = sc.nextInt();
            for (int j = 0; j < sizeSabj; j++) {
                System.out.println("Введите название предмета");
                String SubjName = sc.next();
                System.out.println("Введите количество оценок");
                int sizeMarks = sc.nextInt();

                List<Integer> allMarks = new ArrayList<>();
                for (int k = 0; k < sizeMarks; k++) {
                    System.out.println("Введите оценки");
                    int mark = sc.nextInt();
                    allMarks.add(mark);
                }
                marks.put(SubjName, allMarks);
            }
            Student newStudents = new Student(name, gender, id, age, nameCafedra, group, course, marks);
            students.add(newStudents);
        }
        return students;
    }

    public static void printStudent(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    public static void printStudentsShort(List<Student> students){
        for (Student st: students) {
            System.out.println("Student : name : "+st.getName()+", avg : "+st.getAvg());
        }
    }
public static List<Student> ListStudentAvg (List <Student> students){
        List<Student> goodStudents= new ArrayList<>();
    for (Student st:students){
        Map<String,List<Integer>> stMarks=st.getMarks();
        for(Map.Entry <String,List<Integer>> pair: stMarks.entrySet()){
            String SubjName=pair.getKey();
List<Integer> subjMarks=pair.getValue();
        int sum=0;
            for (int i=0; i<subjMarks.size(); i++) {
                sum = sum + subjMarks.get(i);
            }
           int avg=sum/subjMarks.size();
            st.setAvg(avg);
            if(avg>7||avg==7){
                goodStudents.add(st);
                break;
            }
        }
    }
    return goodStudents;
}
    }









