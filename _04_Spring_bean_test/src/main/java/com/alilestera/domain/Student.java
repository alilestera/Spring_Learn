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
public class Student extends Person {
    private String id;
    private String teacherName;
    private String[] favoriteSubject;

    public void firstInit() {
        System.out.println("firstInit");
    }

    public void lastClose() {
        System.out.println("lastClose");
    }
}
