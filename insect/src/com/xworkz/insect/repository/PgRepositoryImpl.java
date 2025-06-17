package com.xworkz.insect.repository;

import com.xworkz.insect.dto.PgDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PgRepositoryImpl implements PgRepository{
    @Override
    public void save(PgDTO dto) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/generaldb";
            String username="root";
            String password="8904109027@Ani";
            Connection connection= DriverManager.getConnection(url,username,password);
            String sql="insert into pg_details values(0,'"+dto.getNameName()+"','"+dto.getOccupationName()+"','"+dto.getFatherName()+"','"+dto.getMotherName()+"','"+dto.getDateOfBirthName()+"','"+dto.getCheckBoxName()+"')";
            Statement statement=connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Connection:"+connection);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);


        }


    }
    }

