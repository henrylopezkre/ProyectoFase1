/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author Jose
 */
public class Validacion {
    private String user;
    private String pass;
    private boolean state = false;

    public Validacion() {
    }

    public Validacion(String user, String pass) {
        Verificar(user, pass);
    }

    public boolean Verificar (String user, String pass){
        if (user.equals("")){
            System.out.println("Error: ingrese un nombre de Usuario...");
            return false;
        }
        else if (pass.equals("")){
            System.out.println("Error: ingrese una contraseña...");
            return false;
        }
        if (user.equals("admin")){
            if(! pass.equals("admin")){
                System.out.println("Error: Usuario o contrasena incorrecta...");
                return false;
            }
            System.out.println("Bienvenido Login - Inicio Sesión...");
//            this.user = user;
//            this.pass = pass;
//            this.state = true;
            return true;
        }
        else{
            System.out.println("Error: Usuario no existe...");
        }
        return false;
    }
    
    /*
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    */
    
}
