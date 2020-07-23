package com.quanlybaohiem.common;

import com.quanlybaohiem.dto.UserDTO;
import com.quanlybaohiem.emtity.User;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * author Đinh Văn Chiến
 * Class xử lý các method hay dùng trong project
 */
@Component
public class Common {
    /*
     * Method xử lý chức năng convert từ entity: User -> DTO: User
     * Paramater object User
     * return object UserDTO
     */
    public UserDTO convertUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        if(user != null) {
            userDTO.setId(user.getId());
            userDTO.setCompanyInternalId(user.getCompanyInternalId().getId());
            userDTO.setInsuranceInternalId(user.getInsuranceInternalId().getId());
            userDTO.setUsername(user.getUsername());
            userDTO.setPassword(user.getPassword());
            userDTO.setFullName(user.getFullName());
            userDTO.setUserSexDivision(user.getUserSexDivision());
            userDTO.setBirthDate(user.getBirthDate());
            return userDTO;
        }
        return null;
    }
}
