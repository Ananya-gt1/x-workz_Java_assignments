package com.xworkz.ananya.repository;

import com.xworkz.ananya.dto.RgisterDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterRepositoryImpl implements RegisterRepository{
    @Override
    public void save(RgisterDTO dto) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/generaldb";
            String username="root";
            String password="8904109027@Ani";
            Connection connection= DriverManager.getConnection(url,username,password);
            String sql="insert into register_details values(0,'"+dto.getNameName()+"',"+dto.getMoblieNoName()+",'"+dto.getEmailName()+"','"+dto.getPasswordName()+"')";
            Statement statement=connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Connection:"+connection);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);


        }
    }
}
