package com.dwaltr.gcdcalc;

import org.assertj.core.api.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GcdByEuclideanTest {
    @ParameterizedTest(name = "{index} ==> Greatest common divisor of {0} and {1} is {2}")
    @CsvSource({
            "1000, 500, 500",
            "5000, 100, 100",
            "282, 78, 6",
            "78, 282, 6",
            "1, 1, 1",
    })

    void should_return_gcd(int a, int b, int expected) {
        assertThat(GcdByEuclidean.gcdByEuclidAlgorithm(a, b)).isEqualTo(expected);

        //assertEquals(expected, GcdByEuclidean.gcdByEuclidAlgorithm(a, b));
    }
}
