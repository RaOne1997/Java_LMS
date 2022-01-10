/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHRUBHI
 */
public class bar {
    public static void main(String args[]){
        firstloddingscreen fld=new firstloddingscreen();
        fld.setVisible(true);
                login lg=new login();
                
        try{
            
            for(int i=0;1<=100;i++){
                Thread.sleep(40);
                fld.jProgressBar1.setValue(i);
                
               if(i==100){
                   
                           fld.setVisible(false);
                            lg.setVisible(true);

                
            }
        }
        
    }catch(Exception e){
        }

    }
}
