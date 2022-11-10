package com.proyecto.sioca.repository;

import com.proyecto.sioca.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IUserRepository extends JpaRepository <User,Long>{


    @Query("SELECT u FROM User u WHERE u.id=?1 AND u.numero=?2")
    public User unsolousuario(Long id,String numero);
}
