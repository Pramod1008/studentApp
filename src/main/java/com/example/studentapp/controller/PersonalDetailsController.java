package com.example.studentapp.controller;

import com.example.studentapp.model.MasterUser;
import com.example.studentapp.model.PersonalDetails;
import com.example.studentapp.services.MasterUserService;
import com.example.studentapp.services.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonalDetailsController {
    @Autowired
    private PersonalService personalService;

    @Autowired
    private MasterUserService masterUserService;

    DateFormat df=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
    @GetMapping("/list")
    public List<PersonalDetails> findAll()
    {
        return personalService.findAll();
    }

    @GetMapping("/list/{id}")
    public PersonalDetails findById(@PathVariable Integer id){
        return personalService.findById(id);
    }

    @PostMapping("/save")
    public PersonalDetails addPersonal(@RequestBody PersonalDetails personalDetails){

        personalService.save(personalDetails);

        MasterUser masterUser=new MasterUser();
        masterUser.setLink_Status(1);
        masterUser.setIsActive(true);
        masterUser.setForm_Status("i");
        masterUserService.save(masterUser);
        return personalDetails;
    }

    @PutMapping("/update/{id}")
    public PersonalDetails updatePersonal(@RequestBody PersonalDetails personalDetails,@PathVariable Integer id){
        PersonalDetails tempPersonal=personalService.findById(id);
        if(tempPersonal==null)
        {
            throw new RuntimeException("Student id not found "+id);
        }
        personalDetails.setSt_Id(tempPersonal.getSt_Id());
        personalService.save(personalDetails);

        return personalDetails;
    }

    @DeleteMapping("/delete/{id}")
    public String deletePerson(@PathVariable Integer id){
        PersonalDetails tempPersonal=personalService.findById(id);
        if(tempPersonal==null)
        {
            throw new RuntimeException("Student id not found "+id);
        }
        personalService.deleteById(id);

        return "Deleted Student Id "+id;
    }





}
