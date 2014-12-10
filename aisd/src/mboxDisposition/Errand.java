/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mboxDisposition;

/**
 *
 * @author mateusz
 */
public class Errand {

    private int number;
    private int start;
    private int end;
    private String name;
    private int priority;

    public Errand(int number, int start, int end, String name, int priority) {
        this.number = number;
        this.start = start;
        this.end = end;
        this.name = name;
        this.priority = priority;
    }

    public Errand() {

    }

    public int getNumber() {
        return number;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public int getPriority() {
        return priority;
    }

    public String getName() {
        return name;
    }
}
