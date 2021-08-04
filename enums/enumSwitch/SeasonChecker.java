package enums.enumSwitch;

import java.util.*;
import java.util.function.*;

import enums.*;

public class SeasonChecker {
	static final Season[] seasons = Season.values();
	static Consumer<String> print = System.out::println; 
	
	public static void main(String ...args) {
		Season summer = Season.SUMMER;
		switch(summer) {
			case WINTER: print.accept("Get out the sled!");
				     break;
			case SUMMER: print.accept("Time for the pool!");
				     break;
			default: print.accept("Is it summer yet?");
		}
	}
}
