public class Main {
    public static void main(String[] args) {
        Personagem p1=new Pistoleiro();
        System.out.println("Pistoleiro Atirando!");
        p1.atacar();

        Personagem p2=new Sniper();
        System.out.println("Sniper Atirando!");
        p2.atacar();

    }
}
