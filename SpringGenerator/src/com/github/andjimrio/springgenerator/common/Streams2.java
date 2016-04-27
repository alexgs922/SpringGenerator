package com.github.andjimrio.springgenerator.common;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * <p> Esta clase proporciona métodos de extensión del tipo <code> Stream </code> proporcionado por el API de Java. 
 * La clase {@link us.lsi.stream.Stream2 Stream2} combina estos métodos junto con los proporcionados por <code> Stream </code>
 * además de los métodos de factoría de la clase  {@link us.lsi.stream.Streams2 Streams2} </p>
 * 
 * 
 * * @author Miguel Toro
 */
public class Streams2 {

	
	/**
	 * @param a Un entero
	 * @param b Un entero
	 * @param c Un entero
	 * @return Un stream de enteros que forman una progresión 
	 * aritmética desde a hasta b con razón c sin incluir el valor b.
	 */
	public static IntStream range(Integer a, Integer b, Integer c){
		Integer hasta = (b-a)/c;
		if((b-a)%c == 0){
			hasta = hasta - 1;
		} 
		return IntStream.rangeClosed(0, hasta).map(x->a+c*x);
	}
	/**
	 * @param a Un entero
	 * @param b Un entero
	 * @param c Un entero
	 * @return Un stream de enteros que forman una progresión 
	 * aritmética desde a hasta b con razón c incluyendo el valor b se es posible
	 */
	public static IntStream rangeClosed(Integer a, Integer b, Integer c){
		Integer hasta = (b-a)/c;
		return IntStream.rangeClosed(0, hasta).map(x->a+c*x);
	}
	/**
	 * @param a Un entero
	 * @param b Un entero
	 * @param c Un entero
	 * @return Un stream de enteros que forman una progresión 
	 * aritmética desde a hasta b con razón c sin incluir el valor b.
	 */
	public static LongStream range(Long a, Long b, Long c){
		Long hasta = (b-a)/c;
		if((b-a)%c == 0){
			hasta = hasta - 1;
		} 
		return LongStream.rangeClosed(0, hasta).map(x->a+c*x);
	}
	/**
	 * @param a Un entero
	 * @param b Un entero
	 * @param c Un entero
	 * @return Un stream de enteros que forman una progresión 
	 * aritmética desde a hasta b con razón c incluyendo el valor b se es posible
	 */
	public static LongStream rangeClosed(Long a, Long b, Long c){
		Long hasta = (b-a)/c;
		return LongStream.rangeClosed(0, hasta).map(x->a+c*x);
	}

	
	/**
	 * @param file Un fichero
	 * @return Un stream formado por las líneas del fichero
	 * @exception IllegalArgumentException si no se encucntra el fichero
	 */
	@SuppressWarnings("resource")
	public static Stream<String> fromFile(String file) {
		BufferedReader f = null;
		try {
			f = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			throw new IllegalArgumentException(
					"No se ha encontrado el fichero " + file);
		}
		return f.lines();
	}
	/**
	 * @return Un stream formado por las líneas escritas en la consola
	 */
	public static Stream<String> fromConsole() {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		return f.lines();
	}

	/**
	 * @param s Un String
	 * @param delim Unos delimitadores
	 * @return Un stream formado por los elementos resultantes de separar el String original
	 * por los delimitadores
	 */
	public static Stream<String> fromString(String s, String delim) {
		String[] r = s.split(delim);
		return Arrays.<String> stream(r).<String> map((String x) -> x.trim())
				.filter((String x) -> x.length() > 0);
	}
	  
}
