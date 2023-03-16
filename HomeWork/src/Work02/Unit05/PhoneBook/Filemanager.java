package Work02.Unit05.PhoneBook;

import java.util.ArrayList;
import java.io.*;

public class Filemanager {
    String FILE_PATH="C:\\Users\\sivvi\\Java\\Example_Java\\HomeWork\\src\\Work02\\Unit05\\PhoneBook\\";
    String FILE_NAME_EXPORT="export.csv";
    String FILE_PATH_FULL=FILE_PATH+FILE_NAME_EXPORT;

    public void ExportFile(ArrayList<Phonebook> pb){
        try(FileWriter writer=new FileWriter(FILE_PATH_FULL,false))
        {
            for(Phonebook i:pb){
                String text=i.getName()+";"+i.getPhone()+";"+i.getCity();
                writer.write(text);
                writer.append('\n');
            }

            writer.flush();
        }
          catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void ImportFile(ArrayList<Phonebook> pb){
        try
        {
            File file=new File(FILE_PATH_FULL);
            FileReader fr=new FileReader(file);

            BufferedReader reader=new BufferedReader(fr);
            String line=reader.readLine();

            while(line!=null){
                // System.out.println(line);
                String[] tmp=line.split(";");
                pb.add(new Phonebook(tmp[0],tmp[1],tmp[2]));
                line=reader.readLine();
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}