@interface Material {}

public @interface Fluffy {
	// Elements are implicitly [public & abstract]
	int cuteness();
	public abstract int softness() default 11;
	protected Material material();	//	COMPILER ERROR
	private String friendly();	//	COMPILER ERROR
	final boolean isBunny();	//	COMPILER ERROR
}
