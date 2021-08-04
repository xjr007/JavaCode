import java.util.*;

public class A {}

class B extends A {}

class C extends B {}

class D {
	public static void main(String[] args) {
		// ? extends
		List<? extends B> list1 = new ArrayList<B>();
		List<? extends B> list2 = new ArrayList<C>();

		List<? extends A> list3 = new ArrayList<A>();
		List<? extends A> list4 = new ArrayList<B>();
		List<? extends A> list5 = new ArrayList<C>();

		List<? extends C> list6 = new ArrayList<C>();

		// ? super
		List<? super B> list7 = new ArrayList<A>();
		List<? super B> list8 = new ArrayList<B>();

		List<? super A> list9 = new ArrayList<A>();

		List<? super C> list10 = new ArrayList<C>();
		List<? super C> list11 = new ArrayList<B>();
		List<? super C> list12 = new ArrayList<A>();

		// COMPILER ERRORS
		// List<? extends B> list = new ArrayList<A>();
		// List<? extends B> list = new ArrayList<Object>();
	}

	// This method doesn't run 
	// private <X> void meth(List<X super B> list) {}
}
