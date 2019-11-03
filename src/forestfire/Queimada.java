/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forestfire;

/**
 *
 * @author Angela
 */
public abstract class Queimada {
    String linha;
    int cordX;
    int cordY;
    String month;
    String day;
    double FFMC;
    double DMC;
    double DC;
    double ISI;
    double temp;
    double RH;
    double wind;
    double rain;
    double area;
    public Queimada(String linha){
        String[] aux = linha.split(",");
        cordX = Integer.parseInt(aux[0]);
        cordY = Integer.parseInt(aux[1]);
        month = aux[2];
        day = aux[3];
        FFMC = Double.parseDouble(aux[4]);
        DMC = Double.parseDouble(aux[5]);
        DC = Double.parseDouble(aux[6]);
        ISI = Double.parseDouble(aux[7]);
        temp = Double.parseDouble(aux[8]);
        RH = Double.parseDouble(aux[9]);
        wind = Double.parseDouble(aux[10]);
        rain = Double.parseDouble(aux[11]);
        area = Double.parseDouble(aux[12]);
    }
    
    public void Relatorio(){
        System.out.print(cordX+", "+cordY+", "+month+", "+day+", ");
        System.out.print(FFMC+", "+DMC+", "+DC+", "+ISI+", ");
        System.out.print(temp+", "+RH+", "+wind+", "+rain+", "+area+"\n");
    }
       
}
