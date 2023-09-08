/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dugmici;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author isido
 */
public class Dugmici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JSpinner jSpinner = new JSpinner(new SpinnerNumberModel(101, 4, 100, 101));
    }
    
}
