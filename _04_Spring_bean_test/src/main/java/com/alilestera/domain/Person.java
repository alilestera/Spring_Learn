package com.alilestera.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Alilestera
 * @date 1/22/2022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    public String name;
    public int age;
    public String sex;
}
