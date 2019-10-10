package com.example.studentapp.model;



import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

import java.util.Date;

@Data
@Entity(name = "tblMaster_User")
public class MasterUser extends CommonModel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer St_Id;
    private boolean IsActive;
    private int Link_Status;
    private String  Form_Status;

    @OneToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "student_Id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private PersonalDetails personalDetails;

}
