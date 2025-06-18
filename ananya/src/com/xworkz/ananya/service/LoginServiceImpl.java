package com.xworkz.ananya.service;

import com.xworkz.ananya.dto.LoginDTO;
import com.xworkz.ananya.repository.LoginRepository;
import com.xworkz.ananya.repository.LoginRepositoryImpl;

public class LoginServiceImpl implements LoginService{
    @Override
    public String loginValidate(LoginDTO dto) {
        LoginRepository loginRepository=new LoginRepositoryImpl();
        loginRepository.save(dto);
        return "Failed";
    }
}
