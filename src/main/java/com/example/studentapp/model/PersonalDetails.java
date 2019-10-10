package com.example.studentapp.model;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import javax.xml.validation.Schema;
import java.util.Date;

@Data
@Entity(name = "tblPersonalDetails")
public class PersonalDetails extends CommonModel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer St_Id ;
    private String St_FirstName;
    private String St_MlName;
    private String St_LastName;
    private String St_Gender;
    private long St_Mobile;
    private String St_Email;
    private Date St_DOB;
}
