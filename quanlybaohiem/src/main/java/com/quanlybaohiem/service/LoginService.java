package com.quanlybaohiem.service;

import com.quanlybaohiem.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    public UserDTO getUserLogin(String userName, String passWord);
}
