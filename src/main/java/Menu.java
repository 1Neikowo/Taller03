import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
public class Menu {
    Empresa empresa= new Empresa("Empresa1", "Direccion1");
    public void menuPrincipal(){
        while (true) {
            mostrarMenuPrincipal();

            int opcion = validarInt();
            procesarOpcion(opcion);

        }
    }
    public void mostrarMenuPrincipal(){
        System.out.println("Bienvenido al sistema de gestión de empresa transportista");
        System.out.println("1. Agregar sucursal");
        System.out.println("2. Eliminar sucursal");
        System.out.println("3. Agregar camión");
        System.out.println("4. Eliminar camión");
        System.out.println("5. Modificar estado de camión");
        System.out.println("6. Agregar productos a un pack");
        System.out.println("7. Eliminar productos a un pack");
        System.out.println("8. Calcular valor total de un flete");
        System.out.println("9. Salir");
    }
    public void procesarOpcion(int opcion) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una opción");
        switch (opcion) {
            case 1:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingrese el código de la sucursal");
                int codigoSucursal = validarInt();
                System.out.println("Ingrese la región de la sucursal");
                String regionSucursal = scanner.nextLine();
                Sucursal sucursal = new Sucursal(codigoSucursal, regionSucursal);
                empresa.agregarSucursal(sucursal);
                break;
            case 2:
                Scanner scanner2 = new Scanner(System.in);
                int codigo_sucursal = validarInt();
                empresa.eliminarSucursal(codigo_sucursal);
            case 3:
                System.out.println("Ingrese el codigo de la sucursal a la que desea agregar el camión");
                int codigo = validarInt();
                ArrayList<Sucursal> sucursales = empresa.getSucursales();
                Sucursal sucursal1 = empresa.getSucursal(codigo);
                for (Sucursal s : sucursales) {
                    if (sucursal1.getCodigo() == codigo) {
                        Scanner scanner3 = new Scanner(System.in);

                        System.out.println("Ingrese la patente del camión");
                        String patenteCamion = scanner3.nextLine();
                        System.out.println("Ingrese la descripcion del camión");
                        String descripcionCamion = scanner3.nextLine();
                        System.out.println("Ingrese el estado del camión");
                        boolean estadoCamion = validarBoolean();
                        Camion camion = new Camion(patenteCamion, descripcionCamion, estadoCamion);
                        sucursal1.agregarCamion(camion);
                        break;
                    } else {
                        System.out.println("Sucursal no hallada");
                        break;
                    }
                }
            case 4:
                System.out.println("Ingrese el codigo de la sucursal a la que desea eliminar el camión");
                int codigoSucursal2 = validarInt();
                ArrayList<Sucursal> sucursales2 = empresa.getSucursales();
                Sucursal sucursal2 = empresa.getSucursal(codigoSucursal2);
                for (Sucursal s : sucursales2) {
                    if (sucursal2.getCodigo() == codigoSucursal2) {
                        System.out.println("Ingrese el codigo del camión que desea eliminar");
                        int codigoCamion = validarInt();
                        sucursal2.eliminarCamion(codigoCamion);
                        break;
                    } else {
                        System.out.println("Sucursal no hallada");
                        break;
                    }
                }
            case 5:
                System.out.println("Ingrese el codigo de la sucursal a la que desea modificar el estado del camión");
                int codigoSucursal3 = validarInt();
                ArrayList<Sucursal> sucursales3 = empresa.getSucursales();
                Sucursal sucursal3 = empresa.getSucursal(codigoSucursal3);
                for (Sucursal s : sucursales3) {
                    if (sucursal3.getCodigo() == codigoSucursal3) {
                        System.out.println("Ingrese el codigo del camión que desea modificar");
                        int codigoCamion2 = validarInt();
                        System.out.println("Ingrese el nuevo estado del camión");
                        boolean estadoCamion2 = validarBoolean();
                        sucursal3.modificarEstado(codigoCamion2, estadoCamion2);
                        break;
                    } else {
                        System.out.println("Sucursal no hallada");
                        break;
                    }
                }
            case 7:
                System.out.println("Ingrese el codigo de la sucursal a la que desea agregar el pack");
                int codigoSucursal4 = validarInt();
                ArrayList<Sucursal> sucursales4 = empresa.getSucursales();
                Sucursal sucursal4 = empresa.getSucursal(codigoSucursal4);
                for (Sucursal s : sucursales4) {
                    if (sucursal4.getCodigo() == codigoSucursal4) {
                        System.out.println("Ingrese el codigo del camión que desea agregar el pack");
                        int codigoCamion3 = validarInt();
                        ArrayList<Camion> camiones = sucursal4.getCamiones();
                        Camion camion3 = sucursal4.getCamion(codigoCamion3);
                        for (Camion c : camiones) {
                            if (camion3.getCodigo() == codigoCamion3) {
                                System.out.println("Ingrese el codigo del pack que desea agregar");
                                int codigoPack = validarInt();
                                ArrayList<Pack> packs = camion3.getPacks();
                                Pack pack = camion3.getPack(codigoPack);
                                for (Pack p : packs) {
                                    if (pack.getCodigo() == codigoPack) {
                                        System.out.println("Ingrese el codigo del producto que desea eliminar");
                                        int codigoProducto = validarInt();
                                        ArrayList<Producto> productos = pack.getProductos();
                                        Producto producto = pack.getProducto(codigoProducto);
                                        for (Producto pr : productos) {
                                            if (producto.getCodigo() == codigoProducto) {
                                                pack.eliminarProducto(codigoProducto);
                                                break;
                                            } else {
                                                System.out.println("Producto no hallado");
                                                break;
                                            }
                                        }
                                        break;
                                    } else {
                                        System.out.println("Pack no hallado");
                                        break;
                                    }
                                }
                                break;
                            } else {
                                System.out.println("Camión no hallado");
                                break;
                            }
                        }
                        break;

                    }
                }
            case 6:
                System.out.println("Ingrese el codigo de la sucursal a la que desea agregar el pack");
                int codigoSucursal5 = validarInt();
                ArrayList<Sucursal> sucursales5 = empresa.getSucursales();
                Sucursal sucursal5 = empresa.getSucursal(codigoSucursal5);
                for (Sucursal s : sucursales5) {
                    if (sucursal5.getCodigo() == codigoSucursal5) {
                        System.out.println("Ingrese el codigo del camión que desea agregar el pack");
                        int codigoCamion3 = validarInt();
                        ArrayList<Camion> camiones = sucursal5.getCamiones();
                        Camion camion3 = sucursal4.getCamion(codigoCamion3);
                        for (Camion c : camiones) {
                            if (camion3.getCodigo() == codigoCamion3) {
                                System.out.println("Ingrese el codigo del pack que desea agregar");
                                int codigoPack = validarInt();
                                ArrayList<Pack> packs = camion3.getPacks();
                                Pack pack = camion3.getPack(codigoPack);
                                for (Pack p : packs) {
                                    if (pack.getCodigo() == codigoPack) {
                                        System.out.println("Ingrese el codigo del producto que desea agregar");
                                        int codigoProducto = validarInt();
                                        ArrayList<Producto> productos = pack.getProductos();
                                        Producto producto = pack.getProducto(codigoProducto);
                                        for (Producto pr : productos) {
                                            if (producto.getCodigo() == codigoProducto) {
                                                System.out.println("Ingrese el nombre del producto");
                                                String nombreProducto = scanner.nextLine();
                                                System.out.println("Ingrese el valor del producto");
                                                int valorProducto = validarInt();
                                                Producto producto1 = new Producto(codigoProducto, nombreProducto, valorProducto);
                                                pack.agregarProducto(producto1);
                                                break;
                                            } else {
                                                System.out.println("Producto no hallado");
                                                break;
                                            }
                                        }
                                        break;
                                    } else {
                                        System.out.println("Pack no hallado");
                                        break;
                                    }
                                }
                                break;
                            } else {
                                System.out.println("Camión no hallado");
                                break;
                            }
                        }
                        break;

                    }
                }
            case 8:
                Calculadora calc= new Calculadora();




        }
    }
                public boolean validarBoolean () {
                Scanner scanner = new Scanner(System.in);
                try {
                    return scanner.nextBoolean();
                } catch (InputMismatchException e) {
                    System.out.println("Ingrese un booleano válido");
                    return validarBoolean();
                }

            }

            public int validarInt () {
                Scanner scanner = new Scanner(System.in);
                try {
                    return scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Ingrese un número válido");
                    return validarInt();
                }

            }

        }

