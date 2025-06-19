package com.xworkz.ananya.service;

import com.xworkz.ananya.dto.RgisterDTO;
import com.xworkz.ananya.repository.RegisterRepository;
import com.xworkz.ananya.repository.RegisterRepositoryImpl;

public class RegisterServiceImpl implements RegisterService{
    @Override
    public String registerValidate(RgisterDTO dto) {
        RegisterRepository registerRepository=new RegisterRepositoryImpl();
        String name= dto.getNameName();
        if(dto.getNameName()==null || ()<4 ||) {
            registerRepository.save(dto);
            return "The form submitted successfully";
        }
    }
}
