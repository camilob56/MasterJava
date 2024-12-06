package com.camilob.frase.repetida;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class TextRepeat {

    public static Map<String, Integer> palabrasRepetidas(String texto) {

        texto = texto.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();

        Map<String, Integer> conteo = Arrays.stream(texto.split("\\s+"))
                .collect(Collectors.groupingBy(palabra -> palabra, Collectors.summingInt(palabra -> 1)));


        return conteo.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(entry -> Collections.singletonMap(entry.getKey(), entry.getValue()))
                .orElse(Collections.emptyMap());
    }

}
