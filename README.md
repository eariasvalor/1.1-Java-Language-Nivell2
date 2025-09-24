# Nivell 2 - Exercici 1

📄 Descripció - Enunciat de l'exercici

Aquest projecte consisteix en la creació d’una jerarquia de classes i interfícies que simulen un Smartphone.

Enunciat:  
- Crea una classe anomenada `Telèfon` amb els atributs `marca` i `model`, i el mètode `trucar(String numero)`.  
  Aquest mètode ha de mostrar per consola: *"S’està trucant al número [numero]"*.  

- Crea una interfície anomenada `Camera` amb el mètode `fotografiar()`.  
  Aquest mètode ha de mostrar: *"S’està fent una foto"*.  

- Crea una interfície anomenada `Rellotge` amb el mètode `alarma()`.  
  Aquest mètode ha de mostrar: *"Està sonant l’alarma"*.  

- Crea una classe `Smartphone` que sigui subclasse de `Telèfon` i implementi les interfícies `Camera` i `Rellotge`.  

- Des del `main()` de l’aplicació (`N2Exercici1.java`), crea un objecte `Smartphone` i crida als mètodes `trucar()`, `fotografiar()` i `alarma()`.  

-----------------------------------

💻 Tecnologies Utilitzades

- Java SE 17 (o superior)
- IDE (IntelliJ IDEA, Eclipse o VS Code amb extensió Java)
- Terminal per a compilar i executar amb javac i java

-----------------------------------

📋 Requisits

- JDK 17 o superior instal·lat
- Variable d’entorn JAVA_HOME configurada
- Accés a terminal/command prompt
- Opcional: un IDE per facilitar l’execució

-----------------------------------

🛠️ Instal·lació

1. Clona aquest repositori:
   git clone <URL-del-repositori>
2. Accedeix al directori del projecte:
   cd n2exercici1
3. Comprova que tens Java instal·lat:
   java -version

-----------------------------------

▶️ Execució

1. Compila el projecte:
   javac *.java
2. Executa la classe principal:
   java N2Exercici1

-----------------------------------

🌐 Desplegament

Per desplegar el projecte en un entorn de producció o servidor:
1. Empaqueta el projecte en un .jar:
   jar cfe n2exercici1.jar N2Exercici1 *.class
2. Puja l’arxiu .jar al servidor.
3. Executa’l amb:
   java -jar n2exercici1.jar

-----------------------------------

🤝 Contribucions

Les contribucions són benvingudes! Si vols participar:
1. Fes un fork del repositori.
2. Crea una nova branca:
   git checkout -b feature/NovaFuncionalitat
3. Fes els teus canvis i commiteja’ls:
   git commit -m 'Afegeix Nova Funcionalitat'
4. Puja els canvis a la teva branca:
   git push origin feature/NovaFuncionalitat
5. Fes un pull request.

-----------------------------------
