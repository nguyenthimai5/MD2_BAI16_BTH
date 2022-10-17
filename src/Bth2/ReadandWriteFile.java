package Bth2;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadandWriteFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap duong dan file ma ban mong muon :");
//        String path = scanner.nextLine();
        ReadandWriteFile readandWriteFile = new ReadandWriteFile();
//        readandWriteFile.readFileText(path);
//        int max = integerList.get(0);
//        for (int maxList : integerList) {
//            if (max < maxList) {
//                max = maxList;
//            }
//        }
//        System.out.println("Max= " + max);
       readandWriteFile.writeFile(scanner,"D:\\MD2\\MD2_BAI16\\readLine.txt");
    }

    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (Exception exception) {
            System.err.println("file nay khong ton tai hoac noi dung co loi: ");
        }
    }

    public  void writeFile(Scanner scanner, String pathWrite) {
        File file = new File(pathWrite);
        FileOutputStream fileOutputStream = null;
                   try {
            fileOutputStream = new FileOutputStream(file);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
       OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter=new BufferedWriter(outputStreamWriter);
  do {
      System.out.println("Nhap du lieu cho dong:");
      String stringsLine=scanner.nextLine();

          try {
              bufferedWriter.write(stringsLine);
              bufferedWriter.flush();
              bufferedWriter.newLine();
          } catch (IOException e) {
              throw new RuntimeException(e);
          }
      System.out.println("Ban co muon nhap dong tiep theo khong:");
      System.out.println("1.Co");
      System.out.println("2.No");
      System.out.println("Su lua chon");
      int choice=Integer.parseInt(scanner.nextLine());
      if (choice!=1){
          break;
      }
  }while (true);
  try {
      bufferedWriter.close();
      outputStreamWriter.close();
      fileOutputStream.close();
  } catch (IOException e) {
      throw new RuntimeException(e);
  }
    }
}