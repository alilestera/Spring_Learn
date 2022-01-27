package com.alilestera.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author Alilestera
 * @date 1/24/2022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    public String name;
    public String sex;
    public int age;
}
