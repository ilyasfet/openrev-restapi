package com.iprojects.openrev.repository;

import com.iprojects.openrev.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository<T extends User> extends JpaRepository {

}
