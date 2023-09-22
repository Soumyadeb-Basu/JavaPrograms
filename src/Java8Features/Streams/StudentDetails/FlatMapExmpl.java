package Java8Features.Streams.StudentDetails;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapExmpl {

    public static void main(String[] args) {
        List<String> subject1= Arrays.asList("Maths","English","Science");
        List<String> subject2= Arrays.asList("History","Geography","English");

        Student s1= new Student(1,"Ramesh",subject1);
        Student s2= new Student(2,"Mohan",subject2);

        List<Student> students= Arrays.asList(s1,s2);

        Set<List<String>> subjectsMap=students.stream().map(s->s.getSubjects()).collect(Collectors.toSet());

        Set<String> subjectsFlatMap= students.stream().flatMap(s->s.getSubjects().stream()).collect(Collectors.toSet());

        System.out.println(subjectsMap);
        System.out.println(subjectsFlatMap);
    }
}
