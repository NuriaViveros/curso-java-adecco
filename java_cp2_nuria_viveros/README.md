# Enunciado 2: BankAccount
## Nombre del proyecto: java_cp2_nuria_viveros 
README: En fase de construción.
No está terminado pero en mi repository está todo
lo que he hecho hasta ahora.
Colaborador: Alan Sastre Fecha de entrega: 
ideal 10/02/2023.

## Creación de clases y objetos:
## Clases OBLIGATORIAS:

### * Clase principal BankAccount:
* Identificador (numérico)
* Saldo (numérico)
* Tipo (enum): ahorro, inversiones, empresa
* Coste (numérico)
* Interés/recompensa (numérico)
* Customer (Otra clase obligatoria)
* Lista de monedas soportadas: EUR, USD, FOR, HUG, CZK, YEN (Set o List de String)
* Fecha de creación
### * Clase Customer:
* id
* nif
* name

### * Clases OPCIONALES:

* Clase Banco (asociado a BankAccount)
* Clase Address (asociado a Customer)
* Clase Préstamo: bankAccount, Empleado, cantidad, interés, fecha expiración
* Clase Empleado
* Interfaz e implementación para cada clase
* Creación de interfaz
* Crear una interfaz para las operaciones de cuenta bancaria:

### Funcionalidades: 

* Buscar todas las cuentas bancarias
* Buscar una cuenta bancaria por su id
* Buscar una cuenta bancaria por el nif de su usuario/cliente
* Buscar todas las cuentas bancarias por el tipo de cuenta. 
  Ejemplo: buscar cuentas de tipo ahorro devuelve una lista con las cuentas de ahorro.
* Buscar por moneda soportada
* Agrupar por tipo de cuenta: devuelve un mapa cuyas claves son los tipos de cuenta y cuyos valores son listas de cuentas de esos tipos. Aquí se devuelve un mapa con todos los tipos de cuenta pero agrupados.
* Crear nueva cuenta bancaria
* Incrementar saldo
* Hacer retiro / Disminuir saldo
* Actualizar cuenta bancaria
* Borrar cuenta bancaria
* Traspasar saldo de una cuenta a otra
* Crear implementación de la interfaz que implemente todas las operaciones

### Consola:

Mostrar un menú por consola con todas las opciones de la interfaz
El usuario puede elegir una opción
Leer de consola los datos necesarios para ejecutar la operación que haya elegido
Recomendable:
Intentar gestionar las posibles excepciones y repetir las lecturas en caso de que el usuario introduzca mal los datos. Se puede crear algo parecido a la clase ScannerReader vista en el curso.

# Documentación:

Ejemplos de números de cuenta

Banco | IBAN | Entidad | Oficina | Digito Control |	Cuenta
---|---|------|---|---|---|
CAIXABANK | ES6621000418401234567891 | 1210 | 0418 | 40	| 1234567891
BANCO SANTANDER | ES6000491500051234567892 | 0049 | 1500 | 05 | 1234567892
ABANCA CORPORACION BANCARIA | ES9420805801101234567891 | 2080 | 5801 | 10 | 1234567891
BANCO DE CREDITO BALEAR | ES9000246912501234567891 | 0024 | 6912 | 50 | 1234567891
BANCO ESPAÑOL DE CREDITO | ES7100302053091234567895 | 0030 | 2053 | 09 | 1234567895
BANCO SANTANDER | ES1000492352082414205416 | 0049 | 2352 | 08 | 2414205416
IBERCAJA BANCO | ES1720852066623456789011 | 2085 | 2066 | 62 | 3456789011

# Códigos de las entidades bancarias
2080 Abanca Corporación Bancaria

0061 Banca March

0188 Banco Alcalá

0182 Banco Bilbao Vizcaya Argentaria

0130 Banco Caixa Geral

0234 Banco Caminos

2105 Banco Castilla-La Mancha

0240 Banco de Crédito Social Cooperativo

0081 Banco de Sabadell

0487 Banco Mare Nostrum
