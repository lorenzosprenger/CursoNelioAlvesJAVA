package application;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        String path = "/Users/lorenzovanlaresprenger/Library/Mobile Documents/com~apple~CloudDocs/CursoNelioAlvesJAVA/FileWriter-BufferedWriter/out.txt";
        //o true indica que nao é para recriar o arquivo
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true ))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}