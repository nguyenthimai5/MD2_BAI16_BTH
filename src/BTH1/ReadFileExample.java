package BTH1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap duong dan file ma ban mong muon :");
        String path=scanner.nextLine();

        ReadFileExample readFileExample=new ReadFileExample();
        readFileExample.readFileText(path);

    }
    public void readFileText(String filePath){
        try {
            File file=new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String line="";
            int sum=0;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
                sum +=Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Tong = "+sum);
        }catch (Exception exception){
            System.err.println("file nay khong ton tai hoacnoi dung co loi: ");
        }
    }
}
