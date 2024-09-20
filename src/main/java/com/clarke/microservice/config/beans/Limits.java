package com.clarke.microservice.config.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@ToString 
public class Limits {
    private int min;
    private int max;
    
    public Limits() {
        super();
    }
    public Limits(int min, int max) {
        super();
        this.min = min;
        this.max = max;
    }  
}
