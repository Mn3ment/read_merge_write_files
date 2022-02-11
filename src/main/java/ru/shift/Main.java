package ru.shift;

import org.apache.commons.cli.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            Options options = new Options();
            Option numbers = new Option("i", "integers", false, "sort integers");
            numbers.setRequired(false);
            options.addOption(numbers);

            Option strings = new Option("s", "strings", false, "sort strings");
            strings.setRequired(false);
            options.addOption(strings);

            Option asc = new Option("a", "asc", false, "sort by asc");
            asc.setRequired(false);
            options.addOption(asc);

            Option desc = new Option("d", "desc", false, "sort by desc");
            asc.setRequired(false);
            options.addOption(desc);

            Option input1 = new Option("inp1", "input1", true, "input file path");
            input1.setRequired(true);
            options.addOption(input1);

            Option input2 = new Option("inp2", "input2", true, "input file path");
            input2.setRequired(true);
            options.addOption(input2);

            Option input3 = new Option("inp3", "input3", true, "input file path");
            input3.setRequired(false);
            options.addOption(input3);

            Option output = new Option("otp", "output", true, "output file path");
            output.setRequired(true);
            options.addOption(output);

            CommandLineParser parser = new DefaultParser();
            HelpFormatter formatter = new HelpFormatter();
            CommandLine cmd = null;

            try {
                cmd = parser.parse(options, args);
            } catch (ParseException e) {
                System.out.println(e.getMessage());
                formatter.printHelp("utility-name", options);

                System.exit(1);
            }

            String inputFile = cmd.getOptionValue("inp1");
            String outputFile = cmd.getOptionValue("output");
            String inputFile2 = cmd.getOptionValue("inp2");
            String inputFile3 = cmd.getOptionValue("inp3");

        if (cmd.hasOption("i")) {
            int[] first = ReadFile.fileReader(inputFile);
            System.out.println("Значения 1го файла - " + Arrays.toString(first));
            int[] second = ReadFile.fileReader(inputFile2);
            System.out.println("Значения 2го файла - " + Arrays.toString(second));
            int[] rsl = MergeSort.merge(first, second);
            if (cmd.hasOption("inp3")) {
                int[] third = ReadFile.fileReader(inputFile3);
                System.out.println("Значения 3го файла - " + Arrays.toString(third));
                rsl = MergeSort.merge(first, second, third);
            }
            if (cmd.hasOption("d")) {
                MergeSort.reverse(rsl);
            }
            WriteFile.fileWriter(rsl, outputFile);
            System.out.println("Результат слияния - " + Arrays.toString(rsl));
        }

        else if (cmd.hasOption("s")) {
            String[] first = ReadFile.fileReaderForString(inputFile);
            System.out.println("Значения 1го файла - " + Arrays.toString(first));
            String[] second = ReadFile.fileReaderForString(inputFile2);
            System.out.println("Значения 2го файла - " + Arrays.toString(second));
            String[] rsl = MergeSort.merge(first, second);
                if (cmd.hasOption("-inp3")) {
                String[] third = ReadFile.fileReaderForString(inputFile3);
                System.out.println("Значения 3го файла - " + Arrays.toString(third));
                rsl = MergeSort.merge(first, second, third);
            }
            if (cmd.hasOption("d")) {
                MergeSort.reverse(rsl);
            }
            WriteFile.fileWriter(rsl, outputFile);
            System.out.println("Результат слияния - " + Arrays.toString(rsl));
        }

    }
}

