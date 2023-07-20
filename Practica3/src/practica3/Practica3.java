/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;
import javax.swing.JOptionPane;
public class Practica3 {

    public static void main(String[] args) {
        Iglesia iglesia = new Iglesia();
        iglesia.pastores();
        iglesia.solicitarinfo();
        
        JOptionPane.showMessageDialog(null,
                "\n Cantidad de pastores " + iglesia.getPastores() +
                "\n Nombre de la iglesia " + iglesia.getNomdeiglesia() + 
                "\n Nombre del pastor " + iglesia.getNomdepastor() + 
                "\n Cantidad de Feligreses registrados " + iglesia.getFeligreses() +
                "\n Cedula " + iglesia.getCedula() +
                "\n Ganado por la iglesia " + iglesia.getMontoIglesia());
    }
    
}
