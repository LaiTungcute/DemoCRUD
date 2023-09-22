package com.example.DemoPorject.CRUD.Repository;

import com.example.DemoPorject.CRUD.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
