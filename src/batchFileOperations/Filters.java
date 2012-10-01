/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package batchFileOperations;

import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author JWilliams96
 */
public class Filters {
    public static FileNameExtensionFilter getVideoFilter(){
        return new FileNameExtensionFilter(
                "Video Files", "avi", "mkv", "ogm");
    }
}
