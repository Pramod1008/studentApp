package com.example.studentapp.services;

import com.example.studentapp.model.MasterUser;

import java.util.List;

public interface MasterUserService {
    public List<MasterUser> findAll();
    public MasterUser findById(Integer id);
    public void save(MasterUser masterUser);
    public void deleteById(Integer id);
}
