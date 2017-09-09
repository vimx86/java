package org.galsang.java.base.method;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * Description：
 * <br /> Author： galsang
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Manager extends Employee {

    private BigDecimal salary = new BigDecimal(10);
}
