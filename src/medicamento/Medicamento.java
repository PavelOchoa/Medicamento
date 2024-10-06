package medicamento;

public class Medicamento {
    // Atributos de la clase Medicamento
    private String nombre;
    private String fabricante;
    private String viaAdministracion;
    
    // Constructor de la clase Medicamento
    public Medicamento(String nombre, String fabricante, String viaAdministracion) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.viaAdministracion = viaAdministracion;
    }
    
    // Clase interna que representa la posología del medicamento
    public class Posologia {
        private String usuarios;
        private int dosisMg;
        private String periodoTiempo;
        private String recomendaciones;
        
        // Constructor de la clase Posologia
        public Posologia(String usuarios, int dosisMg, String periodoTiempo, String recomendaciones) {
            this.usuarios = usuarios;
            this.dosisMg = dosisMg;
            this.periodoTiempo = periodoTiempo;
            this.recomendaciones = recomendaciones;
        }
        
        // Método para mostrar la posología
        public void mostrarPosologia() {
            System.out.println("Posología del medicamento:");
            System.out.println("Usuarios: " + usuarios);
            System.out.println("Dosis: " + dosisMg + " mg");
            System.out.println("Periodo de tiempo: " + periodoTiempo);
            System.out.println("Recomendaciones: " + recomendaciones);
        }
    }
    
    // Método para mostrar la información del medicamento
    public void mostrarMedicamento() {
        System.out.println("Información del medicamento:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Vía de administración: " + viaAdministracion);
    }
    
    // Método main para ejecutar el programa
    public static void main(String[] args) {
        // Crear una instancia de Medicamento
        Medicamento medicamento = new Medicamento("Ibuprofeno", "Laboratorios XYZ", "Oral");
        
        // Crear una instancia de la clase interna Posologia
        Medicamento.Posologia posologia = medicamento.new Posologia("Adultos", 400, "Cada 8 horas", "Tomar con alimentos");
        
        // Mostrar la información del medicamento y su posología
        medicamento.mostrarMedicamento();
        posologia.mostrarPosologia();
    }
}