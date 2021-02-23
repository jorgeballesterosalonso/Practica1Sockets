package main.java.com.example.demo.Entidad;

public class Coche {
    private String marca;
    private String matricula;
    private int id;

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Coche(String marca, String matricula, int id) {
        this.marca = marca;
        this.matricula = matricula;
        this.id = id;
    }

    @Override
    public String toString() {
        return "{" + " marca='" + getMarca() + "'" + ", matricula='" + getMatricula() + "'" + ", id='" + getId() + "'"
                + "}";
    }

}
