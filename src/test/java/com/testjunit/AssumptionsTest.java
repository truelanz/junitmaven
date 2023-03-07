package com.testjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {

    @Test
    void validarUsuarioClaudio() {
        Assumptions.assumeTrue("claudio".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }
    
}
