package com.example.studentapp.repository;

import com.example.studentapp.model.PersonalDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalRepository extends JpaRepository<PersonalDetails, Integer> {
}
