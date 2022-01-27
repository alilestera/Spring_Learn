package com.alilestera.service;

import com.alilestera.pojo.Toy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Alilestera
 * @date 1/22/2022
 */
@Data
@NoArgsConstructor
public class ToysFactory {
    public Toy getToy() {
        return new Toy("monkey", 20, 10, 30, 99);
    }
}
