package Domain;

public class Ropa_DTO {

    private Long id = null;
    private String Nombre;
    private float precio;
    private int existencia;
    private int porcentajeOferta;
    //queda pendiente obtener imagen de la tabla

    public Ropa_DTO(String Nombre, float precio, int existencia, int porcentajeOferta) {
        this.Nombre = Nombre;
        this.precio = precio;
        this.existencia = existencia;
        this.porcentajeOferta = porcentajeOferta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public int getPorcentajeOferta() {
        return porcentajeOferta;
    }

    public void setPorcentajeOferta(int porcentajeOferta) {
        this.porcentajeOferta = porcentajeOferta;
    }
}
