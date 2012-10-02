package batchFileOperations;

import java.io.File;

/**
 *
 * @author Jonathon
 */
public interface Operations {
    
    StringBuilder[] getNewFileNames();
    boolean isOperational();
    void displayOperation();
}
