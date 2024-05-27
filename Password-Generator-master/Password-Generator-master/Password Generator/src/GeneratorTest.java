import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeneratorTest {
	
	private final Password password = new Password("Secret");
	private final Alphabet firstAlphabet = new Alphabet(true, false, false, false);
	private final Alphabet secondAlphabet = new Alphabet(false, true, true, true);
	private final Generator generator = new Generator(true, false, false, false);
	
	@Test
	void test1() {
		assertEquals("Secret", password.toString());
	}

	@Test
	void test2() {
		assertEquals(firstAlphabet.getAlphabet(), "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	}

	@Test
	void test3() {
		assertEquals(secondAlphabet.getAlphabet(), "abcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()-_=+\\/~?");
	}
	
	@Test
	void test4() {
		assertEquals(generator.alphabet.getAlphabet(), "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	}
	
	@Test
	void test5() {
		assertEquals(generator.alphabet.getAlphabet().length(), 26);
	}

}
