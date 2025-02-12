public class Principal {
    public static void intercambiaRadios(Pelota p, Pelota p2){
        double temporal;
        temporal = p.getRadio();
        p.setRadio(p2.getRadio());
        p2.setRadio(temporal);
    }
    public static void main(String[] args) {
        Pelota p = new Pelota();
        p.tipo = "baloncesto";
        p.setRadio(20);
        System.out.println("Tengo una pelota de " 
        + p.tipo + " de " + p.getRadio() + " cm de radio ");
        Pelota p2 = new Pelota();
        p2.tipo = "playa";
        p2.getRadio();
        System.out.println("Tengo otra pelota de " 
        + p2.tipo + " de " + p2.getRadio() + " cm de radio ");
        Pelota p3 = new Pelota("futbol", 22);
        System.out.println("Tengo otra pelota de "
        + p3.tipo + " de " + p3.getRadio() + " cm de radio ");
        p.inflar();
        p2.inflar(10);
        System.out.println("Tengo una nueva pelota de "
        + p.tipo + " de " + p.getRadio() + " cm de radio ");
        System.out.println("Tengo otra nueva pelota de "
        + p2.tipo + " de " + p2.getRadio() + " cm de radio ");
        intercambiaRadios(p, p2);
        System.out.println("Ahora tengo una nueva pelota de "
        + p.tipo + " de " + p.getRadio() + " cm de radio ");
        System.out.println("y otra nueva pelota de "
        + p2.tipo + " de " + p2.getRadio() + " cm de radio ");
    }
}