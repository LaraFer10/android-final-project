package com.example.finderapp.dao;

import com.example.finderapp.models.User;
import com.example.finderapp.util.ConnectionPG;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
    public static void addUser(User user) throws SQLException {
        PreparedStatement preparedStatement = ConnectionPG.getConnection().prepareStatement(
                "insert into contato(name,password,email) values (?, ?,?)");

        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2,user.getPassword());
        preparedStatement.setString(3, user.getEmail());

        preparedStatement.executeUpdate();

    }

}
