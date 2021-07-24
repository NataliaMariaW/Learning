package pl.nataliawojtkowiak.learning.basics;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;


public class FirstExercisesTest {

	private FirstExercises firstExercises;

	@Before
	public void setUp() {
		firstExercises = new FirstExercises();
	}

	@Test
	public void shouldReturnBiggerValue() {
		// given
		// when
		int result = firstExercises.biggerValueOf(3, 2);
		int result2 = firstExercises.biggerValueOf(2, 3);

		// then
		Assertions.assertThat(result).isEqualTo(3);
		Assertions.assertThat(result2).isEqualTo(3);
	}

	@Test
	public void shouldReturnBiggerOfThreeValues() {
		// given
		// when
		int result = firstExercises.biggerValueOf(-123, -124, -122);

		// then
		Assertions.assertThat(result).isEqualTo(-122);
	}

	@Test
	public void shouldReturnBiggerOfFourValues() {
		// given
		// when
		int result = firstExercises.biggerValueOf(-123, -124, -122, -123);

		// then
		Assertions.assertThat(result).isEqualTo(-122);
	}

	@Test
	public void shouldReturnRoundedDownTo10() {
		// given
		// when
		int result = firstExercises.roundToTen(12);

		// then
		Assertions.assertThat(result).isEqualTo(10);
	}

	@Test
	public void shouldReturnRoundedUpTo10() {
		// given
		// when
		int result = firstExercises.roundToTen(18);

		// then
		Assertions.assertThat(result).isEqualTo(20);
	}

	@Test
	public void shouldReturnBiggerValueRoundingTo10() {
		// given
		// when
		int result = firstExercises.biggerValueOf(-123, -124, true);

		// then
		Assertions.assertThat(result).isEqualTo(-120);
	}
}