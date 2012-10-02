package batchFileOperations;

import java.io.File;

/**
 *
 * @author Jonathon
 */
public interface Operations {
    
    File[] getNewFiles();
    boolean isOperational();
    void displayOperation();
}
