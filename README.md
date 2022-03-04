# RMI Programa

Para poder ejecutar este programa nos ubicamos en la carpeta donde se encuentra el paquete

## Terminal 1
Se compila la solución y si se codifica de forma correcta, se generan archivos .class de cada archivo .java
```console
your@terminal:~$ cd A3-rmi/E2
your@terminal:~$ javac *.java
```

Se genera el stub con rmic
```console
your@terminal:~$ set CLASSPATH=A3-rmi/E2
your@terminal:~$ rmic ObjetoRemoto
```

Se lanza el servicio con rmiregistr
```console
your@terminal:~$ set CLASSPATH=
your@terminal:~$ rmiregistry
```

## Terminal 2
Se inicia el servidor
```console
your@terminal:~$ cd A3-rmi/E2
your@terminal:~$ java Servidor
```

## Terminal 3
Se inicia el cliente
```console
your@terminal:~$ cd A3-rmi/E2
your@terminal:~$ java Cliente
```
