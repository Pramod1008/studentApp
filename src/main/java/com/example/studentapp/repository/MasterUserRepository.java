package com.example.studentapp.repository;

import com.example.studentapp.model.MasterUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterUserRepository extends JpaRepository<MasterUser,Integer> {
}
