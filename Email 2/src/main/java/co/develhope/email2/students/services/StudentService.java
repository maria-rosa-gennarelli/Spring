package co.develhope.email2.students.services;

import co.develhope.email2.students.entities.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    static List<Student> students = Arrays.asList(
            new Student("1", "Aldo", "Baglio", "aldo@baglio.com"),
            new Student("2", "Giovanni", "Storti", "giovanni@storti.com"),
            new Student("3", "Giacomo", "Poretti", "giacomo@poretti.com"),
            new Student("4", "Treuomini", "Edunagamba", "treuomini@edunagamba.eu")
            );

    public Student getStudentById(String studentId) {
        Optional<Student> studentFromList = students.stream().filter(student ->
                student.getId().equals(studentId)).findAny();
        return studentFromList.isPresent() ? studentFromList.get() : null;
    }
}
