package com.example.studentapp.services;

import com.example.studentapp.model.MasterUser;
import com.example.studentapp.repository.MasterUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MasterUserServiceImpl  implements MasterUserService{
    @Autowired
    private MasterUserRepository masterUserRepository;

    @Override
    public List<MasterUser> findAll() {

        return masterUserRepository.findAll();
    }

    @Override
    public MasterUser findById(Integer id) {
        Optional<MasterUser> result=masterUserRepository.findById(id);
        MasterUser masterUser=null;
        if(result.isPresent()){
            masterUser=result.get();
        }
        return masterUser;
    }

    @Override
    public void save(MasterUser masterUser) {
        masterUserRepository.save(masterUser);
    }

    @Override
    public void deleteById(Integer id) {
        masterUserRepository.deleteById(id);
    }
}
