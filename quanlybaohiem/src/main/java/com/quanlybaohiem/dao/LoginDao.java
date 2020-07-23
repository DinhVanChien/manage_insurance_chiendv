package com.quanlybaohiem.dao;

import com.quanlybaohiem.emtity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao extends JpaRepository<User, Long> {
   /* @Query("SELECT u FROM User u WHERE u.username = :userName AND u.password = :passWord")
    public User getUserLoginDao(String userName, String passWord );
    */
   User findByUsernameAndPassword(String userName, String passWord);
}
