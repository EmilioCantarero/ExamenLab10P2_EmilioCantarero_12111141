package examenlab10p2_emiliocantarero_12111141;


public class Salto extends Carro{
    private int salto;

    public Salto() {
        super();
    }

    public Salto(int salto, int velocidad, float derrape, String nombre, int ataque, int vida) {
        super(velocidad, derrape, nombre, ataque, vida);
        this.salto = salto;
    }

    public int getSalto() {
        return salto;
    }

    public void setSalto(int salto) {
        this.salto = salto;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
    
}
