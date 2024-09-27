/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop3;

import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author joser
 */
public class MPOOP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here
        int[] nums2 = {1,2,3,4,5};
        int[] nums4;
        nums4 = new int[5];
        
        System.out.println("#### for each ####");
        for(int temp : nums2){
            System.out.println("Cuenta: " + temp);
        }
        
        System.out.println("#### for ####");
        for (int i = 0; i < nums4.length; i++) {
            nums4[i] = i*10;
        }
        
        for (int i = 0; i < nums4.length; i++) {
            int j = nums4[i];
            System.out.println(j);
        }
        
        System.out.println("#### String ####");
        String cadena1 = new String("Hola mundo");//->Canonica
        System.out.println(cadena1);
        String cadena2 = "Hola mundo de forma recomendada";//->Recomendada
        System.out.println(cadena2);
        
        ///////////////////////////////////////////
        
        String nombre = "Emiliano";
        String apellido = "Olayo";
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(nombre + " " + apellido);
        String nombreCompleto = nombre+" "+apellido;
        System.out.println(nombreCompleto);
        
        /////////////////////////////////////
        
        System.out.println("#### Wrapper ####");
        int a = 4;
        Integer b = new Integer(4);//->ya no tiene soporte
        System.out.println(b);
        Integer c =4;
        System.out.println(c);
        Integer d = a;//Se envuelve a y se guarda dentro de d como un wrapper
        String cadena3 = d.toString();//con el uso del operador punto lo convertimos para guardarlo en la cadena
        String cadena4 = 4 + "";//Otra forma de guardar el valor cuatro como una cadena dentro de cadena4
        System.out.println(cadena3);
        System.out.println(cadena4);
        
        System.out.println("#### Colecciones ####");
        System.out.println("#### Arraylist ####");
        
        ArrayList<Integer> miArrayList = new ArrayList<Integer>();
        
        miArrayList.add(d);
        miArrayList.add(33);
        miArrayList.add(77);
        System.out.println(miArrayList.size());
        System.out.println(miArrayList.get(0));
        miArrayList.add(1,10);
        System.out.println(miArrayList.size());
        System.out.println("***");
        for (Integer temp : miArrayList) {
            System.out.println(temp);
        }
        miArrayList.add(77);
        System.out.println("***");
        for (Integer temp : miArrayList) {
            System.out.println(temp);
        }
        System.out.println("Nuevo tamaño " + miArrayList.size());
        ////////////////////////////////////
        System.out.println("#### Hashtable ####");
        Hashtable<Integer,String> miTabla = new Hashtable<Integer,String>();
        miTabla.put(1, "uno");
        miTabla.put(5566778, "Antonio");
        miTabla.put(5576054, "Emiliano");
        miTabla.put(4477889, "Diana");
        System.out.println("Elementos en tabla: "+miTabla.size());
        
        System.out.println("#### Enumerador ####");
        Integer llave;
        String valor;
        
        Enumeration<Integer> enumeradorLlaves = miTabla.keys();//define la estructura para enumerar
        while (enumeradorLlaves.hasMoreElements()) {//mientras que haya mas elementos en miTabla se crearan más enumeradores para cada elemento
            llave = enumeradorLlaves.nextElement();//Asigna una llave a cada elemento
            valor = miTabla.get(llave);
            System.out.println(llave + " " + valor);
        }
        
        System.out.println(Math.PI);
        Date dia = new Date();
        System.out.println(dia);
       
    }
    
}
