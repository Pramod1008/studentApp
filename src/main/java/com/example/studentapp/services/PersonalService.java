package com.example.studentapp.services;

import com.example.studentapp.model.PersonalDetails;

import java.util.List;

public interface PersonalService {
    public List<PersonalDetails> findAll();
    public PersonalDetails findById(Integer id);
    public void save(PersonalDetails personalDetails);
    public void deleteById(Integer id);
}
