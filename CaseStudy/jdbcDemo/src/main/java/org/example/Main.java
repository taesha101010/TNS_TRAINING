
package org.example;

import org.example.repository.StudentRepository;

public class Main {
    public static void main(String[] args) {

        StudentRepository studentRepository = new StudentRepository();

        // CREATE
        Studie student = new Studie();
        student.setName("Taesha");
        student.setEmail("taesha20@gmail.com");
        student.setAge(21);

        // Uncomment when you want to insert a student
         studentRepository.createUser(student);

        // UPDATE
        // Change email of student with ID 2
        // studentRepository.updateUser(2, "lokhandetanisha2005@gmail.com");

        // DELETE
        // Delete student with ID 2
        // studentRepository.deleteUser(2);

        // READ / FIND
        studentRepository.getUserById(2);
    }
}
