package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class NumberService {
    public Boolean checkEven(int number) {return number%2 == 0;}
    public String evenResponse(int number)
    {
        if (checkEven(number)) return "The number is even";
        else return "The number is not even";
    }
}