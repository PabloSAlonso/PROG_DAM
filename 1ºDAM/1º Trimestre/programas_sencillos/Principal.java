public class Principal {
    public static void main(String[] args) {
        Perro perro = new Perro("Terminator", "Can palleiro", 5, 36);
        // perro.raza = "Can Palleiro";
        // perro.nombre = "Terminator";
        // perro.setEdad(5);
        // perro.setTemperatura(36);
        System.out.printf("Tengo un %s llamado %s de %d años\n",
                perro.raza, perro.nombre,
                perro.getEdad());
        perro.ladrar('f');
        System.out.println(perro.definicion);
        Perro.definicion = "Ser amigable pluricelular";
        System.out.println(perro.definicion);
        Comida pienso = new Comida("pienso", 50.25);
        System.out.printf("%s %.2f Euros\n", pienso.nombre, pienso.precio);
        perro.regurgitar(pienso);
        System.out.printf("%s %.2f Euros\n", pienso.nombre, pienso.precio);

    }
}
