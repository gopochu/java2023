package business_logic.user.authorization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Reader_authorization {
    private BufferedReader output;
    private Process process;

    public void DebitCardReader() throws IOException {
        ProcessBuilder pb = new ProcessBuilder("cardreader.exe"); // указать имя исполняемого файла для работы с считывателем карт
        pb.redirectErrorStream(true);
        process = pb.start();

        InputStream is = process.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        output = new BufferedReader(isr);
    }

    private String readCardData() throws IOException{
        String cardData = output.readLine();
        return cardData;
    }

    private boolean isCardInserted(){
        return true;
    }
    public void dispose() {
        // прекращаем работу с считывателем
        process.destroy();
    }
}