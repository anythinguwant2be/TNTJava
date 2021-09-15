import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        String directory = "C:\\Users\\zoverson\\Desktop\\TNT";

        FileList file = new FileList(directory);

        File fileList[] = file.getList();

        ArrayList<String> jobList = new ArrayList<String>();

        jobList = InputFile.readInputFile(fileList);

        OutputFile.createOutputFile(directory, jobList);

    }
}
