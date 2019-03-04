package com.spring.quickstart.annotation;



import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Phone {
    @Value("iphoneX")
    private String brand;
    @Value("6666")
    private double price;

}