public class CaminhaoMonstro extends Caminhao {
    public void m1() {
        System.out.println("monstro 1");
    }

    public void m2() {
        super.m1();
        super.m2();
    }

    public String toString() {
        return "monstro " + super.toString();
    }
}
