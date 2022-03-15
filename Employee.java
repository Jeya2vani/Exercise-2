package com.example.springmongodb.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Getter
@Setter
@ToString
@Document(collection = "Employee")
public class Employee {
    @Id
    private int id;
    private String name;
    private String department;
    private float salary;
    private float percentage;

    public float getPercentage() {
        percentage = (salary / mini()) * 100;
        return percentage;
    }

    private float mini() {
        float[] sal={10000,12000,15000,25000,30000};
        float temp=sal[0];
        for (int i = 0; i < sal.length; i++) {
            if (temp > sal[i]) {
                temp = sal[i];
            }
        }
        return temp;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }
}
