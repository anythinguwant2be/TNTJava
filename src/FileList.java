import java.io.File;
import java.io.IOException;
public class FileList {

    public File directoy;
    public File filesList[];

    public FileList(String currentDirectory){
        this.directoy = new File(currentDirectory);
        //List of all files and directories
        this.filesList = directoy.listFiles();
    }

    public File[] getList(){
        return filesList;
    }

    public static void main(String args[]) throws IOException {

    }
}