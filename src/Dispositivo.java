public class Dispositivo {
    private int id;
    private String nombre;
    private boolean activo;
    private static int contadorDispositivos = 0;
    public Dispositivo (int id,String nombre){
        if (id <= 0) {
            throw new IllegalArgumentException("Invalido");
        }
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("invalido");
        }
        this.id=id;
        this.nombre=nombre.trim();
        this.activo = true;
        contadorDispositivos++;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()){
            this.nombre = nombre.trim();
        }
    }

    public boolean isActivo() {
        return activo;
    }
    public static int getContadorDispositivos(){
        return contadorDispositivos;
    }
    public boolean desactivar(){
        if(this.activo){
            this.activo=false;
            return true;
        }
        return false;
    }
    public String obtenerResumen(){
        String esatdoAnctual = this.activo ? "Activo " : "Inactivo";
        return this.id + "|" + this.nombre + "|"+ esatdoAnctual;
    }
}
