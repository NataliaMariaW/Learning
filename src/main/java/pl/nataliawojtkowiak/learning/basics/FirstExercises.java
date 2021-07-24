package pl.nataliawojtkowiak.learning.basics;

public class FirstExercises {

	int biggerValueOf(int first, int second) {
		int bigger;

		if (second > first) {
			bigger = second;
		}
		else {
			bigger = first;
		}
		return bigger;
	}


	int biggerValueOf(int first, int second, int third) {
		int bigger;
		if (first > second && first > third) {
			return first;
		}
		if (second > third) {
			return second;
		}
		return third;

	}

	int biggerValueOf(int first, int second, int third, int fourth) {
		int biggerOfFirstComparison;
		if (first > second) {
			biggerOfFirstComparison = first;
		}
		else {
			biggerOfFirstComparison = second;
		}

		int biggerOfSecondComparison;
		if (third > fourth) {
			biggerOfSecondComparison = third;
		}
		else {
			biggerOfSecondComparison = fourth;
		}

		if (biggerOfFirstComparison > biggerOfSecondComparison) {
			return biggerOfFirstComparison;
		}
		else {
			return biggerOfSecondComparison;
		}
	}

	int roundToTen(int value) {

		return 0;
	}

	int biggerValueOf(int first, int second, boolean shouldBeRoundedToTen) {

		return 0;
	}
}
