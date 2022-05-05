package com.mvcjava.loginapp.repository;

import com.mvcjava.loginapp.Bill.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BillRepository extends JpaRepository<Bill,Integer>
{
    List<Bill> findAllByCartID(Integer cartID);
}
