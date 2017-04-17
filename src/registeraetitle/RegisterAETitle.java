/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registeraetitle;

import com.google.gson.Gson;
import java.util.LinkedList;
import java.util.List;
import model.Device;
import model.DicomNetworkAE;
import model.DicomNetworkConnection;
import network.Request;
import network.Response;
import network.Web;
import utility.GeneralFunctions;

/**
 *
 * @author Administrator
 */
public class RegisterAETitle {

    public boolean hostNameVeIpIleKaydet(String serverIp, int serverPort, int clientPort) throws java.net.UnknownHostException {
        if (!serverIp.startsWith("http://")) {
            String str = "http://";
            serverIp = str + serverIp;
        }
        String machine = GeneralFunctions.getHostName() + "_" + GeneralFunctions.getLocalAdress();
        DicomNetworkConnection dicomNetworkConnection = new DicomNetworkConnection();
        dicomNetworkConnection.setCn(machine);
        dicomNetworkConnection.setDicomHostname(GeneralFunctions.getLocalAdress());
        dicomNetworkConnection.setDicomPort(clientPort);
        List<DicomNetworkConnection> dicomNetworkConnections = new LinkedList<>();
        dicomNetworkConnections.add(dicomNetworkConnection);

        DicomNetworkAE dicomNetworkAE = new DicomNetworkAE();
        dicomNetworkAE.setDicomAETitle(machine);
        dicomNetworkAE.setDicomAssociationAcceptor(true);
        dicomNetworkAE.setDicomAssociationInitiator(true);
        List<String> list = new LinkedList<>();
        list.add("/dicomNetworkConnection/0");
        dicomNetworkAE.setDicomNetworkConnectionReference(list);
        List<DicomNetworkAE> dicomNetworkAEs = new LinkedList<>();
        dicomNetworkAEs.add(dicomNetworkAE);

        Device device = new Device();
        device.setDicomDeviceName(machine);
        device.setDicomInstalled(true);
        device.setDicomNetworkAE(dicomNetworkAEs);
        device.setDicomNetworkConnection(dicomNetworkConnections);

        Request request = new Request();
        request.setRequestURL(serverIp + ":" + serverPort + "/dcm4chee-arc/devices/" + machine);
        request.setRequestMethod("post");
        request.setRequestJson(new Gson().toJson(device));

        Response response0 = Web.sendDelete(request);
        Response response1 = Web.send(request);

        System.out.println(response1.toString());
        System.out.println("Kayit basari?" + (response1.getResponseCode() == 204));
        return (response1.getResponseCode() == 204);
    }

    public static void main(String[] args) throws java.net.UnknownHostException {
//        if (args.length != 3) {
//            System.out.println("Daha once bu bilgisayar kayitliysa Web Arayuzunden cihazin once AETitle'ini sonra Device'i"
//                    + " silin. Yoksa yeni degisiklikleriniz aktif olmaz.");
//            System.out.println("Kullanim:\nargs[0]:serverIp\nargs[1]:serverPort\nargs[2]:clientPort");
//        }
//        RegisterAETitle obj = new RegisterAETitle();
//        obj.hostNameVeIpIleKaydet(args[0], Integer.valueOf(args[1]), Integer.valueOf(args[2]));
    }
}
