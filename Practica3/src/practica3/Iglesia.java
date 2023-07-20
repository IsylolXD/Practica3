/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;
import javax.swing.JOptionPane;

public class Iglesia {
    private String Nomdeiglesia;
    private String Nomdepastor;
    private int Feligreses;
    public int Cedula; 
    public int Diezmo;
    public int Pastores;
    public int MontoIglesia;
    
    public Iglesia(){
        
    }

    public Iglesia(String Nomdeiglesia, String Nomdepastor, int Feligreses, int Cedula, int Diezmo, int Pastores,int MontoIglesia) {
        this.Nomdeiglesia = Nomdeiglesia;
        this.Nomdepastor = Nomdepastor;
        this.Feligreses = Feligreses;
        this.Cedula = Cedula;
        this.Diezmo = Diezmo;
        this.Pastores = Pastores;
        this.MontoIglesia = MontoIglesia;
    }

    public int getMontoIglesia() {
        return MontoIglesia;
    }

    public void setMontoIglesia(int MontoIglesia) {
        this.MontoIglesia = MontoIglesia;
    }

    public int getPastores() {
        return Pastores;
    }

    public void setPastores(int Pastores) {
        this.Pastores = Pastores;
    }

    public int getDiezmo() {
        return Diezmo;
    }

    public void setDiezmo(int Diezmo) {
        this.Diezmo = Diezmo;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }
    public void pastores(){
       
        this.Pastores = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de Pastores"));
        for (int i = 0; i < Pastores; i++){
            this.Nomdeiglesia = JOptionPane.showInputDialog(null, "Ingrese el nombre de la Iglesia"+ (i + 1));
            this.Nomdepastor = JOptionPane.showInputDialog(null, "Ingrese el nombre del Pastor" + (i + 1));
        }
    }
    public void solicitarinfo(){
        
        this.Feligreses = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la canidad de Feligreses"));
        this.MontoIglesia = 0;
        for (int i = 0; i < Feligreses; i++) {
            this.Cedula = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cedula"+ (i + 1)));
            this.Diezmo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de Diezmo dada"+ (i + 1)));
            this.MontoIglesia += this.Diezmo;
        }
    }

    public String getNomdeiglesia() {
        return Nomdeiglesia;
    }

    public void setNomdeiglesia(String Nomdeiglesia) {
        this.Nomdeiglesia = Nomdeiglesia;
    }

    public String getNomdepastor() {
        return Nomdepastor;
    }

    public void setNomdepastor(String Nomdepastor) {
        this.Nomdepastor = Nomdepastor;
    }

    public int getFeligreses() {
        return Feligreses;
    }

    public void setFeligreses(int Feligreses) {
        this.Feligreses = Feligreses;
    }
 
}
