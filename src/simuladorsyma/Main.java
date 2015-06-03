package simuladorsyma;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static int valorLlegada=0,ocio,tiempoFila;
    public static double tiempoAntes;
    public static long tiempoInicial= System.currentTimeMillis();
    public static ArrayList dinero1=new ArrayList();
    public static ArrayList dinero2=new ArrayList();
    public static ArrayList dinero3=new ArrayList();
    public static long tiempo=0;
    
    
           
    public static void main(String[] args) throws InterruptedException {
        Scanner sc= new Scanner(System.in);   
        Carro car= new Carro();
        
        System.out.println("\t\t\t\t\t\t\t\t     BIENVENIDOS A SYMA AUTOLAVADO\n");
        System.out.println("\t\t\t\t\t\t\tESTE ES EL MENU DE NUESTROS SERVICIOS Y SUS PRECIOS\n");
        System.out.println("1-LAVADO MANUAL Y SECADO........................$80(35 MINUTOS)\n");
        System.out.println("2-AUTOLAVADO Y SECADO...........................$120(25 MINUTOS)\n");
        System.out.println("3-AUTOLAVADO Y SECADO EXTERIOR E INTERIOR.......$140(50 MINUTOS)\n\n");
        System.out.println("Cuantos carros quieres tener en tu simulacion: ");
        int cantidadCarros=sc.nextInt();
        
        int i=0,counter=1;
        while(i<cantidadCarros){
            int val=(int) Math.rint(Math.random());
            if(val==1){
            Carro simulacion= new Carro();
            int random=(int)(Math.random()*(10-0+1)+0); 
            valorLlegada+=random;
            simulacion.start();
            System.out.println("Auto #"+counter+" entrando");
            Thread.sleep(10*random);
            tiempoFila+=(random);
            i++; counter++;
            }else{
                ocio+=5;
            }
        }
         System.out.println("\nRESULTADOS FINALES DE SIMULACION\n");
         System.out.println("Tiempo total entre llegadas "+valorLlegada+ " minutos");
         
         int total= dinero1.size()*80;
         int total2=dinero2.size()*120;
         int total3= dinero3.size()*140;
         int final1=total+total2+total3;
         int serv= dinero1.size()*35;
         int serv2= dinero2.size()*25;
         int serv3= dinero3.size()*50;
         int servTotal= serv+serv2+serv3;
         String time= String.valueOf(tiempo);
         
         time.concat("0");
         
         System.out.println("Tiempo total de espera de los autos a ser atendidos: "+tiempo+" minutos");
         System.out.println("Tiempo total de la simulacion: "+(System.currentTimeMillis()-tiempoInicial)/1000 +" segs");
         System.out.println("Tiempo total de servicio: "+servTotal+" mins");
         System.out.println("Tiempo promedio de espera: "+(tiempo/cantidadCarros)+" mins");
         System.out.println("Tiempo de ocio "+ocio+" minutos");
         System.out.println("Tiempo total de ocio: "+(ocio+valorLlegada+ " minutos"));
         System.out.println("Tiempo promedio en fila antes de ser atendidos "+(tiempoFila/cantidadCarros+" mins"));
     
         System.out.println("Total clientes que pidieron el servicio #1: "+dinero1.size()+ " cliente(s)");
         System.out.println("Total clientes que pidieron el servicio #2: "+dinero2.size()+ " cliente(s)");
         System.out.println("Total clientes que pidieron el servicio #3: "+dinero3.size()+ " cliente(s)");
         
         System.out.println("Ganancia total paquete 1:"+total+ " Pesos");
         System.out.println("Ganancia total paquete 2: "+total2+ " Pesos");
         System.out.println("Ganancia total paquete 3: "+total3+ " Pesos");
         System.out.println("Ganancia Total "+final1+" Pesos");
    }
}
