package com.alilestera.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author Alilestera
 * @date 1/24/2022
 */
@Component("student")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Student extends Person {
    private String id;
    private String favoriteSubject;
    private String favoriteTeacher;
}
