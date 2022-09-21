package com.fx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer empId;
    private String empName;
    private Integer age;
    private String gender;
    private String email;
}
