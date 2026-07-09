package application;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Lorenzo");
		list.add("Valesca");
		list.add("Joel");
		list.add(2, "Alexia");


		for (String string : list) {
			System.out.println(string);
		}

        System.out.println("------------------");


        list.removeIf(string -> string.toLowerCase().startsWith("j"));

        for (String string : list) {
            System.out.println(string);
        }
        System.out.println("------------------");
		System.out.println("A lista tem: "+ list.size()+ " nomes");
        System.out.println("Index of Lorenzo: " +  list.indexOf("Lorenzo"));
        System.out.println("Index of Joao: " +  list.indexOf("Joao"));
        System.out.println("------------------");

        List<String> result = list.stream().filter(string -> string.endsWith("a")).collect(Collectors.toList());
        for (String string : result) {
            System.out.println(string);

        }
	}

}
