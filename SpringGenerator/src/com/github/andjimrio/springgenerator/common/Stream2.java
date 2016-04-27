package com.github.andjimrio.springgenerator.common;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author Miguel Toro
 *
 * @param <T> El tipo de los elementos del stream
 */
public class Stream2<T> implements Stream<T> {

	
	protected Stream<T> st;
	
	
	
	public static <T> Stream2<T> create(Stream<T> st) {
		return new Stream2<T>(st);
	}


	protected Stream2(Stream<T> st) {
		super();
		this.st = st;
	}

	
	@Override
	public Iterator<T> iterator() {
		return st.iterator();
	}


	@Override
	public Spliterator<T> spliterator() {
		return st.spliterator();
	}


	@Override
	public boolean isParallel() {
		return st.isParallel();
	}


	@Override
	public Stream2<T> sequential() {
		return Stream2.create(st.sequential());
	}


	@Override
	public Stream2<T> parallel() {
		return Stream2.create(st.parallel());
	}


	@Override
	public Stream2<T> unordered() {
		return Stream2.create(st.unordered());
	}


	@Override
	public Stream2<T> filter(Predicate<? super T> predicate) {
		return Stream2.create(st.filter(predicate));
	}


	@Override
	public <R> Stream2<R> map(Function<? super T, ? extends R> mapper) {
		return Stream2.create(st.map(mapper));
	}


	@Override
	public IntStream mapToInt(ToIntFunction<? super T> mapper) {
		return st.mapToInt(mapper);
	}


	@Override
	public LongStream mapToLong(ToLongFunction<? super T> mapper) {
		return st.mapToLong(mapper);
	}


	@Override
	public DoubleStream mapToDouble(ToDoubleFunction<? super T> mapper) {
		return st.mapToDouble(mapper);
	}


	@Override
	public <R> Stream2<R> flatMap(
			Function<? super T, ? extends Stream<? extends R>> mapper) {
		return Stream2.create(st.flatMap(mapper));
	}


	@Override
	public IntStream flatMapToInt(
			Function<? super T, ? extends IntStream> mapper) {
		return st.flatMapToInt(mapper);
	}


	@Override
	public LongStream flatMapToLong(
			Function<? super T, ? extends LongStream> mapper) {
		return st.flatMapToLong(mapper);
	}


	@Override
	public DoubleStream flatMapToDouble(
			Function<? super T, ? extends DoubleStream> mapper) {
		return st.flatMapToDouble(mapper);
	}


	@Override
	public Stream2<T> distinct() {
		return Stream2.create(st.distinct());
	}


	@Override
	public Stream2<T> sorted() {
		return Stream2.create(st.sorted());
	}


	@Override
	public Stream2<T> sorted(Comparator<? super T> comparator) {
		return Stream2.create(st.sorted(comparator));
	}


	@Override
	public Stream2<T> peek(Consumer<? super T> consumer) {
		return Stream2.create(st.peek(consumer));
	}


	@Override
	public Stream2<T> limit(long maxSize) {
		return Stream2.create(st.limit(maxSize));
	}

	@Override
	public void forEach(Consumer<? super T> action) {
		st.forEach(action);
	}


	@Override
	public void forEachOrdered(Consumer<? super T> action) {
		st.forEachOrdered(action);
	}


	@Override
	public Object[] toArray() {
		return st.toArray();
	}


	@Override
	public <A> A[] toArray(IntFunction<A[]> generator) {
		return st.toArray(generator);
	}


	@Override
	public T reduce(T identity, BinaryOperator<T> accumulator) {
		return st.reduce(identity, accumulator);
	}


	@Override
	public Optional<T> reduce(BinaryOperator<T> accumulator) {
		return st.reduce(accumulator);
	}


	@Override
	public <U> U reduce(U identity, BiFunction<U, ? super T, U> accumulator,
			BinaryOperator<U> combiner) {
		return st.reduce(identity, accumulator, combiner);
	}


	@Override
	public <R> R collect(Supplier<R> resultFactory,
			BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner) {
		return st.collect(resultFactory, accumulator, combiner);
	}


	@Override
	public <R, A> R collect(Collector<? super T, A, R> collector) {
		return st.collect(collector);
	}


	@Override
	public Optional<T> min(Comparator<? super T> comparator) {
		return st.min(comparator);
	}


	@Override
	public Optional<T> max(Comparator<? super T> comparator) {
		return st.max(comparator);
	}


	@Override
	public long count() {
		return st.count();
	}


	@Override
	public boolean anyMatch(Predicate<? super T> predicate) {
		return st.anyMatch(predicate);
	}


	@Override
	public boolean allMatch(Predicate<? super T> predicate) {
		return st.allMatch(predicate);
	}


	@Override
	public boolean noneMatch(Predicate<? super T> predicate) {
		return st.noneMatch(predicate);
	}


	@Override
	public Optional<T> findFirst() {
		return st.findFirst();
	}


	@Override
	public Optional<T> findAny() {
		return st.findAny();
	}

	
	/**
	 * 
	 * @param <E> El tipo de los elementos del stream
	 * @return Un StreamBuilder
	 */
	public static <E> Stream.Builder<E> builder() {
		return Stream.builder();
	}
	
	/**
	 * 
	 * @param <E> El tipo de los elementos del stream
	 * @return Un stream vacío
	 */
	public static <E> Stream2<E> empty() {
		return Stream2.<E>create(Stream.<E>empty());
	}
	
	/**
	 * 
	 * @param t Un valor de tipo T
	 * @param <E> El tipo de los elementos del stream
	 * @return Un stream con un elmento
	 */
	public static <E> Stream2<E> of(E t) {
		return Stream2.<E>create(Stream.<E>of(t));
	}
	
	/**
	 * 
	 * @param values Valores de tipo T
	 * @param <E> El tipo de los elementos del stream
	 * @return Un stream con los valores en values
	 */
	@SafeVarargs
	public static <E> Stream2<E> of(E... values) {
		return Stream2.<E>create(Stream.<E>of(values));
	}
	
	/**
	 * 
	 * 
	 * @param seed El valor inicial
	 * @param f Un operador unario
	 * @param <E> El tipo de los elementos del stream
	 * @return Un stream con los valores generados por el operador al ser aplicado sucesivamente a seed
	 */
	public static <E> Stream2<E> iterate(E seed, UnaryOperator<E> f) {
		return Stream2.<E>create(Stream.<E>iterate(seed,f));
	}
	
	/**
	 * 
	 * @param s Un supplier
	 * @param <E> El tipo de los elementos del stream
	 * @return Un stream con los valores sucesivamente proporcionados por s
	 */
	public static <E> Stream2<E> generate(Supplier<E> s) {
		return Stream2.<E>create(Stream.<E>generate(s));
	}

	/**
	 * @pre a == b o (b- a) c &gt; 0
	 * @param a Un entero
	 * @param b Un entero
	 * @param c Un entero
	 * @return Un stream formado por los enteros a + c i con 0 &le; i   y a + c i &lt; b
	 */
	public static IntStream range(Integer a, Integer b, Integer c){
		return Streams2.range(a, b, c);
	}
	
	/**
	 * @pre a == b o (b- a) c &gt; 0
	 * @param a Un entero
	 * @param b Un entero
	 * @param c Un entero
	 * @return Un stream formado por los enteros a + c i con 0 &le; i   y a + c i &le; b
	 */
	public static IntStream rangeClosed(Integer a, Integer b, Integer c){
		return Streams2.rangeClosed(a, b, c);
	}
	
	/**
	 * @pre (b- a) &ge; 0
	 * @param a Un entero
	 * @param b Un entero
	 * @return Un stream formado por los enteros a, a+1, a+2, ... hasta b sin incluir
	 */
	public static IntStream range(Integer a, Integer b){
		return Streams2.range(a, b, 1);
	}
	/**
	 * @pre a == b o (b- a) c &gt; 0
	 * @param a Un entero
	 * @param b Un entero
	 * @param c Un entero
	 * @return Un stream formado por los enteros a + c i con 0 &le; i   y a + c i &lt; b
	 */
	public static LongStream range(Long a, Long b, Long c){
		return Streams2.range(a, b, c);
	}
	/**
	 * @pre a == b o (b- a) c &gt; 0
	 * @param a Un entero
	 * @param b Un entero
	 * @param c Un entero
	 * @return Un stream formado por los enteros a + c i con 0 &le; i   y a + c i &le; b
	 */
	public static LongStream rangeClosed(Long a, Long b, Long c){
		return Streams2.rangeClosed(a, b, c);
	}
	/**
	 * @pre (b- a) &ge; 0
	 * @param a Un entero
	 * @param b Un entero
	 * @return Un stream formado por los enteros a, a+1, a+2, ... hasta b sin incluir
	 */
	public static LongStream range(Long a, Long b){
		return Streams2.range(a, b, 1L);
	}
	
	/**
	 * @param file Un fichero de entrada
	 * @return Un stream con las líneas del fichero
	 */
	public static Stream2<String> fromFile(String file){
		return Stream2.create(Streams2.fromFile(file));
	}
	
	/**
	 * @param s Un String
	 * @param delim Un conjunto de delimitadores o un aexpresión regular en general
	 * @return Un stream con los elementos de s separados por los delimitadores
	 * 
	 */
	public static Stream2<String> fromString(String s, String delim){
		return Stream2.create(Streams2.fromString(s,delim));
	}
	
	
	/**
	 * @param st Un stream
	 * @return La concatenación de this con st
	 */
	public Stream2<T> concat(Stream2<T> st){
		return  Stream2.create(Stream.concat((Stream<T>)this,(Stream<T>)st));
	}
	
	/**
	 * @return Una lista con los elementos del stream
	 */
	public List<T> toList() {
		return this.collect(Collectors.<T>toList());
	}
	
	/**
	 * @return Un conjunto con los elementos del stream
	 */
	public Set<T> toSet() {
		return this.collect(Collectors.<T>toSet());
	}


	@Override
	public void close() {
		st.close();
	}


	@Override
	public Stream<T> onClose(Runnable r) {
		return st.onClose(r);
	}


	@Override
	public Stream<T> skip(long n) {
		return st.skip(n);
	}
	
	
}
