import java.util.*;
import java.util.function.*;

public class A {
	Consumer<List<Integer>> methRef = Collections::sort;
}
