/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.List;
import model.Device;
import network.Request;
import network.Response;
import network.Web;

/**
 *
 * @author Administrator
 */
public class GeneralFunctions {

    public static String getLocalAdress() throws UnknownHostException {
        return InetAddress.getLocalHost().getHostAddress();
    }

    public static String getHostName() throws UnknownHostException {
        return InetAddress.getLocalHost().getHostName();
    }

//    public static String getNextAvailableName(String serverUrl) {    //http://10.17.128.14:8080/dcm4chee-arc/devices
//        
//        return "";
//    }
    public static List<Device> getDeviceList(String ServerURL) {//http://10.17.128.14:8080
        String urlPosix = "/dcm4chee-arc/aes";
        Request request = new Request();
        request.setRequestURL(ServerURL + urlPosix);
        request.setRequestMethod("get");
        Response response1 = Web.send(request);
        List<Device> deviceList = (List<Device>) new Gson().fromJson(response1.getResponseRaw(), new TypeToken<List<Device>>() {
        }.getType());
        
        return deviceList;
    }
    
    public static Device getDeviceInfo(String ServerURL,String deviceName){
        String urlPosix = "/dcm4chee-arc/devices/"+deviceName;
        Request request = new Request();
        request.setRequestURL(ServerURL + urlPosix);
        request.setRequestMethod("get");
        Response response1 = Web.send(request);
        Device dev = new Gson().fromJson(response1.getResponseRaw(), Device.class);
        return dev;
    }
    public static void main(String[] args) {
        System.out.println(getDeviceInfo("http://10.17.128.14:8080", "cgdstnc").toString());
        
    }
}
