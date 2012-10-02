/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package attempt;

import batchFileOperations.Files;
import batchFileOperations.Filters;
import java.io.File;
import java.io.IOException;
import javax.swing.Box;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jonathon
 */
public class NewClass {

    public static void main(String[] args) throws IOException {

        File[] theseFiles;
        JFileChooser chooseFiles;
        DefaultListModel operations = new DefaultListModel();
        chooseFiles = new JFileChooser();

        chooseFiles.setFileFilter(Filters.getVideoFilter());
        chooseFiles.setMultiSelectionEnabled(
                true);
        chooseFiles.showOpenDialog(
                null);
        theseFiles = chooseFiles.getSelectedFiles();
        String[] newFiles = new String[3];
        newFiles[0] = "rext.txt";
        newFiles[1] = "rext1.txt";
        newFiles[2] = "rext3.txt";
        for (int j = 0; j < newFiles.length; j++) {
            theseFiles[j].renameTo(new File(theseFiles[j]));
        }
    }
}
