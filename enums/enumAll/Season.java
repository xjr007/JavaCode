public enum Season {
	WINTER("low"), 
	SPRING("medium"), 
	SUMMER("high"), 
	FALL("medium");

	private final String expectedVisitors;

	private Season(String expectedVisitors) {
		this.expectedVisitors = expectedVisitors;
	}

	public void print() {
		System.out.print(expectedVisitors);
	}

}
