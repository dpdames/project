package com.example.project.repository;


import com.example.project.entity.PassengerDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerDetailRepository extends JpaRepository<PassengerDetail, Long> {
}
