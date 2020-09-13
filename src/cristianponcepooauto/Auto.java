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
public class Auto {

   public Auto (String marca , int modelo , int kilometraje){     
    this.kilometraje = kilometraje;
    this.marca = marca;
    this.modelo = modelo;
    }
   
    private String marca;
    private int modelo,kilometraje;
   
    public void setmarca (String marca){
      this.marca = marca;    
         }
    public String getmarca(){
      return marca;
       }
    
    public void setmodelo(int modelo){
       this.modelo = modelo;
         }
    public int getmodelo(){
       return modelo;
       }
      
    public void setKilometraje(int kilometraje){
        if(kilometraje >= 0){
            this.kilometraje = kilometraje;
        }
    }

    public int getKilometraje(){
        return kilometraje;
    }
            
    
      
    public void estadoAuto(int kilometraje){
    
    if ( kilometraje < 0){
          System.out.println( "Error,el nro debe ser mayor o igual a cero." );
          return;
    } else  this.kilometraje = kilometraje;
    
    if( kilometraje == 0){
           System.out.println( "El auto es nuevo" );    
            }
    else if( kilometraje <= 10000){
           System.out.println( "El auto está poco usado" );
            }
    else if( kilometraje <= 100000){
           System.out.println( "El auto es usado" );                
           }
    else if( kilometraje > 100000){
           System.out.println( "El auto esta bastante usado" );           
           }                   
     }
    
    
   public void print (){
   
   System.out.println("La marca del auto es: " + marca);
    System.out.println("Es modelo: " + modelo);
     System.out.println("Su kilometraje es: " + kilometraje);
          }   
}
