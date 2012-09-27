/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package batchFileOperations;

import java.io.IOException;

/**
 *
 * @author Jonathon
 */
public class CommandLineOperations {

    private final String renameCommand = "cmd.exe /k ren ";

    public void renameFiles(String originalFiles[], String newFiles[]) throws IOException {
        for (int i = 0; i < originalFiles.length; i++) {
            Runtime.getRuntime().exec(renameCommand + "\"" + originalFiles[i]
                    + "\" \"" + newFiles[i] + "\"");
        }
    }
}
