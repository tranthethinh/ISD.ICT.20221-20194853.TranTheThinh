package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidateRushTimeTest {

	private PlaceRushOrderController placeRushOrderController;
	    @BeforeEach
	    void setUp() throws Exception {
	        placeRushOrderController = new PlaceRushOrderController();
	    }


	    @ParameterizedTest
	    @CsvSource({
	            "2007/12/03 19:15,false",
	            "2020/12/23 10:15,true",
	            "abc,false",
	            ",true"
	    })
	    public void testRushTime(String time, boolean expected) {
	        boolean isValid = placeRushOrderController.validateReceiveDateTime(time);
	        assertEquals(expected,isValid);
	    }
	    

}
