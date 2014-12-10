package maisd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProcessDataFromConnectionsFile {

    private final ArrayList<ArrayList<Integer>> h = new ArrayList<>();
    private Map cities = new HashMap();

    public ProcessDataFromConnectionsFile(ReadFile readFile) {
        for (Object ch : readFile) {
                String[] q = ((String) ch).split(" ");
                ArrayList<Integer> temp = new ArrayList<Integer>();
                try {
                    for (String i : q) {
                        temp.add(Integer.parseInt(i));
                    }
                } catch (NumberFormatException | IndexOutOfBoundsException e) {
                    System.out.println("File consists other signs than numbers");
                }
                h.add(temp); 
        }
    }

    public ArrayList<ArrayList<Integer>> getConnections() {
        return h;
    }
}
