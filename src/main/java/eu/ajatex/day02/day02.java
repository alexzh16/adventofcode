package eu.ajatex.day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class day02 {
    public static void main(String[] args) throws IOException {
        List<String> importData = Files.readAllLines(Path.of("./src/main/java/eu/ajatex/day01/input.txt"));
        System.out.println("day2");
    }
}
