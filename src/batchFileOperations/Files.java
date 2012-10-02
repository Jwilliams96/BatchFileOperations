package batchFileOperations;

import java.io.File;

/**
 *
 * @author Jonathon
 */
public class Files {

    private File originalFiles[];
    private String newFiles[];

    public Files(File[] originalFiles) {
        this.originalFiles = originalFiles;
        this.newFiles = new String[originalFiles.length];
        for (int i = 0; i < originalFiles.length; i++) {
            this.newFiles[i] = originalFiles[i].getName();
        }


    }

    public File[] getOriginalFile() {
        return originalFiles;
    }

    public File getOriginalFile(int i) {
        return originalFiles[i];
    }


    public void setOriginalFile(File originalFile, int i) {
        originalFiles[i] = originalFile;
    }

    public String[] getNewFiles() {
        return newFiles;
    }

    public String getNewFile(int i) {
        return newFiles[i];
    }

   
    public void setNewFile(String newFile, int i) {
        this.newFiles[i] = newFile;
    }

    public int getNewFilesLength() {
        return this.originalFiles.length;
    }

    public String[] getFileNames() {
        String[] fileNames = new String[this.getNewFilesLength()];
        for (int i = 0; i < fileNames.length; i++) {
            fileNames[i] = this.getNewFile(i);
        }
        return fileNames;
    }

    public String[] getFileNames(int[] i) {
        String[] fileNames = new String[i.length];
        for (int j = 0; j < i.length; j++) {
            fileNames[j] = this.getNewFile(i[j]);
        }
        return fileNames;
    }

    public void rename(int[] i) {
        for (int j = 0; j < i.length; j++) {
            originalFiles[i[j]].renameTo(new File(newFiles[j]));
        }
    }
}
