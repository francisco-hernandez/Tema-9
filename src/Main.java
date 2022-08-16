class Persona {
    private int Edad;
    private String Nombre;
    private String Telefono;

    /*Set y Get de todas las variables*/
    public void setEdad(int Edad){
        this.Edad = Edad;
    }

    public int getEdad(){
        return(this.Edad);
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public String getNombre(){
        return (this.Nombre);
    }
    public void setTelefono(String Telefono){
        this.Telefono = Telefono;
    }
    public String getTelefono(){
        return (this.Telefono);
    }
}
    class Cliente extends Persona{
        private int Credito;

        public void SetCredito(int Credito){
            this.Credito = Credito;
        }
        public int getCredito(){
            return (this.Credito);
        }
    }
 class Trabajador extends Persona{
    int salario;
     public void SetSalario(int salario){
         this.salario = salario;
     }
     public int getSalario(){
         return (this.salario);
     }

}


public class Main {
    public static void main(String[] args) {
        Cliente cliente; //Declaramos una variable de la clase Cliente ;
        Trabajador trabajador;
        cliente = new Cliente(); //Instanciamos la clase Cliente;
        trabajador = new Trabajador();
        cliente.setEdad(20);
        cliente.setNombre("Francisco");
        cliente.setTelefono("6325585");
        cliente.SetCredito(1500);
        trabajador.SetSalario(1000);
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());
        System.out.println(trabajador.getSalario());
    }
}
