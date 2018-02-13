package Deepa.Driver;

import Deepa.Utils.File_Utils;
import com.esotericsoftware.yamlbeans.YamlReader;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;

import static Deepa.Utils.Gen_Utils.currDir;

public class Common_Functions {
    private static  final String op_Data_Folder = currDir() + "/src/main/resources/OutPutData";
    private static  final String Ip_Data_Folder = currDir() + "/src/main/resources/InputData";
    private static final Logger l = LogManager.getLogger(Common_Functions.class.getName());



    // get a list of all file/directory names from the given
    public static String[] List_Of_Files(String path) {
        return new File(path).list();
    }


    public static void display_All_Values_In_Array(String[] a1) {

        for (String val : a1) {
            l.info(val);
        }
    }

    public static void display_All_Values_In_Array(ArrayList<String> a1) {

        for (String val : a1) {
            l.info(val);
        }
    }

    public static void display_All_Values_In_Array(JSONObject a1) {

        for (Object key : a1.keySet()) {
            l.info(key + "::" + a1.get(key));
        }
    }


    public static ArrayList<String> list_file_path(String path) {
        File[] a = new File(path).listFiles();

        ArrayList<String> file_Path_Arry = new ArrayList<String>();
        for (File indv_a : a) {
            file_Path_Arry.add(indv_a.getAbsolutePath());

        }
        return file_Path_Arry;
    }

    public static String searchArryList(ArrayList<String> ArryList, String srcString)
    {
        String  a1 =  null;
          for (int i = 0; i<ArryList.size() ;i++) {
            if (ArryList.get(i).contains(srcString)){
                a1 = ArryList.get(i);
             }
          }
       return a1;
    }

    public static String searchAnotherArryList(ArrayList<String> ArryList, String srcString)
    {
        String  a1 =  null;
        for (String a2 : ArryList ){

            if(a2.contains(srcString)){
                 a1 = a2;

            }

        }
        return a1;
    }

    public static ArrayList<String> file_Read(String path, String src_Val) throws Exception {
        File my_file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(my_file));
        ArrayList<String> match_Val = new ArrayList<String>();
        String my_Text = null;
        int line = 0;
        while ((my_Text = br.readLine()) != null) {
            line++;
            if (my_Text.contains(src_Val)) {
                match_Val.add(my_Text);
                l.info(line);

            }
        }
        return match_Val;
    }

    public static JSONObject file_Read_Json(String file_Path, String Src_Val) throws Exception {

        File my_file = new File(file_Path);
        BufferedReader br = new BufferedReader(new FileReader(my_file));
        JSONObject j = new JSONObject();
        String my_Text = null;
        int line = 0;
        while ((my_Text = br.readLine()) != null) {
            line++;
            if (my_Text.contains(Src_Val)) {
                j.put(line, my_Text);
            }
        }
        return j;
    }

    public static File write_File_Json(String file_Path, JSONObject a3) throws Exception {
        File my_Write_file = File_Utils.file_Create(file_Path);

        BufferedWriter bw = null;
        bw = new BufferedWriter(new FileWriter(my_Write_file));
        bw.write(a3.toJSONString());
        bw.flush();
        return my_Write_file;
    }

    public static JSONObject search_Write_Json(String Search_Text) throws Exception{
      ArrayList<String> list_Files = list_file_path(Ip_Data_Folder);
      display_All_Values_In_Array(list_Files);
      JSONObject json_return = new JSONObject();
      for(String file_path:list_Files){
          JSONObject j = file_Read_Json(file_path,Search_Text) ;
          json_return.put(file_path,j);
      }
      return json_return;
    }
    public  static Map<String,Object> read_Yaml_File(String file_Path) throws Exception{
            //        Object aa = new YamlReader(new FileReader(file_Path)).read();
            //        Map a1 = (Map)aa;
            //        return a1;
        Yaml aa = new Yaml();
        aa.load(new FileReader(file_Path));

           return  (Map<String,Object>) new YamlReader(new FileReader(file_Path)).read();

    }

}