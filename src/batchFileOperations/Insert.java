package batchFileOperations;

import java.io.File;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jonathon
 */
public class Insert implements Operations {

    private boolean isOperational;
    private File[] originalFiles;
    private StringBuilder[] newFiles;
    private StringBuilder inputText;
    private String inputValue= "";
    private int inputInt;
    private JPanel myPanel = new JPanel();
    private JTextField insertWord = new JTextField(20);
    private JTextField insertChar = new JTextField(5);

    public Insert(StringBuilder[] originalFiles) {
        myPanel.add(new JLabel("Word to Insert ([n] to add a number):"));
        myPanel.add(insertWord);
        myPanel.add(Box.createHorizontalStrut(15));
        myPanel.add(new JLabel("Location (0 For Start, -1 for end):"));
        myPanel.add(insertChar);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Please Enter Values", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            this.inputText = new StringBuilder(insertWord.getText());
            if (Character.isDigit(insertChar.getText().charAt(0))) {
                this.inputInt = Integer.valueOf(insertChar.getText());
            } else {
                this.inputValue = insertChar.getText();
            }
        } else {
            isOperational = false;
        }
    }

    @Override
    public void displayOperation() {
        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Please Enter Values", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            this.inputText.delete(0, inputText.length() - 1);
            this.inputText.append(insertWord.getText());
            this.inputValue = insertChar.getText();
        }
    }

    @Override
    public boolean isOperational() {
        return isOperational;
    }

    @Override
    public StringBuilder[] getNewFileNames() {
        int searchValue = inputInt;
        for (int i = 0; i < newFiles.length; i++) {
            if(!Character.isDigit(insertChar.getText().charAt(0))){
            searchValue = newFiles[i].indexOf(inputValue);
        } 
            newFiles[i].insert(searchValue, inputText.toString());
        }
        return newFiles;
    }

    public void rename(int i[]) {
    }
}
