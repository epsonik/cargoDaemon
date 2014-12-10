/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maisd;

import java.util.ArrayList;
import mboxDisposition.Errand;

/**
 *
 * @author mateusz
 */
public class ProcessDataFromErrandFile {

    private final ArrayList<Errand> h = new ArrayList<>();
    private static Errand errand = new Errand();
    public ProcessDataFromErrandFile(ReadFile readFile) {
        for (Object ch : readFile) {
            String[] q = ((String) ch).split(" ");
            try {
                h.add(new Errand(Integer.parseInt(q[0]), Integer.parseInt(q[1]), Integer.parseInt(q[2]), q[3], Integer.parseInt(q[4])));
            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                System.out.println("File consists data in wrong format.");
            }

        }
    }

    public ArrayList<Errand> getErrand() {
        return h;
    }
    public String getName(int i) {
        return h.get(i).getName();
    }
        public int getNumber(int i) {
        return h.get(i).getNumber();
    }

    public int getStart(int i) {
        return h.get(i).getStart();
    }

    public int getEnd(int i) {
        return h.get(i).getEnd();
    }

    public int getPriority(int i) {
        return h.get(i).getPriority();
    }
    public int getSize(){
        return h.size();
    }
}
