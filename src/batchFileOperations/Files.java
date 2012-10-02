package batchFileOperations;

import java.io.File;

/**
 *
 * @author Jonathon
 */
public class Files {

    private File originalFiles[];
    private StringBuilder newFiles[];

    public Files(File[] originalFiles) {
        this.originalFiles = originalFiles;
        this.newFiles = new StringBuilder[originalFiles.length];
        for (int i = 0; i < originalFiles.length; i++) {
            this.newFiles[i] = new StringBuilder(this.originalFiles[i].getName());
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

    public StringBuilder[] getNewFiles() {
        return newFiles;
    }

    public StringBuilder getNewFile(int i) {
        return newFiles[i];
    }

    public void setNewFile(StringBuilder newFile, int i) {
        this.newFiles[i] = newFile;
    }
    public void setNewFileNames(StringBuilder[] newFileNames){
        this.newFiles =  newFileNames;
    }

    public int getNewFilesLength() {
        return this.originalFiles.length;
    }

    public StringBuilder[] getFileNames() {
        StringBuilder[] fileNames = new StringBuilder[this.getNewFilesLength()];
        for (int i = 0; i < fileNames.length; i++) {
            fileNames[i] = this.getNewFile(i);
        }
        return fileNames;
    }

    public StringBuilder[] getFileNames(int[] i) {
        StringBuilder[] fileNames = new StringBuilder[i.length];
        for (int j = 0; j < i.length; j++) {
            fileNames[j] = this.getNewFile(i[j]);
        }
        return fileNames;
    }

    public void rename(int[] i) {
        for (int j = 0; j < i.length; j++) {
            originalFiles[i[j]].renameTo(new File(originalFiles[j].getParent()
                    + "/" + newFiles[j]));
        }
    }
}
