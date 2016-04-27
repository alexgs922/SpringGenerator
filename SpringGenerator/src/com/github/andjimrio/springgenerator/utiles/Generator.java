package com.github.andjimrio.springgenerator.utiles;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.github.andjimrio.springgenerator.common.Files;
import com.github.andjimrio.springgenerator.common.Stream2;

public class Generator {
	public static final String converter1 = "CLASEToStringConverter.txt";
	public static final String converter2 = "StringToCLASEConverter.txt";
	public static final String repository = "CLASERepository.txt";
	public static final String service = "CLASEService.txt";

	public static void generateConverters(String fichero) {
		List<String> converters = new ArrayList<String>();

		Stream2.fromFile(fichero).forEach(l -> {
			String res1 = sustituyeFichero(l, getUrl(converter1));
			String file1 = ".\\converter\\" + l + "ToStringConverter.java";
			Files.guardaString(res1, file1);
			converters.add("\t\t<bean class=\"converters." + l + "ToStringConverter\" />");

			String res2 = sustituyeFichero(l, getUrl(converter2));
			String file2 = ".\\converter\\StringTo" + l + "Converter.java";
			Files.guardaString(res2, file2);
			converters.add("\t\t<bean class=\"converters.StringTo" + l + "Converter\" />");
		});
		String string = converters.stream().collect(Collectors.joining("\n"));
		Files.guardaString(string, ".\\converter\\00config.txt");
	}

	public static void generateRepositoryAndService(String fichero) {
		Stream2.fromFile(fichero).forEach(l -> {
			String res1 = sustituyeFichero(l, getUrl(repository));
			String file1 = ".\\repository\\" + l + "Repository.java";
			Files.guardaString(res1, file1);

			String res2 = sustituyeFichero(l, getUrl(service));
			String file2 = ".\\service\\" + l + "Service.java";
			Files.guardaString(res2, file2);
		});
	}

	public static String sustituyeFichero(String clase, String file) {
		List<String> strings = Stream2.fromFile(file).map(s -> s.replaceAll("CLASE", clase))
				.map(s -> s.replaceAll("clase", clase.toLowerCase())).toList();
		String string = strings.stream().collect(Collectors.joining("\n"));

		return string;
	}

	public static String getUrl(String url) {
		URL uri = Generator.class.getResource(url);
		return uri.getPath();
	}
}
