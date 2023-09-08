package com.example.project.controller;


import com.example.project.entity.PassengerDetail;
import com.example.project.repository.PassengerDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "passengerDetail")
public class PassengerDetailController {

    @Autowired
    PassengerDetailRepository passengerDetailRepository;

    @PostMapping(value = "/add")
    public PassengerDetail addNewPassengerDetail(@RequestBody PassengerDetail passengerDetail) {
        passengerDetailRepository.save(passengerDetail);
        return passengerDetail;
    }

    @GetMapping(value = "/getAll")
    public List<PassengerDetail> getAllPassengerDetail(){
        return passengerDetailRepository.findAll();
    }

    @GetMapping(value = "/getById")
    public PassengerDetail getByIdPassengerDetail (@RequestParam Long id){
        return passengerDetailRepository.findById(id).get();
    }

    @PostMapping(value = "/update")
    public PassengerDetail updatePassangerDetail(@RequestBody PassengerDetail passengerDetail){
        return passengerDetailRepository.save(passengerDetail);
    }

    @GetMapping(value = "/delete")
    public String deletePassengerDetail(@RequestParam Long id){
        passengerDetailRepository.deleteById(id);
        return "SUCCESS DELETE PASSENGER DETAIL ID: "+id;
    }
}
