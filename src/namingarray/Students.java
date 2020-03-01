/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namingarray;

/**
 *
 * @author Owner ankush
 */
public class Students {

    /**
     * @param args the command line arguments
     */
    private String name; //names
    private int no;  //numbers
    private double area;  

    /**
     * @return the name
     */
    //want to see the pull
    public String getName() {
        return name;       //this is to watch pull action
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the no
     */
    public int getNo() {
        return no;
    }

    /**
     * @param no the no to set
     */
    public void setNo(int no) {
        this.no = no;
    }

    /**
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(double area) {
        this.area = area;
    }
    
    
}
