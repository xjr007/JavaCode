class Bear {}

enum Size {SMALL, MEDIUM, LARGE}

public @interface Panda {
	Integer height(); //	COMPILER ERROR
	String[][] default generalInfo(); //	COMPILER ERROR
	Size size() default Size.SMALL;
	Bear friendlyBear(); //	COMPILER ERROR
	Exercise exercise() default @Exercise(hoursPerDay=3);
}
