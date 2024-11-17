package org.example.Practice.Practice5;
import java.sql.*;

public class DbConnect {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/oop-lab3";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    private Connection connection = null;

    public DbConnect() {

    }

    public void getAllTasks() throws SQLException {

    }

    public void getTaskById(int id) throws SQLException {

    }

    public void createTask(String taskDescription, String taskStatus) throws SQLException {

    }

    public void updateTaskNameById(int id, String newDescription) throws SQLException {

    }
}