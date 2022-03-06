public class Docente {
        private int horasClase;
        private String nombre;
        private String apellidos;

        public Docente(){

        }

        public Docente(int horasClase, String nombre, String apellidos) {
            this.horasClase = horasClase;
            this.nombre = nombre;
            this.apellidos = apellidos;
        }

        public int getHorasClase() {
            return horasClase;
        }

        public void setHorasClase(int horasClase) {
            this.horasClase = horasClase;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellidos() {
            return apellidos;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

    }
