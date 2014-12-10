package maisd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ReadFile implements Iterable{
    
    private static BufferedReader file;
    private final ArrayList<String> k = new ArrayList<>();
    private String fileName;
    private static ReadFile readFile = null;
    private int NumberOfVertices;


    public void read() throws IOException {
        BufferedReader plik = null;
        int i;
        try {
            plik = new BufferedReader(new FileReader(this.fileName));
            String bufor = plik.readLine();
            while (bufor != null) {
                k.add(bufor);
                bufor = plik.readLine();
            }
        } finally {
            if (plik != null) {
                plik.close();
            }
        }
    }
    public ArrayList<String> getFile() {
        return k;
    }

    public ReadFile(String fileName) throws IOException {
        this.fileName=fileName;
    }
    
    public Iterator iterator() {
        return k.iterator();
    }

    public ArrayList<String> getParsedData() {
        return k;
    }

}
