/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dajaya;
import java.sql.*;

public class ConexionBD {
    public String db="dajaya";
    public String url="jdbc:mysql://localhost/"+db;
    public String user="root";
    public String pass="";
    
    ConexionBD()
    {   
    }
    public Connection Conectar(){
        Connection link=null;
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            link = DriverManager.getConnection(this.url, this.user, this.pass);
        }catch(Exception e){
            System.out.println(e);
        }
        return link;
        }
    }

