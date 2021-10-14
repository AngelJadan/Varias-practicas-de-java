/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

/**
 *
 * @author EstAngelMesiasJadanC
 */
public class Login {
    
    static final String LDAP_URL = "ldap://sucursal1.facturacion.sucursal1.jadan.com:389/DC=facturacion, DC=sucursal1, DC =jadan ,DC=com";
    public boolean login(String username, String password){
        Hashtable env=new Hashtable();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        env.put(Context.PROVIDER_URL, LDAP_URL);
        env.put(Context.SECURITY_AUTHENTICATION, "simple");
        env.put(Context.SECURITY_PRINCIPAL, "CN="+username.toUpperCase()+",cn = Users, DC= facturacion, DC=sucursal1, DC=jadan, DC=com");
        env.put(Context.SECURITY_CREDENTIALS, password);
        try {
            DirContext ctx=new InitialDirContext(env);
            return true;
            
        } catch (NamingException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null, ex);
            
        }
        return false;
    }
}
