public class uno{
    public static void main(String[] args) {
        int uno;
        uno=12;
        class Clase{
            private String nombre;
            public void setNombre(String nombre) {
                this.nombre = nombre;
            }
            public String getNombre() {
                return nombre;
            }
        }
        Clase c1 = new Clase();
        c1.setNombre("uno");
        Clase c2=c1;
        System.out.println(c2.getNombre());
        c1.setNombre("dos");
        System.out.println(c1.getNombre());
        System.out.println(c2.getNombre());
        

       /*  System.out.println("funciona");
        System.out.println("entero  :"+uno);*/
    }
}