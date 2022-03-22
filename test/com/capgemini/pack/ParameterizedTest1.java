package com.capgemini.pack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.time.Month;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedTest1 {

        @ParameterizedTest
        @ValueSource(ints = {1, 2, 5, -3, 15, Integer.MAX_VALUE}) // six numbers
        void isOdd_ShouldReturnTrueForOddNumbers(int number) {
            assertTrue(Numbers.isOdd(number));
        }
        @ParameterizedTest
        @EmptySource
        void BlankStrings(String input) {
            assertEquals("",input);
        }

        @ParameterizedTest
        @NullSource
        void NullStrings(String input) {
            assertEquals(null,input);
        }

        @ParameterizedTest
        @NullAndEmptySource
        void NullAndEmptyStrings(String input) {
            System.out.println("input = "+input);
        }

        @ParameterizedTest
        @EnumSource(Month.class) // passing all 12 months
        void getValueForAMonth_IsAlwaysBetweenOneAndTwelve(Month month) {
            int monthNumber = month.getValue();
            assertTrue(monthNumber >= 1 && monthNumber <= 12);
        }
    @ParameterizedTest
    @MethodSource("provideStringsForIsBlank")
    void isBlank_ShouldReturnTrueForNullOrBlankStrings(String input, boolean expected) {
        assertEquals(expected, isBlank(input));
    }
        private static Stream<Arguments> provideStringsForIsBlank() {
            return Stream.of(
                    Arguments.of(null, true),
                    Arguments.of("", true),
                    Arguments.of("  ", true),
                    Arguments.of("not blank", false)
            );
        }

        public static boolean isBlank(String input) {
            return input == null || input.trim().isEmpty();
        }



}


