/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordsofsteel;

/**
 *
 * @author rruiz
 */
public class Huma extends Personatge{
    
    public Huma(String nom,int forca, int constitucio, int velocitat,
                int intelligencia, int sort, Arma arma) {

        super(nom,forca,constitucio,velocitat,intelligencia,sort,arma);
        
    }

    @Override
    protected void calculaEstadistiquesSecundaries() {
        super.calculaEstadistiquesSecundaries();
        ps = constitucio + forca + intelligencia;
    }
            

}
