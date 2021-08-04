@FunctionalInterface

interface TakeThree<T, U, V, R> {
	R apply(T t, U u, V v);
}
