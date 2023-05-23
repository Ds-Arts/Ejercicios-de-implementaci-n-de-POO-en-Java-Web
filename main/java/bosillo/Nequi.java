package bosillo;

import java.util.*;

public class Nequi implements Bolsillo{
    
    
    //se instancian los atributos
    private String usuario;
    private int contraseña;
    private int saldoActual=0;
    
    int saldo_recarga;
    int saldo_retiro;
    int recarga;
    int retira;
    int saldoTotal;

    //se instancia el metodo abstracto en este caso vacio

    public Nequi(){};



    public int getRecarga() {
        return recarga;
    }



    public void setRecarga(int recarga) {
        this.recarga = recarga;
    }



    public int getRetira() {
        return retira;
    }



    public void setRetira(int retira) {
        this.retira = retira;
    }



    public Nequi(String usuario, int contraseña, int saldoActual) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.saldoActual = saldoActual;
    }



    public Nequi(int recarga) {
        this.recarga = recarga;
    }



    public Nequi(int recarga, int retira) {
        this.recarga = recarga;
        this.retira = retira;
    }



    //se instancia el metodo en el cual vamos a trabajar gracias a las herramientas que ofrece el cualñ es Scanner
    Scanner leer = new Scanner (System.in);
//se instancian los metodos accesores
    public String getUsuario() {
        return usuario;
    }



    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }



    public int getContraseña() {
        return contraseña;
    }



    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }



    public int getSaldoActual() {
        return saldoActual;
    }



    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }


    
    public int recargarSaldo(){

        
        saldo_recarga=saldoActual+recarga;
        return saldo_recarga;

        
    }

    

    public int consultarSaldo(){

    saldoTotal=saldo_recarga+saldo_retiro;
    return saldoTotal;

}

    

    public int retirarSaldo(){
       
  
       saldo_retiro=saldoActual-retira;
            
            return saldo_retiro;

        }
    }
    

    
    



