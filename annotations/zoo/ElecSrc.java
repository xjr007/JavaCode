public @interface ElecSrc {
	// Not a marker because of abstract attribute
	// 
	// Can be a marker (markers can have CONSTANT VARIABLES) excl. abstract method
	public int voltage();
	int MIN_VOLTAGE = 2;
	public static final int MAX_VOLTAGE = 18;
}
