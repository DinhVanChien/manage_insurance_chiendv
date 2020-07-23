package com.quanlybaohiem.service.impl;

import com.quanlybaohiem.common.Common;
import com.quanlybaohiem.dao.LoginDao;
import com.quanlybaohiem.dto.UserDTO;
import com.quanlybaohiem.emtity.User;
import com.quanlybaohiem.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginDao loginDao;
    @Autowired
    Common common;
    @Override
    public UserDTO getUserLogin(String userName, String passWord) {
        User user = new User();
        user = loginDao.findByUsernameAndPassword(userName, passWord);
        return common.convertUserDTO(user);
    }
}
