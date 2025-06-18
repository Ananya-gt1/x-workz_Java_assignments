package com.xworkz.ananya.repository;

import com.xworkz.ananya.dto.LoginDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginRepositoryImpl implements LoginRepository{
    @Override
    public void save(LoginDTO dto) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/generaldb";
            String username="root";
            String password="8904109027@Ani";
            Connection connection= DriverManager.getConnection(url,username,password);
            String sql="insert into login_details values(0,'"+dto.getNameName()+"','"+dto.getPasswordName()+"')";
            Statement statement=connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Connection:"+connection);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);


        }
    }
}
