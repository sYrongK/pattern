package com.study.pattern.pattern.service;

import java.math.BigDecimal;
import java.util.List;

public interface PaymentProportionalCalculationExpression<T> {

    BigDecimal getAmount(List<T> elements);

    BigDecimal createElements(List elements);
}
