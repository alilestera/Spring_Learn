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
public class ToysStaticFactory {
    public static Toy getToy() {
        return new Toy("dog", 30, 60, 30, 500);
    }
}
