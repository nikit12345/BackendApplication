package com.gymapplication.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gymapplication.entity.*;
public interface UserRepo extends JpaRepository<User, Long>{

}
