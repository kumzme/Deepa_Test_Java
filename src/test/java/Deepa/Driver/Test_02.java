package Deepa.Driver;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;

import java.io.File;
import java.util.ArrayList;

import static Deepa.Utils.Gen_Utils.currDir;
import static Deepa.Driver.Common_Functions.*;
import org.apache.log4j.BasicConfigurator.*;

public class Test_02 {
    private static  final String op_Data_Folder = currDir() + "/src/main/resources/OutPutData";
    private static  final String Ip_Data_Folder = currDir() + "/src/main/resources/InputData";

    private static final Logger l = LogManager.getLogger("AA");

    // get a list of all file/directory names from the given
    public static  void main(String args[])throws Exception{

        String[] Files = List_Of_Files(currDir() );
        display_All_Values_In_Array(Files);
        ArrayList<String> file_paths =  list_file_path(currDir());
        display_All_Values_In_Array(file_paths);
//        ArrayList<String> a2 =  file_Read(file_paths.get(4),"src");
        String a2  = searchArryList(file_paths,"src");
        l.info(a2);
//        display_All_Values_In_Array(a2);
        JSONObject a3 = file_Read_Json(file_paths.get(4),"resources") ;
        display_All_Values_In_Array(a3);
        JSONObject j1 =  search_Write_Json("a");

        //File aa = write_File_Json(op_Data_Folder,a3);
//        l.info(aa);
        File a1 = write_File_Json(op_Data_Folder + "/OP_File1.json", j1);
        l.info(a1);


    }

}



