package Encapsulation;

public class employe_encapl {

    private  int a;   // This is called Data hiding
    public void setA(int B)
    {
        a=B;
    }
    public int getA()
    {
        return a;
    }
        public static void main(String[] args) {
            employe_encapl em = new employe_encapl();
            em.setA(100);
            System.out.println(em.getA());
        }

}
