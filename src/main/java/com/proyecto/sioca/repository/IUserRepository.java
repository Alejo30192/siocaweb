package com.proyecto.sioca.repository;

import com.proyecto.sioca.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository <User,Long>{

}
