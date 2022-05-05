package com.mvcjava.loginapp.service;

import com.mvcjava.loginapp.repository.RetailerRepository;
import com.mvcjava.loginapp.roles.Users.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetailerService {
    @Autowired
    private RetailerRepository retailerRepository;

    public List<UserModel> getAllRetailers() {
        return retailerRepository.findAllByRole("retailer");
    }

    public Integer getIdByName(String name) {
        return retailerRepository.findIdByName(name);
    }

    public String getNameById(Integer id) {
        return retailerRepository.findNameById(id);
    }

    public List<UserModel> removeretailer(Integer ID)
    {
        retailerRepository.deleteById(ID);
        return retailerRepository.findAllByRole("retailer");
    }
}
