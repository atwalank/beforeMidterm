/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namingarray;

/**
 *
 * @author Owner
 */
public class Testing {
    public static void main(String[] args)
    {
        Students[] s1 = new Students[3];
        Students a1 = new Students();
        
        a1.setName("Ankush Atwal");
        a1.setNo(4);
        
        Students a2 = new Students();
        
        a2.setName("Aditi Kaur");
        a2.setNo(2);
        
        Students a3 = new Students();
        a3.setName("Any Other");
        a3.setNo(100);
        
        s1[0] = a1;
        s1[1] = a2;
        s1[2] = a3;
        
        for(int i=0;i<s1.length;i++)
        {
            System.out.println(s1[i].getNo() + " " + s1[i].getName());
        }
    }
}
