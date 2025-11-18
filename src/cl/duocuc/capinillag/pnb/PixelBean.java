/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cl.duocuc.capinillag.pnb;

import cl.duocuc.capinillag.pnb.gui.LoginFrame;



/**
 *
 * @author Carlos
 */
public class PixelBean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // Ejecuta en el Event Dispatch Thread (EDT)
        java.awt.EventQueue.invokeLater(() -> {
            new LoginFrame().setVisible(true);
        });
    }
    
}
