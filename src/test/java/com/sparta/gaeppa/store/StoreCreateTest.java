package com.sparta.gaeppa.store;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class StoreCreateTest {

    @Test
    @DisplayName("테스트의 내용을 한눈에 알아볼 수 있게 네이밍 해줄 때")
    void test1() {
        System.out.println("테스트 내용 빠르게 파악.");
    }

    @Nested
    @DisplayName("테스트의 내용을 한눈에 알아볼 수 있게 네이밍 해줄 때")
    class Test1 {

        @Test
        @DisplayName("Test1 - test1()")
        void test1() {
            System.out.println("테스트 내용 빠르게 파악.");
        }
    }
}
