principal: Pais.class Grafos.class Empresa.class Camioneta.class CamionCisterna.class Ciudad.class Edificios.class Casas.class
	javac Main.java
Pais.class: Pais.java
	javac Pais.java
Grafos.class: Grafos.java
	javac Grafos.java
Empresa.class: Empresa.java
	javac Empresa.java
Camioneta.class: Vehiculo.class
	javac Camioneta.java
CamionCisterna.class: Vehiculo.class
	javac CamionCisterna.java
Vehiculo.class: Vehiculo.java
	javac Vehiculo.java
Ciudad.class: Ciudad.java
	javac Ciudad.java
Edificios.class: Edificacion.class
	javac Edificios.java
Casas.class: Edificacion.class
	javac Casas.java
Edificacion.class: Edificacion.java
	javac Edificacion.java
clean:
	$(RM)	*.class
