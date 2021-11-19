import java.util.Scanner;
public class MiniJuego{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número límite para crear una cantidad de bichos (entre 1 y 4)");
        int valorAleatorio=scan.nextInt();
        if(valorAleatorio<0 || valorAleatorio>5){
            System.out.println("Ingrese un número valido.");
            valorAleatorio=scan.nextInt();
        }
        int n=0;
        System.out.println("El número aleatorio es: "+valorAleatorio);
        Bicho.bichos[0][0]=new Bicho("NN",0); Bicho.bichos[0][1]=new Bicho("NN",0); Bicho.bichos[1][0]=new Bicho("NN",0); Bicho.bichos[1][1]=new Bicho("NN",0);
        while(true){
            System.out.println("Ingrese 1 para crear un bicho normal o 2 para crear un bicho alien.");
            int tipoBicho=scan.nextInt();
            if(n==0){
                if(tipoBicho==1){
                    Bicho.bichos[0][0]=new BichoNormal();
                }else if(tipoBicho==2){
                    Bicho.bichos[0][0]=new BichoAlien();
                }
                n=n+1;
            }else if(n==1){
                if(tipoBicho==1){
                    Bicho.bichos[0][1]=new BichoNormal();
                }else if(tipoBicho==2){
                    Bicho.bichos[0][1]=new BichoAlien();
                }
                n=n+1;
            }else if(n==2){
                if(tipoBicho==1){
                    Bicho.bichos[1][0]=new BichoNormal();
                }else if(tipoBicho==2){
                    Bicho.bichos[1][0]=new BichoAlien();
                }
                n=n+1;
            }else if(n==3){
                if(tipoBicho==1){
                    Bicho.bichos[1][1]=new BichoNormal();
                }else if(tipoBicho==2){
                    Bicho.bichos[1][1]=new BichoAlien();
                }
                n=n+1;
            }
            if(n==valorAleatorio){
                break;
            }
        }
        System.out.println("BN = Bicho Normal / BA = Bicho Alien / NN = No hay Nada");
        System.out.println("-------------");
        System.out.println("|"+Bicho.bichos[0][0].getTipo()+"-"+Bicho.bichos[0][0].getSalud()+"|"+Bicho.bichos[0][1].getTipo()+"-"+Bicho.bichos[0][1].getSalud()+"|");
        System.out.println("-------------");
        System.out.println("|"+Bicho.bichos[1][0].getTipo()+"-"+Bicho.bichos[1][0].getSalud()+"|"+Bicho.bichos[1][1].getTipo()+"-"+Bicho.bichos[1][1].getSalud()+"|");
        System.out.println("-------------");
        System.out.println("Ingrese 1 para disparar una bala (debe ingresar la posición de la columna y la posición de la fila para restarle 5 de salud al bicho que se encuentra en ella).");
        System.out.println("Ingrese 2 para activar la bomba atómica (mata a cualquier bicho en una posición aleatoria).");
        System.out.println("Ingrese 3 para activar al bicho mutante (duplica la vida del bicho que tiene menos salud).");
        System.out.println("Ingrese 4 para ver la frase de la abuela (muestra una frase motivadora que diría cualquier abuela).");
        System.out.println("NOTA: el programa se termina solo cuando todos los bichos tienen una salud igual a 0 (cero).");
        while(true){
            int num=scan.nextInt();
            if(num==1){
                Bicho.dispararBala();
            }else if(num==2){
                Bicho.activarBomba();
            }else if(num==3){
                Bicho.bichoMutante();
            }else if(num==4){
                System.out.println("Métale güevas mijo que esto antes era monte.");
            }else{
                System.out.println("Ingrese un número valido.");
            }
            System.out.println("BN = Bicho Normal / BA = Bicho Alien / NN = No hay Nada");
            System.out.println("-------------");
            System.out.println("|"+Bicho.bichos[0][0].getTipo()+"-"+Bicho.bichos[0][0].getSalud()+"|"+Bicho.bichos[0][1].getTipo()+"-"+Bicho.bichos[0][1].getSalud()+"|");
            System.out.println("-------------");
            System.out.println("|"+Bicho.bichos[1][0].getTipo()+"-"+Bicho.bichos[1][0].getSalud()+"|"+Bicho.bichos[1][1].getTipo()+"-"+Bicho.bichos[1][1].getSalud()+"|");
            System.out.println("-------------");
            System.out.println("Ingrese 1 para disparar una bala (debe ingresar la posición de la columna y la posición de la fila para restarle 5 de salud al bicho que se encuentra en ella).");
            System.out.println("Ingrese 2 para activar la bomba atómica (mata a cualquier bicho en una posición aleatoria).");
            System.out.println("Ingrese 3 para activar al bicho mutante (duplica la vida del bicho que tiene menos salud).");
            System.out.println("Ingrese 4 para ver la frase de la abuela (muestra una frase motivadora que diría cualquier abuela).");
            System.out.println("NOTA: el programa se termina solo cuando todos los bichos tienen una salud igual a 0 (cero).");
            if(Bicho.bichos[0][0].getSalud()==0 && Bicho.bichos[0][1].getSalud()==0 && Bicho.bichos[1][0].getSalud()==0 && Bicho.bichos[1][1].getSalud()==0){
                System.out.println("Finaliza el programa.");
                break;
            }
        }
    }
}