package com.example.project.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PASSENGER_DETAIL")
public class PassengerDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long passengerId;
    private String passengerName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dateOfBirth;
    private String email;
    private String phoneNo;
}
