package Deepa.Driver;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Map;

import static Deepa.Driver.Common_Functions.read_Yaml_File;
import static Deepa.Utils.Gen_Utils.currDir;

public class Test_03 {
    private static final Logger l = LogManager.getLogger("AA");
    private static  final String Ip_Data_Folder = currDir() + "/src/main/resources/InputData";

    public static  void main(String args[])throws Exception{

        Map a10 = read_Yaml_File(Ip_Data_Folder + "/SampleYml.yml");

        l.info(a10.get("test"));


        l.info( ((Map)(((Map)((Map)a10.get("test")).get("post")).get("bundle exec rake jasmine"))).get("environment") );
        Map a1 = (Map)a10.get("test");

        Map a2 = (Map)a1.get("post");
        Map a3 = (Map)a2.get("bundle exec rake jasmine");
        Map a4 = (Map)a3.get("environment");
        l.info(a4.get("RAILS_ENV"));

    }

}
