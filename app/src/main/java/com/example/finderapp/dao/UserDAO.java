package com.example.finderapp.dao;

import com.example.finderapp.models.User;
import com.example.finderapp.util.ConnectionPG;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    public static void addUser(User user) throws SQLException {
        PreparedStatement preparedStatement = ConnectionPG.getConnection().prepareStatement(
                "insert into user(name,password,email) values (?, ?,?)");

        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2,user.getPassword());
        preparedStatement.setString(3, user.getEmail());

        preparedStatement.executeUpdate();

    }
    public static List<User> getAllUsers() throws SQLException {
        List<User> listUsers = new ArrayList<>();

            Statement stmt = ConnectionPG.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery("select * from user");
            while (rs.next()){
                User user = new User();

                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
                listUsers.add(user);

            }

            return listUsers;
    }

    public static User searchUser(String name) throws SQLException {
        List<User> users = getAllUsers();
        for (User user : users) {
            if(user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }
}
