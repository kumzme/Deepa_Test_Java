package Deepa.Utils;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.File;

public class File_Utils {
    private static final Logger l = LogManager.getLogger(File_Utils.class);

    public static File file_Create(String file_Path) throws Exception {
        File my_File  =  new File(file_Path);
        if (!my_File.exists()){
            my_File.createNewFile();
        }

        return my_File;
    }
}
