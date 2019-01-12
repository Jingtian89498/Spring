package com.ljt.scopebeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Cold
public class IceCream implements Dessert {
}
