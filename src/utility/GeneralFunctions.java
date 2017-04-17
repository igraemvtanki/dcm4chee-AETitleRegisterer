/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Administrator
 */
public class GeneralFunctions {
    
    public static String getLocalAdress() throws UnknownHostException{
        return InetAddress.getLocalHost().getHostAddress();
    }
    
    public static String getHostName() throws UnknownHostException{
        return InetAddress.getLocalHost().getHostName();
    }
   
}
