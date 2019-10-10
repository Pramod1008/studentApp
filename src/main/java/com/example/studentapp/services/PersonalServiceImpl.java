package com.example.studentapp.services;

import com.example.studentapp.model.PersonalDetails;
import com.example.studentapp.repository.PersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonalServiceImpl implements PersonalService {

    @Autowired
    private PersonalRepository personalRepository;


    @Override
    public List<PersonalDetails> findAll() {
        return personalRepository.findAll();
    }

    @Override
    public PersonalDetails findById(Integer id) {
         Optional<PersonalDetails> result= personalRepository.findById(id);

         PersonalDetails personalDetails=null;
         if(result.isPresent())
         {
             personalDetails=result.get();
         }
         return personalDetails;
    }

    @Override
    public void save(PersonalDetails personalDetails) {
        personalRepository.save(personalDetails);
    }

    @Override
    public void deleteById(Integer id) {
        personalRepository.deleteById(id);
    }
}
