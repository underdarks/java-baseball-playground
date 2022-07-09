package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

public class StringTest {

    /**
     * 요구사항 1
     * <p>
     * "1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.
     * "1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.
     */
    @DisplayName("요구 사항 1. Split")
    @Test
    public void split() {
        //given
        String[] splits1 = "1,2".split(",");
        String[] splits2 = "1".split(",");


        //when
        assertThat(splits1).hasSizeGreaterThanOrEqualTo(2);
        assertThat(splits2).containsExactly("2");

        //then
    }

    /**
     * 요구사항 2
     * "(1,2)" 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 "1,2"를 반환하도록 구현한다.
     */
    @DisplayName("요구사항 2 - SubString 테스트")
    @Test
    public void substring() {
        //given
        //substring beginIndex = 시작할 문자열의 인덱스, endIndex= 문자열을 짜를 인덱스
        //범위는 beginIndex ~ (endIndex - 1)
        String substring = "(1,2)".substring(1, 4);

        //when
        System.out.println("substring = " + substring);


        //then
    }

    /**
     * 요구사항 3
     * "abc" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트를 구현한다.
     * String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException이 발생하는 부분에 대한 학습 테스트를 구현한다.
     * JUnit의 @DisplayName을 활용해 테스트 메소드의 의도를 드러낸다
     */
    @DisplayName("charAt() 정상 작동")
    @Test
    public void charAt() {
        //given
        String data = "abc";

        //when
        assertThatThrownBy(() -> data.charAt(3))
                .isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("index");


        //then
    }

    @DisplayName("charAt() 인덱스 범위 벗어나는 경우")
    @Test
    public void charAt_indexOutOfException_Case() {
        //given
        String data = "abc";

        //when
        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() ->
                        data.charAt(4)
                ).withMessageContaining("index");




        //then
    }

}
