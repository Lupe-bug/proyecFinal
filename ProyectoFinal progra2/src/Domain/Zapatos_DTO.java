package Domain;

public class Zapatos_DTO {

    private Long id = null;
    private String descripcion;
    private String color;
    private int talla;
    private float precio;
    //queda pendiente obtener imagen de la tabla

    public Zapatos_DTO(String descripcion, String color, int talla, float precio) {
        this.descripcion = descripcion;
        this.color = color;
        this.talla = talla;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
