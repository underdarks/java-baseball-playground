package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

public class SetTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setUp(){
        numbers=new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @DisplayName("요구사항 1 - Set Size 확인")
    @Test
    public void getSetSize(){
        //given
        int size = numbers.size();


        //when
        assertThat(size).isEqualTo(3);

        //then
    }

    @Test
    public void contains(){
        //given
        assertThat(numbers.contains(1)).isTrue();
        assertThat(numbers.contains(2)).isTrue();
        assertThat(numbers.contains(3)).isTrue();

        //then
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4})
    public void contains_parameterizedTest(int value){
        //given
        assertThat(numbers.contains(value)).isTrue();

        //when


        //then
    }

    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "4:false"}, delimiter = ':')
    public void contains_parameterizedTest_with_CsvSource(int element, boolean expected){
        //given
        assertThat(numbers.contains(element)).isEqualTo(expected);

        //when


        //then
    }

}
