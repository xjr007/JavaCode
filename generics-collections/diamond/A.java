/**	Diamond operator
 * 	Can only be used on right-side of assignment operator (Compiler error if not)
 *
 * */

import java.util.*;

public class A {
	public static void main(String args[]) {
		// old way
		List<Integer> oldList = new ArrayList<Integer>();
		Map<String, Integer> oldMap = new HashMap<String, Integer>();

		// generics contain generics
		Map<Long, List<Integer>> oldMapList = new HashMap<Long, List<Integer>>();

		// new way
		List<Integer> list = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		Map<Long, List<Integer>> mapList = new HashMap<>();
	}
}
