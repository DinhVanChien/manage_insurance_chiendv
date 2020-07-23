package com.quanlybaohiem.validate;

import com.quanlybaohiem.common.Constant;
import com.quanlybaohiem.dto.UserDTO;
import com.quanlybaohiem.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ValidateLogin {
    @Autowired
    private LoginService loginService;
    public List<String> validateLogin(String userName, String passWord) {
        List<String> listError = new ArrayList<String>();
        if(userName.isEmpty() || passWord.isEmpty()) {
            if(userName.isEmpty()) {
                listError.add(Constant.ERROR01_EMPTY_USERNAME);
            }
            if(passWord.isEmpty()) {
                listError.add(Constant.ERROR01_EMPTY_PASSWORD);
            }
        } else {
            UserDTO user = loginService.getUserLogin(userName, passWord);
            if (user == null) {
                listError.add(Constant.ERROR01_LOGIN);
            }
        }
        return listError;
    }
}
