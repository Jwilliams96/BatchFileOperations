package batchFileOperations;

import java.io.File;

/**
 *
 * @author Jonathon
 */
public class Files {

    public Files(File[] originalFileNames) {
        this.originalFileNames = originalFileNames;
    }

    private File originalFileNames[];
    private File newFileNames[];

    public File[] getOriginalFileNames() {
        return originalFileNames;
    }

    public File getOriginalFileNames(int i) {
        return originalFileNames[i];
    }

    public void setOriginalFileNames(File[] originalFileNames) {
        this.originalFileNames = originalFileNames;
    }

    public void setOriginalFileNames(File originalFileName, int i) {
        originalFileNames[i] = originalFileName;
    }

    public File[] getNewFileNames() {
        return newFileNames;
    }

    public File getNewFileNames(int i) {
        return newFileNames[i];
    }

    public void setNewFileNames(File[] newFileNames) {
        this.newFileNames = newFileNames;
    }
        public void setNewFileNames(File newFileNames, int i) {
        this.newFileNames[i] = newFileNames;
    }
    public int getLength(){
        return this.originalFileNames.length;
    }
    
    public String[] getFileNames(){
        String[] fileNames = new String[this.getLength()];
        for (int i = 0; i < fileNames.length; i++) {
            fileNames[i] = this.getOriginalFileNames(i).getName();
        }
        return fileNames;
    } 
    public String[] getFileNames(int[] i){
        String[] fileNames = new String[i.length];
        for (int j = 0; j < i.length; j++) {
            fileNames[j] = this.getOriginalFileNames(i[j]).getName();
        }
        return fileNames;
    }
}
