# Validador de vacunas contra covid-19
## Manual de Usuario

Bienvenido, aca se presentará el uso apropiado del sistema desarrollado para la gestion de los datos almacenados sobre los registros de las personas vacunadas contra el Covid-19.

**Interfaz Principal**
![Pantalla principal](./ImagenesUsuario/PantallaPrincipa2l.png)

En el apartado de configuraciones usted podrá cargar tanto registros normales como registros personalizados a las estructuras de datos, tanto **Arboles Binarios ABB** y **Arboles Binarios AVL**
<div style="text-align: center;">
  <img src="./ImagenesUsuario/ConfiguracionesPrincipal.png" alt="Configuraciones" />
</div>


Dentro de cualquiera de este apartado le permitira seleccionar el archivo y cargarlo:
<div style="text-align: center;">
  <img src="./ImagenesUsuario/Select.png" alt="Cargar Archivo" />
</div>

Luego podra indicar si desea cargar todos los registros del archivo .txt
<div style="text-align: center;">
  <img src="./ImagenesUsuario/Todo.png" alt="Cargar todo" />
</div>

Si no desea cargar todo, debera indicar cuantos registros desea cargar:
<div style="text-align: center;">
  <img src="./ImagenesUsuario/Cantidad.png" alt="Cantidad de registros" />
</div>

### Y los registros se cargaran satisfactoriamente a ambos arboles **Arbol ABB y Arbol AVL**

### Arbol Binario ABB
<details>
  <summary>Indicaciones sobre el uso del arbol ABB</summary>

  ### Aca Podra Cargar los datos al ABB
  Para ingresar al ABB necesitara precionar el boton **Arbol Binario B**:
<div style="text-align: center;">
  <img src="./ImagenesUsuario/ABB.png" alt="Boton ABB" />
</div>

Luego se mostrara esta ventana:
<div style="text-align: center;">
  <img src="./ImagenesUsuario/PrincipalABB.png" alt="Pantalla principal ABB" />
</div>

Donde en la parte superior se tendra diferentes opciones entre las cuales son **Inicio**, **Configuraciones**, **Encriptado** y **Compresion**.

El apartado **Inicio** lo que realizar es regresar a la pagina principal:
<div style="text-align: center;">
  <img src="./ImagenesUsuario/InicioABB.png" alt="Volver a ventana inicial" />
</div>

El apartado **Configuraciones** permitira **Guardar el arbol**, **Cargar archivo** y **Cargar Archivo personalizado**, la carga de archivos funciona identico al de la pantalla principal:
<div style="text-align: center;">
  <img src="./ImagenesUsuario/ConfiguracionesABB.png" alt="Configuraciones ABB" />
</div>

En el apartado de **Encripcion** nos mostrara la opcion de **Encriptar** y **Desencriptar** donde solo pedira confirmar y automaticamente encriptara o desencriptara los datos del arbol ABB:
<div style="text-align: center;">
  <img src="./ImagenesUsuario/EncriptarABB.png" alt="Encriptar ABB" />
</div>

Por ultimo en el apartado de **Comprension** se mostraran los apartado de **Comprimir en txt** que guardara el arbol comprimido en un txt y **Descomprimir txt** que permitira cargar registros comprimidos y los descomprimirá para ingresarlos al arbol ABB:
<div style="text-align: center;">
  <img src="./ImagenesUsuario/ComprimirABB.png" alt="Comprimir ABB" />
</div>

Luego en el apartado de opciones de Arbol Binario ABB tenemos **Buscar Registro**, **Imprimir todos los registros** e **Imprimir Grafica**
<div style="text-align: center;">
  <img src="./ImagenesUsuario/OpcionesABB.png" alt="Descripción de la imagen" />
</div>

<br/>

En el apartado de **Buscar Registro** se nos muestra:
<div style="text-align: center;">
  <img src="./ImagenesUsuario/BuscarDPIABB.png" alt="Pantalla principal de buscar" />
</div>

<br/>

Ahi se podrá colocar el DPI a buscar, si se encuentra desplegará unos apartados con la información de la persona y mostrará el tiempo de busqueda arriba a la derecha, pero si no se encuentra mostrará un mensaje de no encontrado:
<div style="text-align: center;">
  <img src="./ImagenesUsuario/ResultadoABB.png" alt="Resultado de busqueda" />
</div>

<br/>

Luego de eso usted podrá modificar cada uno de los campos presentes, y para guardarlos unicamente tiene que dar click en el boton **Guardar Info.** y los datos se guardarán correctamente. 
<div style="text-align: center;">
  <img src="./ImagenesUsuario/GuardarABB.png" alt="Guardar Edicion" />
</div>
<br/>

Pero si desea eliminar el registro, debe de presionar el boton **Eliminar Registro**.
<div style="text-align: center;">
  <img src="./ImagenesUsuario/EliminarABB.png" alt="Eliminar Registro" />
</div>
<br/>

Eso es todo del apartado de **Busqueda** en el apartado de la pantala principal del arbol binario ABB.

Luego se cuenta con el apartado de **Imprimir Registros**.
<div style="text-align: center;">
  <img src="./ImagenesUsuario/ImprimirABB.png" alt="Imprimir Registros" />
</div>
<br/>

Al precionar este apartado se desplegará esta nueva ventana:
<div style="text-align: center;">
  <img src="./ImagenesUsuario/PrincipalImprimirABB.png" alt="Ventana de impresion de registros ABB" />
</div>
<br/>

Donde podra recorrer los datos del arbol Binario ABB de las 3 diferentes formas **Pre-Orden**, **In-Orden** y **Post-Orden**.
<div style="text-align: center;">
  <img src="./ImagenesUsuario/RecorridosABB.png" alt="Recorridos ABB" />
</div>
<br/>

Eso es todo del apartado de **Imprimir Todos los Registros** del arbol Binario ABB, luego en la pantalla principal del arbol Binario ABB se cuenta con otro apartado llamado **Imprimir Grafica**
<div style="text-align: center;">
  <img src="./ImagenesUsuario/GraficaABB.png" alt="Imprimir grafica ABB" />
</div>
<br/>

Al precionar este boton, se mostrará otra ventana donde podra visualizar de forma gráfica el contenido del arbol binario ABB.
<div style="text-align: center;">
  <img src="./ImagenesUsuario/VerGraficaABB.png" alt="Grafica ABB" />
</div>
<br/>

Y por último, en la ventana principal del arbol Binario ABB se tiene un apartado para agregar un nuevo registro
<div style="text-align: center;">
  <img src="./ImagenesUsuario/AgregarABB.png" alt="Agregar Registro" />
</div>
<br/>

Al presionar este boton, se despliega un pequeño formulario donde se rellenarán los campos y se cargará al sistema, asegurate de rellenar el No. de DPI y la cantidad de Dosis para que no ocurra ningun problema:
<div style="text-align: center;">
  <img src="./ImagenesUsuario/RellenarAgregadoABB.png" alt="Formulario Agregar" />
</div>
<br/>

Luego puede cancelar y ocultar la ventana, o puede guardar el registro y recibirá un mensaje de confirmación:
<div style="text-align: center;">
  <img src="./ImagenesUsuario/RespAgregadoABB.png" alt="Confirmacion Agregado" />
</div>
<br/>

Y eso es todo en el apartado del Arbol Binario ABB.

</details>

### Arbol Binario AVL
<details>
  <summary>Indicaciones sobre el uso del Arbol Binario AVL</summary>

  ### Aca podra cargar los datos al Arbol Binario AVL
  
  ### Aca Podra Cargar los datos al AVL
  Para ingresar al AVL necesitara presionar el boton **Arbol AVL**:
<div style="text-align: center;">
  <img src="./ImagenesUsuario/ArbolAVL.png" alt="Boton AVL" />
</div>

Luego se mostrara esta ventana:
<div style="text-align: center;">
  <img src="./ImagenesUsuario/PantallaAVL .png" alt="Pantalla principal AVL" />
</div>

Donde en la parte superior se tendra diferentes opciones entre las cuales son **Inicio**, **Configuraciones**, **Encriptado** y **Compresion**.

El apartado **Inicio** lo que realizar es regresar a la pagina principal:
<div style="text-align: center;">
  <img src="./ImagenesUsuario/InicioAVL.png" alt="Volver a ventana inicial" />
</div>

El apartado **Configuraciones** permitira **Guardar el arbol**, **Cargar archivo** y **Cargar Archivo personalizado**, la carga de archivos funciona identico al de la pantalla principal:
<div style="text-align: center;">
  <img src="./ImagenesUsuario/ConfiguracionesAVL.png" alt="Configuraciones AVL" />
</div>

En el apartado de **Encripcion** nos mostrara la opcion de **Encriptar** y **Desencriptar** donde solo pedira confirmar y automaticamente encriptara o desencriptara los datos del arbol AVL:
<div style="text-align: center;">
  <img src="./ImagenesUsuario/EncriptadoAVL.png" alt="Encriptar AVL" />
</div>

Por ultimo en el apartado de **Comprension** se mostraran los apartado de **Comprimir en txt** que guardara el arbol comprimido en un txt y **Descomprimir txt** que permitira cargar registros comprimidos y los descomprimirá para ingresarlos al arbol AVL:
<div style="text-align: center;">
  <img src="./ImagenesUsuario/CompresionAVL.png" alt="Comprimir AVL" />
</div>

Luego en el apartado de opciones de Arbol Binario ABB tenemos **Buscar Registro**, **Imprimir todos los registros** e **Imprimir Grafica**
<div style="text-align: center;">
  <img src="./ImagenesUsuario/OpcionesAVL.png" alt="Opciones AVL" />
</div>

<br/>

En el apartado de **Buscar Registro** se nos muestra:
<div style="text-align: center;">
  <img src="./ImagenesUsuario/PantallaBuscarAVL.png" alt="Pantalla principal de buscar" />
</div>

<br/>

Ahi se podrá colocar el DPI a buscar, si se encuentra desplegará unos apartados con la información de la persona y mostrará el tiempo de busqueda arriba a la derecha, pero si no se encuentra mostrará un mensaje de no encontrado:
<div style="text-align: center;">
  <img src="./ImagenesUsuario/BuscarDPIAVL.png" alt="Resultado de busqueda" />
</div>

<br/>

Luego de eso usted podrá modificar cada uno de los campos presentes, y para guardarlos unicamente tiene que dar click en el boton **Guardar Info.** y los datos se guardarán correctamente. 
<div style="text-align: center;">
  <img src="./ImagenesUsuario/GuardarEditAVL.png" alt="Guardar Edicion" />
</div>
<br/>

Pero si desea eliminar el registro, debe de presionar el boton **Eliminar Registro**.
<div style="text-align: center;">
  <img src="./ImagenesUsuario/EliminarBuscadoAVL.png" alt="Eliminar Registro" />
</div>
<br/>

Eso es todo del apartado de **Busqueda**, en el apartado de la pantala principal del arbol binario AVL.

Luego se cuenta con el apartado de **Imprimir Registros**.
<div style="text-align: center;">
  <img src="./ImagenesUsuario/ImprimirAVL.png" alt="Imprimir Registros" />
</div>
<br/>

Al precionar este apartado se desplegará esta nueva ventana:
<div style="text-align: center;">
  <img src="./ImagenesUsuario/PantallaImprimirAVL.png" alt="Ventana de impresion de registros AVL" />
</div>
<br/>

Donde podra recorrer los datos del arbol Binario AVL de las 3 diferentes formas **Pre-Orden**, **In-Orden** y **Post-Orden**.
<div style="text-align: center;">
  <img src="./ImagenesUsuario/OrdenesAVL.png" alt="Recorridos AVL" />
</div>
<br/>

Eso es todo del apartado de **Imprimir Todos los Registros** del arbol Binario AVL, luego en la pantalla principal del arbol Binario AVL se cuenta con otro apartado llamado **Imprimir Grafica**
<div style="text-align: center;">
  <img src="./ImagenesUsuario/ImprimirGraficaAVL.png" alt="Imprimir grafica AVL" />
</div>
<br/>

Al precionar este boton, se mostrará otra ventana donde podra visualizar de forma gráfica el contenido del arbol binario AVL.
<div style="text-align: center;">
  <img src="./ImagenesUsuario/GraficaAVL.png" alt="Grafica AVL" />
</div>
<br/>

Y por último, en la ventana principal del arbol Binario AVL se tiene un apartado para agregar un nuevo registro
<div style="text-align: center;">
  <img src="./ImagenesUsuario/AgregarAVL.png" alt="Agregar Registro" />
</div>
<br/>

Al presionar este boton, se despliega un pequeño formulario donde se rellenarán los campos y se cargará al sistema, asegurate de rellenar el No. de DPI y la cantidad de Dosis para que no ocurra ningun problema:
<div style="text-align: center;">
  <img src="./ImagenesUsuario/FormularioAgregarAVL.png" alt="Formulario Agregar" />
</div>
<br/>

Luego puede cancelar y ocultar la ventana, o puede guardar el registro y recibirá un mensaje de confirmación:
<div style="text-align: center;">
  <img src="./ImagenesUsuario/ConfirmacionAVL.png" alt="Confirmacion Agregado" />
</div>
<br/>

Y eso es todo en el apartado del Arbol Binario ABB.

</details>

# Muchas Gracias por Preferir este programa