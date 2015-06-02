package simuladorsyma;

//Esta clase simula un objeto, en este caso sera el molde de un carro
public class Carro extends Thread{
   @Override
   public void run(){
        Recorrido rec=new Recorrido();
        Main ma=new Main();
        int servicio=(int)(Math.random()*(3-1+1)+1); 
        try{
        switch(servicio){
            case 1:
                ma.dinero1.add(1);
                rec.start();
                Thread.sleep(3000);
                break;
            case 2: 
                ma.dinero2.add(1);
                rec.start();
                Thread.sleep(4000);
                break;
            case 3:
                ma.dinero3.add(1);
                rec.start();
                Thread.sleep(4500);
                break;
            }
         }catch(Exception ex){}
   
   }   
}
