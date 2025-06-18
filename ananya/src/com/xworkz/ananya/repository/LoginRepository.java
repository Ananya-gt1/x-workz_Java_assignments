package com.xworkz.ananya.repository;

import com.xworkz.ananya.dto.LoginDTO;
import com.xworkz.ananya.dto.RgisterDTO;

public interface LoginRepository {
    public void save(LoginDTO dto);
}
