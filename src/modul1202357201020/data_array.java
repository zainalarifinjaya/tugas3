/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1202357201020;

/**
 *
 * @author ADMIN
 */
public class data_array {
    public static void main(String[] args) {
        String data [][] ={
            {"NAMA","\t\tALAMAT","\t\tTELEPON"},
            {"<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>"},
            {"ABDUL","\t\tKediri","\t\t0856446668991"},
            {"KUSNO","\t\tTrenggalek","\t085646668992"},
            {"PONIRAN","\tBojonegoro","\t085646668999"}
        };
        for (int a = 0; a < data.length; a++){
            for (int b = 0; b < data[a].length; b++){
                System.out.print(data[a][b]+" ");
            }
            System.out.println("");
        }
    }
}