package dio.exception.checked;

import javax.swing.*;
import java.io.*;

public class AtividadeCheckedExeption {
    public static void main(String[] args) {
        String fileName = "romances-blake-crouch.txt";

        try {
            writeFile(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Revise o nome do arquivo que você deseja acessar !!!!! " + e.getCause());
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado! entre em contato com o sistema " + e.getCause());
        }

        System.out.println("Apesar da exception ou não, o programa continua...");

    }

    public static  void writeFile(String fileName) throws IOException {
        File file = new File(fileName);

        BufferedReader br =new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while (line != null);
        bw.flush();
        br.close();
    }
}
