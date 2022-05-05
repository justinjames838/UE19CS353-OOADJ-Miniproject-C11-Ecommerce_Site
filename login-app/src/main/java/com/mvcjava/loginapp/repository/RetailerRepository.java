package com.mvcjava.loginapp.repository;

import com.mvcjava.loginapp.roles.Users.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RetailerRepository extends JpaRepository<UserModel,Integer>
{
    List<UserModel> findAllByRole(String role);
    @Query("select r.id from UserModel r where r.login = ?1 and r.role = 'retailer'")
    Integer findIdByName(String name);

    String findNameById(Integer id);

    void deleteById(Integer retID);

}
