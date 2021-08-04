public @interface Exercise {
	
	int hoursPerDay();
	/*	- ^ this is an attribute/element.
	 *	- hoursPerDay() is a required attribute (like abstract).
	 *
	 *	** Parenthesis is now required when using this annotation. **
	 * */

	int startHour() default 6;			
}
