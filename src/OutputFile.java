import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class OutputFile {
    public static void createOutputFile(String directory, ArrayList<String> jobList){
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        String strDate = dateFormat.format(date);
        directory +="\\Output\\Output_" + strDate +".txt";

        System.out.println(directory);
        try {
            File myObj = new File(directory);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
                writeOutputFile(directory, jobList);
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeOutputFile(String directory, ArrayList<String> jobList){
        try {
            FileWriter myWriter = new FileWriter(directory);
            for(String job :jobList){
                myWriter.write(job + "\r\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}