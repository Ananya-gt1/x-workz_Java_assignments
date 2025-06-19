package com.xworkz.weather.repository;

import com.xworkz.weather.dto.JobDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JobRepositoryImpl implements JobRepository{
    @Override
    public void save(JobDTO jobDTO) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/GeneralDB";
            String username="root";
            String password="8904109027@Ani";
            Connection connection=DriverManager.getConnection(url,username,password);
            String sql="insert into job_details values(0,'"+jobDTO.getName()+"','"+jobDTO.getEmail()+"','"+jobDTO.getEducation()+"','"+jobDTO.getExpectedSalary()+"','"+jobDTO.getExperience()+"')";
            Statement statement=connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Connection:"+connection);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);




        }


    }


}
