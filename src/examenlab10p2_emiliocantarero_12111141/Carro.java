package examenlab10p2_emiliocantarero_12111141;

import java.io.Serializable;
import java.util.Random;


public class Carro implements Serializable{
    private int velocidad;
    private float derrape;
    private String nombre;
    private int ataque;
    private int vida;
    Random r=new Random();
    private static final long SerialVersionUID=777L;
    
    public Carro() {
    }

    public Carro(int velocidad, float derrape, String nombre, int ataque, int vida) {
        this.velocidad = velocidad;
        this.derrape = derrape;
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
        
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public float getDerrape() {
        return derrape;
    }

    public void setDerrape(float derrape) {
        this.derrape = derrape;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
