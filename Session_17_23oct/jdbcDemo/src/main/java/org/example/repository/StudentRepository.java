
package org.example.repository;

import org.example.Studie;

import java.sql.*;

public class StudentRepository {

    String url = "jdbc:mysql://localhost:3306/collegedb";
    String username = "root";
    String password = "root";

    // CREATE: Insert a new student
    public void createUser(Studie student) {

        String sql = "INSERT INTO studie(name, email, age) VALUES (?, ?, ?)";

        try (Connection connection =
                     DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, student.getName());
            statement.setString(2, student.getEmail());
            statement.setInt(3, student.getAge());

            int result = statement.executeUpdate();

            if (result > 0) {
                System.out.println("Creation operation successful");
            } else {
                System.out.println("Creation failed");
            }

        } catch (SQLException e) {
            System.out.println("Database operation failed");
            e.printStackTrace();
        }
    }

    // UPDATE: Update a student's email using their ID
    public void updateUser(long id, String email) {

        String sql = "UPDATE studie SET email = ? WHERE id = ?";

        try (Connection connection =
                     DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, email);
            statement.setLong(2, id);

            int result = statement.executeUpdate();

            if (result > 0) {
                System.out.println("Update operation successful");
            } else {
                System.out.println("Student not found. Update failed");
            }

        } catch (SQLException e) {
            System.out.println("Database operation failed");
            e.printStackTrace();
        }
    }

    // DELETE: Delete a student using their ID
    public void deleteUser(long id) {

        String sql = "DELETE FROM studie WHERE id = ?";

        try (Connection connection =
                     DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setLong(1, id);

            int result = statement.executeUpdate();

            if (result > 0) {
                System.out.println("Delete operation successful");
            } else {
                System.out.println("Student not found. Deletion failed");
            }

        } catch (SQLException e) {
            System.out.println("Database operation failed");
            e.printStackTrace();
        }
    }

    // READ: Get a student by ID
    public void getUserById(long id) {

        String sql = "SELECT id, name, email, age FROM studie WHERE id = ?";

        try (Connection connection =
                     DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setLong(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {

                if (resultSet.next()) {
                    Studie student = mapRow(resultSet);
                    System.out.println(student);
                } else {
                    System.out.println("Student not found");
                }
            }

        } catch (SQLException e) {
            System.out.println("Database operation failed");
            e.printStackTrace();
        }
    }

    // Convert one database row into a Studie object
    private Studie mapRow(ResultSet resultSet) throws SQLException {

        Studie student = new Studie();

        student.setId(resultSet.getLong("id"));
        student.setName(resultSet.getString("name"));
        student.setEmail(resultSet.getString("email"));
        student.setAge(resultSet.getInt("age"));

        return student;
    }

    // READ: Demonstrate fetching a student by ID
    public void completeCurd() {
        getUserById(2);
    }
}
