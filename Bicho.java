import java.util.Scanner;
public class Bicho{
    public static Bicho[][] bichos=new Bicho[2][2];
    private String tipo;
    private int salud;
    public Bicho(){}
    public Bicho(String t,int s){
        setTipo(t);
        setSalud(s);
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo=t;
    }
    public int getSalud(){
        return this.salud;
    }
    public void setSalud(int s){
        this.salud=s;
    }
    public static void dispararBala(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número de fila.");
        int fila=scan.nextInt();
        System.out.println("Ingrese un número de columna.");
        int columna=scan.nextInt();
        int saludActual=bichos[fila][columna].getSalud()-5;
        if(Bicho.bichos[fila][columna].getSalud()>=5){
            Bicho.bichos[fila][columna].setSalud(saludActual);
        }
    }
    public static void activarBomba(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número de fila.");
        int fila=scan.nextInt();
        System.out.println("Ingrese un número de columna.");
        int columna=scan.nextInt(); 
        Bicho.bichos[fila][columna].setSalud(0);
    }
    public static void bichoMutante(){
        int posicionMenor=Bicho.bichos[0][0].getSalud();
        int pI=0;
        int pJ=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<=i;j++){
                if(Bicho.bichos[i][j].getSalud()<posicionMenor && Bicho.bichos[i][j].getSalud()!=0){
                    posicionMenor=Bicho.bichos[i][j].getSalud();
                    pI=i;
                    pJ=j;
                }
            }
        }
        Bicho.bichos[pI][pJ].setSalud(Bicho.bichos[pI][pJ].getSalud()*2);
    }
}