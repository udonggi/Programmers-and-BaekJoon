package com.ll.Lv0.P120806;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class SolutionTests {

    @Test
    @DisplayName("7로 3 나누고 1000 곱하여 소수점 자르면")
    void t1(){
        assertThat(new Solution().solution(7,3)).isEqualTo(2333);
    }

    @Test
    @DisplayName("3로 2 나누고 1000 곱하여 소수점 자르면")
    void t2(){
        assertThat(new Solution().solution(3,2)).isEqualTo(1500);
    }

    @Test
    @DisplayName("1로 16 나누고 1000 곱하여 소수점 자르면")
    void t3(){
        assertThat(new Solution().solution(1,16)).isEqualTo(62);
    }

}
