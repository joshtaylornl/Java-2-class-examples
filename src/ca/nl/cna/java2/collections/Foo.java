package ca.nl.cna.java2.collections;

import java.util.Comparator;

/**
 * Simple silly class with one int and one string value attributes
 *
 * @author Josh
 */
public class Foo implements Comparator<Foo> {

    private String var;
    private int num;

    /**
     * Simple constructor
     * @param var
     * @param num
     */
    public Foo(String var, int num) {
        this.var = var;
        this.num = num;
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public int compare(Foo o1, Foo o2) {
        return Integer.compare(o1.getNum(), o2.getNum());
    }

}
