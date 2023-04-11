import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String path ="C:\\MyAIT\\L53_11_04\\lesson\\src\\";
        String name="file.txt";
        createFile(path,name);
        writeDataInFile(path,name,"aaa\nbbbbb\ncccc");
        readDataFile(path,name);
        System.out.println();
        System.out.println("Longest string is: "+foundLongestString(path,name));

    }
    public   static String foundLongestString (String path, String name) throws FileNotFoundException {
        String data="";
        File myFile=new File(path,name);
        List<String> allData= new ArrayList<>();
        Scanner myReader=new Scanner(myFile);
        while(myReader.hasNextLine()){
            data= myReader.nextLine();
            allData.add(data);

        }
        String shortest= allData.get(0);
        String longest= allData.get(0);
        for (int i = 0; i < allData.size(); i++) {
            if (allData.get(i).length()>longest.length()){
            longest=allData.get(i);}

        }
        return longest;
    }

    public   static String readDataFile (String path, String name) throws FileNotFoundException {
        String data="";
        File myFile=new File(path,name);
        Scanner myReader=new Scanner(myFile);
        while(myReader.hasNextLine()){
            data= myReader.nextLine();
            System.out.print(data+" ");
        }return data;
    }

    public static void writeDataInFile (String path, String name, String data) throws IOException{

        FileWriter myWriter= new FileWriter(path+name);
        myWriter.write(data);
        myWriter.close();
    }
    public static void createFile(String path, String name) throws IOException {
        File myFile= new File(path,name);
        if (myFile.createNewFile()){
            System.out.println("File is created");
        } else{
            System.out.println("File already exists");
        }
    }
}