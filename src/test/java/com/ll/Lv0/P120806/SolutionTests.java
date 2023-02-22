package com.ll.Lv0.P120806;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {

    @Test
    @DisplayName("t1")
    void t1(){
        assertThat(new Solution().solution(7,3)).isEqualTo(2333);

    }

}
