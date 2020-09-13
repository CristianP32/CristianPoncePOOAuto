/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cristianponcepooauto;

/**
 *
 * @author Administrator
 */
public class CristianPoncePOOAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     Auto Auto;
     Auto = new Auto("Fiat",2017,0);
       
     
     Auto.setmarca("Fiat");
     Auto.setmodelo(2017);
     Auto.setKilometraje(5);
     
     Auto.estadoAuto(100); 
     
     Auto.print();
    }
    
}
