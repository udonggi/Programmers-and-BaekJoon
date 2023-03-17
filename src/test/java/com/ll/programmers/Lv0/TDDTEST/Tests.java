package com.ll.programmers.Lv0.TDDTEST;


import com.ll.programmers.Lv0.TDDTEST.Polynomial;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
        @Test
        @DisplayName("3 + 3")
        void t1 (){
            assertThat(new Polynomial("3 + 3").calc()).isEqualTo(6);
        }

        @Test
        @DisplayName("13 + 2")
        void t2 (){
            assertThat(new Polynomial("13 + 2").calc()).isEqualTo(15);
        }

}
