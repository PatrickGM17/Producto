package Producto;

public class ProductoControlador {
    private Producto producto[];

    private int contador;

    public ProductoControlador(int size) {
        this.producto = new Producto[size];
        this.contador = 0;
    }

    public void agregar(int codPro, String nombre, double precio){

        this.producto[contador] = new Producto(codPro, nombre, precio);
        this.contador++;
    }

    public Producto buscar(String nombre)
    {
        Producto var=null;
        for( Producto p: producto)
        {
            if(p.getNombre() == nombre)
            {   var=p;
                break;
            }
        }
        return var;
    }
    // Buscar
    public Producto buscarCod(int codPro)
    {
        Producto var=null;
        for( Producto p: producto)
        {
            if(p.getCodPro() == codPro)
            {   var=p;
                break;
            }
        }
        return var;
    }

    //Listar
    public void ListaProd()
    {
        for( Producto p: producto)
        {
            System.out.println("Codigo: "+p.getCodPro());
            System.out.println("Nombre: "+p.getNombre());
            System.out.println("Precio: "+p.getPrecio());

        }
    }

}
