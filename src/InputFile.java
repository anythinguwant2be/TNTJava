import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class InputFile {

    public static String data;
    public static ArrayList<String> readInputFile(File listFile[]){
        ArrayList<String> jobList = new ArrayList<String>();
        for(File files : listFile){
            if(files.getAbsolutePath().contains(".txt")){
                try{
                    String source = files.getAbsolutePath();
                    BufferedReader br = new BufferedReader(new FileReader(source));
                    while((data = br.readLine())!=null){
                        if(data.contains("Job Id        :")){
                            String job = data.substring(16);
                            //System.out.println(data);
                            jobList.add(job);
                        }
                        else{
                            //System.out.println(files.getAbsolutePath());
                            //System.out.println("No Job ID");
                        }
                    }
                }
                catch(IOException e){
                    System.out.println("Error File Not Found");
                    e.printStackTrace();
                }
            }
        }
        return jobList;
    }
}
