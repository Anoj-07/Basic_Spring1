package com.DIAndIoC.Depndency;

import org.springframework.stereotype.Component;

@Component
public class Nurse implements staff{
    public void assist(){
        System.out.println("Nurse is assisting");
    }
}
