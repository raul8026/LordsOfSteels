/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordsofsteel;

/**
 *
 * @author rruiz
 */
public class HumaOrdre extends Huma implements Ordre{

    public HumaOrdre(String nom, int forca, int constitucio, int velocitat, int intelligencia, int sort, Arma arma) {
        super(nom, forca, constitucio, velocitat, intelligencia, sort, arma);
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getConstitucio() {
        return constitucio;
    }

    public void setConstitucio(int constitucio) {
        this.constitucio = constitucio;
    }

    public int getVelocitat() {
        return velocitat;
    }

    public void setVelocitat(int velocitat) {
        this.velocitat = velocitat;
    }

    public int getIntelligencia() {
        return intelligencia;
    }

    public void setIntelligencia(int intelligencia) {
        this.intelligencia = intelligencia;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public int getPd() {
        return pd;
    }

    public void setPd(int pd) {
        this.pd = pd;
    }

    public int getPa() {
        return pa;
    }

    public void setPa(int pa) {
        this.pa = pa;
    }

    public int getPe() {
        return pe;
    }

    public void setPe(int pe) {
        this.pe = pe;
    }

    public int getPsMax() {
        return psMax;
    }

    public void setPsMax(int psMax) {
        this.psMax = psMax;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public void restauracio() {
     psMax=constitucio+forca;
    this.ps=(int) (ps*1.1);
    if((this.ps*1.1 > psMax)) {
       this.ps = psMax; 
    }else{
        this.ps=(int) (ps*1.1);
    }
    }
    
}
