package com.alilestera.pojo;

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
public class Toy {
    private String name;
    private int width;
    private int length;
    private int height;
    private int price;
}
