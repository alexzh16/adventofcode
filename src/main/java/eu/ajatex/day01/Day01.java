package eu.ajatex.day01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Day01 {
    public static void main(String[] args) throws IOException {
        List<String> importData = Files.readAllLines(Path.of("./src/main/java/eu/ajatex/day01/input.txt"));
        int sum = 0;
        List<Integer> sumOfCallories = new ArrayList<>();

        for (String importDatum : importData) {
            if (!importDatum.isEmpty()) {
                sum += Integer.parseInt(importDatum);
            } else {
                sumOfCallories.add(sum);
                sum = 0;
            }
        }
        if (sum > 0) sumOfCallories.add(sum);
        sumOfCallories.sort(Comparator.reverseOrder());
        Integer totalSum = sumOfCallories.stream().limit(3).reduce(0, Integer::sum);
        if (sumOfCallories.size() > 0) System.out.println(sumOfCallories.get(0).toString() + " sum 3: " + totalSum);
    }
}