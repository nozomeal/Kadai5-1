import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;


public class IntToEngTest {

	int one = 1;
	int ten = 10;

	@Test
	public void onePlaceの1の表示(){
		IntToEng ite = new IntToEng();
		String expected = "one";
		String actual =ite.onePlace(one);
		assertThat(actual,is(expected));
	}
	@Test
	public void onePlaceの10の表示(){
		IntToEng ite = new IntToEng();
		String expected = "ten";
		String actual =ite.onePlace(ten);
		assertThat(actual,is(expected));
	}
}

