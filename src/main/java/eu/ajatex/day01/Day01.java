package eu.ajatex.day01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Day01 {
    public static void main(String[] args) throws IOException {
        Files.readAllLines(Path.of("./src/main/java/eu/ajatex/day01/input.txt"));
        System.out.println("Hello world!");
    }
}