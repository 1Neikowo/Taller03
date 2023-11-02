import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
public class Menu {
    Scanner scanner= new Scanner(System.in);
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
        System.out.println("Ingrese una opción");
        switch (opcion) {
            case 1:
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

                }break;
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
                }break;
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
                }break;
            case 7:
                System.out.println("Ingrese el codigo de la sucursal a la que desea agregar el pack");
                int codigoSucursal5 = validarInt();
                ArrayList<Sucursal> sucursales5 = empresa.getSucursales();
                Sucursal sucursal5 = empresa.getSucursal(codigoSucursal5);
                for (Sucursal s : sucursales5) {
                    if (sucursal5.getCodigo() == codigoSucursal5) {
                        System.out.println("Ingrese el codigo del camión que desea agregar el pack");
                        int codigoCamion3 = validarInt();
                        ArrayList<Camion> camiones = sucursal5.getCamiones();
                        Camion camion3 = sucursal5.getCamion(codigoCamion3);
                        for (Camion c : camiones) {
                            if (camion3.getCodigo() == codigoCamion3) {
                                System.out.println("Ingrese el codigo del flete ");
                                int codigoFlete = validarInt();
                                ArrayList<Flete> fletes = camion3.getFletes();
                                Flete flete2 = camion3.getFlete(codigoFlete);
                                for (Flete flete : fletes) {
                                    if (flete2.getCodigo() == codigoFlete) {
                                        System.out.println("Ingrese el codigo del pack que desea agregar");
                                        int codigoPack = validarInt();
                                        ArrayList<Pack> packs = flete.getPacks();
                                        Pack pack = flete.getPack(codigoPack);
                                        for (Pack pa : packs) {
                                            if (pack.getCodigo() == codigoPack) {

                                                System.out.println("Ingrese el codigo del producto que desea eliminar");
                                                int codigoProducto = validarInt();
                                                packs.remove(codigoProducto);

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
                }break;
            case 6:
                System.out.println("Ingrese el codigo de la sucursal a la que desea agregar el pack");
                int codigoSucursal6 = validarInt();
                ArrayList<Sucursal> sucursales6 = empresa.getSucursales();
                Sucursal sucursal6 = empresa.getSucursal(codigoSucursal6);
                for (Sucursal s : sucursales6) {
                    if (sucursal6.getCodigo() == codigoSucursal6) {
                        System.out.println("Ingrese el codigo del camión que desea agregar el pack");
                        int codigoCamion3 = validarInt();
                        ArrayList<Camion> camiones = sucursal6.getCamiones();
                        Camion camion3 = sucursal6.getCamion(codigoCamion3);
                        for (Camion c : camiones) {
                            if (camion3.getCodigo() == codigoCamion3) {
                                System.out.println("Ingrese el codigo del flete ");
                                int codigoFlete = validarInt();
                                ArrayList<Flete> fletes = camion3.getFletes();
                                Flete flete = camion3.getFlete(codigoFlete);
                                for (Flete flete1 : fletes) {
                                    if (flete1.getCodigo() == codigoFlete) {
                                        System.out.println("Ingrese el codigo del pack que desea agregar");
                                        int codigoPack = validarInt();
                                        ArrayList<Pack> packs = flete.getPacks();
                                        Pack pack = flete.getPack(codigoPack);
                                        for (Pack pa : packs) {
                                            if (pa.getCodigo() == codigoPack) {

                                                System.out.println("Ingrese el tipo del producto que desea agregar");
                                                String tipoProducto = this.scanner.nextLine();
                                                Producto producto1 = new Producto(tipoProducto);
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
                }break;
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

