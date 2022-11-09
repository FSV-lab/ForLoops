/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package forloops;

/**
 *
 * @author ferch
 */
public class ForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int passmark = 12;
        boolean passed = false;
        int [] scores = {4,6,2,8,12,35,9};
        for (int uniScore : scores ) {
            if (uniScore>=12) {
                passed=true;
                break;
            }
        }
        System.out.println("At least one passed :"+passed);
    }
    
    
}
