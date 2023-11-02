# Análisis clases y roles


# Integrantes: 
Gerson Urrea
Sebastián Martínez 
Joaquín Silva


# Clases halladas:

Main, Empresa, Sucursal, Camión, Flete, Producto, Pack, Menu.

Relaciones entre clases:

Empresa-Sucursal. Composición entre  sucursal y empresa. Empresa 1  <--> 1 … * Sucursal.

Sucursal-camion. Agregación entre sucursal y camión. Sucursal 1 <--> 1 … * Camion.

Camión-Flete. Agregación entre camión y fletes. Camión 1 <-> 0 … * Flete. 

Flete - Pack. Agregación entre fletes y pack. Flete 1 <->  1 ... 5 Pack.

Pack - Productos. Composición entre Pack y Productos. Pack 1<-> 0 … 20 Productos.



# Roles de los integrantes


Gerson Urrea: Redacción clase Empresa y sucursal. 
Sebastian Martinez: Redacción codigo, (Clases Producto y Pack)
Joaquín Silva: Redacción código Clases Camión y Flete.
