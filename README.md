# SS2
trabaho 2 de Segurança de Software

Antes de correr sacar [isto](https://github.com/pefido/SS/raw/master/WebContent/WEB-INF/lib/sqlite-jdbc-3.8.11.2.jar) e por na root

Compilar

```bash
javac -cp ".:sqlite-jdbc-3.8.11.2.jar" HMS/HMS.java
```

Correr

```bash
java -cp ".:sqlite-jdbc-3.8.11.2.jar" HMS.HMS
```

Para gerar as signatures do java.sql

```bash
~/.jif-3.4.3/bin/jifc -d jif-classes -addsigcp sig-classes/ Connection.jif Driver.jif DriverManager.jif PreparedStatement.jif ResultSet.jif Statement.jif

```
