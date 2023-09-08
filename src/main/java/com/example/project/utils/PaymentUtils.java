package com.example.project.utils;

import com.example.project.exception.InsulfficientAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {

    private static Map<String, Double> paymentMap=new HashMap<>();

    private static Map<String, String> passengerMap=new HashMap<>();

    static {
        paymentMap.put("acc1", 12000.0);
        paymentMap.put("acc2", 10000.0);
        paymentMap.put("acc3", 5000.0);
        paymentMap.put("acc4", 8000.0);
    }

    public static boolean validateCreditLimit(String accountNo, double amount){
        if(amount > paymentMap.get(accountNo)){
            throw new InsulfficientAmountException("insulfficient fund...!");
        } else {
           return true;
        }
    }

}
