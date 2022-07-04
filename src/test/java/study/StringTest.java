package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;


public class StringTest {

    @Test
    public void split(){
        //given
        String[] actual = "1,2".split(",");

        //when


        System.out.println(actual.length);
        //then

    }

}
