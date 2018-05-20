import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;


public class IntToEngTest {

	int one = 1;
	int ten = 10;
	int fifteen = 15;
	int twentyone = 21;
	int onetwothree = 123;
	int onezerothree = 103;
	int onezerozero = 100;
	int fivezeroonesix = 5016;
	int onezerox3 = 1000;
	int ninex4 = 9999;
	int onezerox4=10000;
	

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
	@Test
	public void translateEngの15の表示(){
		IntToEng ite = new IntToEng();
		String expected = "fifteen";
		String actual =ite.translateEng(fifteen);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngの21の表示(){
		IntToEng ite = new IntToEng();
		String expected = "twenty-one";
		String actual =ite.translateEng(twentyone);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void translateEngの123の表示(){
		IntToEng ite = new IntToEng();
		String expected = "one hundred twenty-three";
		String actual =ite.translateEng(onetwothree);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngの103の表示(){
		IntToEng ite = new IntToEng();
		String expected = "one hundred three";
		String actual =ite.translateEng(onezerothree);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngの100の表示(){
		IntToEng ite = new IntToEng();
		String expected = "one hundred ";
		String actual =ite.translateEng(onezerozero);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void translateEngの5016の表示(){
		IntToEng ite = new IntToEng();
		String expected = "five thousand sixteen";
		String actual =ite.translateEng(fivezeroonesix);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngの1000の表示(){
		IntToEng ite = new IntToEng();
		String expected = "one thousand";
		String actual =ite.translateEng(onezerox3);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngの9999の表示(){
		IntToEng ite = new IntToEng();
		String expected = "nine thousand nine hundred ninety-nine";
		String actual =ite.translateEng(ninex4);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngの10000の表示(){
		IntToEng ite = new IntToEng();
		String expected = "ten thousand";
		String actual =ite.translateEng(onezerox4);
		assertThat(actual,is(expected));
	}
}

