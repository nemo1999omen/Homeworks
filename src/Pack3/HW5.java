package Pack3;
import java.io.*;
import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File file = new File("src\\Pack3\\text.csv");
        AppData a1 = new AppData();

        try(BufferedWriter outputStream = new BufferedWriter(new FileWriter(file))){
            for(int i=0; i<a1.header.length; i++){
                outputStream.write(a1.header[i]);
            }
            outputStream.newLine();
            for(int i=0; i<a1.data.length; i++){
                for(int j=0; j<a1.data.length; j++){
                    outputStream.write(a1.data[i][j] + ";");
                }
                outputStream.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        try(Reader inputStream = new FileReader(file)){
            int count;
            while ((count = inputStream.read()) != -1){
                System.out.print((char) count);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
