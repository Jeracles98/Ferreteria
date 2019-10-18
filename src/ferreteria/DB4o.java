package ferreteria;

import java.io.File;
import java.util.List;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;



import com.db4o.*;

public class DB4o {

	static String DBferreteria = "DBferreteria.db4o";
	static ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), DBferreteria);
	static Scanner teclado=new Scanner(System.in);
	
public static void main(String[] args) {
	int opcion=-1;
	do
	{
		System.out.println("Elige la opcion:");
		System.out.println("================");
		System.out.println(" 1.- Añadir Cliente");
		System.out.println(" 2.- Mostrar Clientes");
		System.out.println(" 3.- Modificar Cliente");
		System.out.println();
		System.out.println(" 4.- Añadir Artículo nuevo");
		System.out.println(" 5.- Mostrar Artículos");
		System.out.println(" 6.- Modificar Artículo");
		System.out.println(" 7.- Reponer Artículo");
		System.out.println();
		System.out.println(" 8.- Hacer Venta");
		System.out.println(" 9.- Anular Venta");
		System.out.println("10.- Mostrar todos los artículos de los que haya que pedir unidades al almacen por tener pocas unidades en la ferretería");
		System.out.println("11.- Mostrar los nombres de los artículos vendidos entre 2 fechas que se piden por teclado");
		System.out.println("12.- Localiza a todos los clientes que han hecho una compra en los tres últimos meses");
		System.out.println("13.- Muestra las localidades de los clientes y los nombres de los clientes que han realizado una factura por un importe superior a 50€");
		System.out.println();
		System.out.println("0.- Salir");
		System.out.println("Opcion= ??");
		opcion=teclado.nextInt();
		String basura = teclado.nextLine();

		switch (opcion) {
		case 0: System.out.println("HASTA LUEGO");break;
		case 1: anadirCliente(); break;
		case 2: mostrarClientes(); break;
		case 3: modificarCliente(); break;
		case 4: anadirArticulo(); break;
		case 5: mostrarArticulos(); break;
		case 6: modificarArticulo(); break;
		case 7: reponerArticulo(); break;
		case 8: hacerVenta(); break;
		case 9: anularVenta(); break;
		case 10: articulosAreponer(); break;
		case 11: ventasRealizadas(); break;
		case 12: ultimosClientes(); break;
		case 13: ventasMasde50(); break;
		
		default: ; break;

		} // fin switch
	} while (opcion!=0);// fin while

	db.close(); // cerrar base de datos


		
	
		} //final del MAIN()

private static void ventasMasde50() {
	// TODO Auto-generated method stub
	// Mostrará localidades de los clientes y los nombres de los clientes que han realizado una factura por un importe superior a 50€.
}

private static void ultimosClientes() {
	// TODO Auto-generated method stub
	// Mostrará los nombres de clientes que han comprado en los 3 últimos meses a partir de la fecha de hoy.
}

private static void ventasRealizadas() {
	// TODO Auto-generated method stub
	// Mostrará las ventas realizadas
}

private static void articulosAreponer() {
	// TODO Auto-generated method stub
	// Mostrará todos los artículos cuyo stock_actual es inferior al stock_minmo	
}

private static void anularVenta() {
	// TODO Auto-generated method stub
	// Pedirá un dni de cliente y una fecha_venta, mostrará esa venta si la hay y procederá a borrarla. Habrá que volver a sumar las unidades devueltas en el stock_actual
}

private static void hacerVenta() {
	// TODO Auto-generated method stub
	// A partir de la fecha de hoy, pide dni de cliente, pide artículo y nº unidades quese venden. Hay que descontar el numero de unidades del stock. 
}

private static void reponerArticulo() {
	// TODO Auto-generated method stub
	// Pedirá cod_articulo a reponer y unidades adquiridas. Hay que actualizar stock_actual
}

private static void modificarArticulo() {
	// TODO Auto-generated method stub
}

private static void mostrarArticulos() {
	// TODO Auto-generated method stub
	
}

private static void anadirArticulo() {
	// TODO Auto-generated method stub
	// No se podrá añadir a ningún articulo si el cod_articulo está repetido.
}

private static void modificarCliente() {
	// TODO Auto-generated method stub
	// Pedirá un dni y pedirá nuevos datos para ese cliente. 
}

private static void mostrarClientes() {
	// TODO Auto-generated method stub
	// Mostrará todos los clientes almacenados con todos sus datos.
}

private static void anadirCliente() {
	// TODO Auto-generated method stub
	// No se podrá añadir a ningún cliente si el dni está repetido.
}




} // final de la clase
