package com.github.andjimrio.springgenerator.main;

import com.github.andjimrio.springgenerator.utiles.Generator;

public class Main {
	public static void main(String[] args) {
		Generator.generateConverters("clases.txt");
		Generator.generateRepositoryAndService("clases.txt");
	}
}
