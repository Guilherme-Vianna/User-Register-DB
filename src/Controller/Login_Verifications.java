/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author matav
 */
public class Login_Verifications {
    public static void VerifyLogin(String Name, String Password){
        if("Guilherme".equals(Name) && "123".equals(Password)){
            System.out.println("Login Bem Sucedido"); 
        } else {
            System.out.println("Login Mal Sucedido");
        }
    } 
}
