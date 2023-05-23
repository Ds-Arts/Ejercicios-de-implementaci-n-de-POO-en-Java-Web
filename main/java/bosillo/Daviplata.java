package bosillo;
import java.util.*;
public class Daviplata {
            //se instancian los atributos
            private String usuario;
            private int contraseña;
            private int saldoActual=0;
            int recarga;
            int retira;
            int saldo_recarga;
            int saldo_retiro;
            int saldoTotal;
    
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

            //se inicializa el metodo constructor vacio
            public Daviplata() {
            };
    
            //se inicializa los metodos accesores
            
    
            //se inicializa el metodo escanner con el que vamos a trabajar el cual es el metodo Scanner
    
            public Daviplata(String usuario, int contraseña, int saldoActual) {
                this.usuario = usuario;
                this.contraseña = contraseña;
                this.saldoActual = saldoActual;
            }
    
            public Daviplata(int recarga) {
                this.recarga = recarga;
            }

            public Daviplata(int recarga, int retira) {
                this.recarga = recarga;
                this.retira = retira;
            }

            Scanner leer = new Scanner (System.in);
    
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
            
