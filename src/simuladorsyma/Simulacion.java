package simuladorsyma;

public class Simulacion extends Thread {
    public int reloj=0;
    public int NCLL=0;
    public int NCA=0;
    public int cola=0;
    public int decision=0;
    public int decision2=0;
    public int TDO=0;
    public static int HR=0;
    public int TTDT=0;
    
    
    public void run(){
        while (reloj<HR) {
            decision=(int) Math.rint(Math.random());
                if (decision==1) {
                    System.out.println("Cliente nuevo");
                    decision2=(int)(Math.random()*3)+1;
                
                    switch (decision2) {
                        case 1:
                            System.out.println("El cliente eligio el servicio 1");
                            NCLL++;
                            TTDT = TTDT+25;
                            reloj=reloj+25;
                            System.out.println("El cliente fue atendido,TIEMPO ACTUALIZADO");
                                break;
                        case 2:
                            System.out.println("El cliente eligio el servicio 2");
                            NCLL++;
                            TTDT = TTDT+35;
                            reloj=reloj+35;
                            System.out.println("El cliente fue atendido,TIEMPO ACTUALIZADO");
                                break;
                        case 3:
                            System.out.println("El cliente eligio el servicio 3");
                            NCLL++;
                            TTDT = TTDT+50;
                            reloj=reloj+50;
                            System.out.println("El cliente fue atendido,TIEMPO ACTUALIZADO");
                                break;
                        default:
                            System.out.println("Error");
                                    }
                        NCA++;
                                }
                
                else{
                    TDO=TDO+1;
                    reloj=reloj+1;
                    }
            try {
                sleep(1500);
                } catch (Exception ex) {
                    System.out.println("Error");
                                       }
           
                         }
        
        
        System.out.println("\nTOTAL DE CARROS QUE LLEGARON : "+NCLL+"    CARROS");
        System.out.println("TOTAL DE CARROS ATENDIDOS    : "+NCLL+"    CARROS");
        System.out.println("TIEMPO TOTAL DE TRABAJO      : "+TTDT+"  MINUTOS");
        System.out.println("TIEMPO TOTAL DE OCIO         : "+TDO+"   MINUTOS");
        System.out.println("TIEMPO TOTAL DE APERTURA     : "+reloj+"  MINUTOS");
        
        
                    }
}