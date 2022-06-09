package Producto;

public class MainProducto {
    public static void main(String[] args)
    {
        ProductoControlador productoControlador = new ProductoControlador(3);
        productoControlador.agregar(654890, "Polo Billabong", 37.00);
        productoControlador.agregar(827431, "Zapatillas Adidas", 200.00);
        productoControlador.agregar(657894, "Casacas Newport", 130.00);

        productoControlador.ListaProd();

        System.out.println("\n-----Buscar por Nombre-----");
        String buscarNom= "Pantalon";

        Producto encontrar;

        encontrar = productoControlador.buscar(buscarNom);

        if(encontrar!= null)
        {
            System.out.println("Producto encontrado:  "+ encontrar.getNombre());
        }
        else{
            System.out.println("No se encontro");
        }

        System.out.println("\n-----Buscar por codigo-----");
        int buscarCod= 827431;

        encontrar = productoControlador.buscarCod(buscarCod);

        if(encontrar!= null)
        {
            System.out.println("Codigo "+ encontrar.getCodPro() + " producto encontrado: "+encontrar.getNombre());
        }
        else{
            System.out.println("No se encontro");
        }


    }
}
