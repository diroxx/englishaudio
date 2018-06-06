/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package englishaudio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

/**
 *
 * @author Monte
 */
public class EnglishAudio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path path = Paths.get("GameOption.txt");
        try {
        List<String> fileContent = new ArrayList<>(Files.readAllLines(path, StandardCharsets.UTF_8));

        for (int i = 0; i < fileContent.size(); i++) {
            if (fileContent.get(i).equals("AudioResourceType = 5")) {
                fileContent.set(i, "AudioResourceType = 2");
                break;
            }
        }
        Files.write(path, fileContent, StandardCharsets.UTF_8);
        } catch(IOException e) {System.out.println("GameOption.txt file not found.");}
    }

}
