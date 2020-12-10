package online;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class JobFiles {

    private String nameFiles = "logChat";

    public void writeString(int code,String textSave) {
        File file = new File("logChat_" + code +".txt");
        FileWriter writer = null;
        if (file.exists()){
            try {
                writer = new FileWriter("logChat_" + code +".txt", true);
            }
            catch (IOException e) {
                System.out.println(e);
            }
        }else{
            try {
                writer = new FileWriter("logChat_" + code +".txt");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            writer.write(textSave);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void readString() {

    }
}
