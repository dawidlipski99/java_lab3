
public class Punkt {


    private int pX, pY, pZ;
    Punkt(int pX){
        this.pX=pX;
    }
    Punkt(int pX, int pY, int pZ){
        this.pX = pX;
        this.pY = pY;
        this.pZ = pZ;
    }
    public int getpX() {
        return pX;
    }
    public int setpY(int i){
        return pY;
    }
    public int getpZ() {
        return pZ * 10;
    }
    public int suma(){
        return pZ + pY + pX;
    }
    public int roznica(){
        return pZ - pY - pX;
    }
    public int roznica ( int x,int y,int z){
        return pX*x-pY*y-pZ*z;

    }
    public void wynik(){
        System.out.println(suma()+" ;"+roznica()+" ;"+roznica());
    }

    @Override
    public String toString() {
        return "Punkt{" +
                "pX=" + pX +
                ", pY=" + pY +
                ", pZ=" + pZ +
                '}';
    }


}