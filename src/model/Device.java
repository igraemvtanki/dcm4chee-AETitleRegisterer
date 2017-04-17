
package model;

import java.util.List;

public class Device {

    private String dicomDeviceName;
    private Boolean dicomInstalled;
    private List<DicomNetworkConnection> dicomNetworkConnection = null;
    private List<DicomNetworkAE> dicomNetworkAE = null;

    public String getDicomDeviceName() {
        return dicomDeviceName;
    }

    public void setDicomDeviceName(String dicomDeviceName) {
        this.dicomDeviceName = dicomDeviceName;
    }

    public Device withDicomDeviceName(String dicomDeviceName) {
        this.dicomDeviceName = dicomDeviceName;
        return this;
    }

    public Boolean getDicomInstalled() {
        return dicomInstalled;
    }

    public void setDicomInstalled(Boolean dicomInstalled) {
        this.dicomInstalled = dicomInstalled;
    }

    public Device withDicomInstalled(Boolean dicomInstalled) {
        this.dicomInstalled = dicomInstalled;
        return this;
    }

    public List<DicomNetworkConnection> getDicomNetworkConnection() {
        return dicomNetworkConnection;
    }

    public void setDicomNetworkConnection(List<DicomNetworkConnection> dicomNetworkConnection) {
        this.dicomNetworkConnection = dicomNetworkConnection;
    }

    public Device withDicomNetworkConnection(List<DicomNetworkConnection> dicomNetworkConnection) {
        this.dicomNetworkConnection = dicomNetworkConnection;
        return this;
    }

    public List<DicomNetworkAE> getDicomNetworkAE() {
        return dicomNetworkAE;
    }

    public void setDicomNetworkAE(List<DicomNetworkAE> dicomNetworkAE) {
        this.dicomNetworkAE = dicomNetworkAE;
    }

    public Device withDicomNetworkAE(List<DicomNetworkAE> dicomNetworkAE) {
        this.dicomNetworkAE = dicomNetworkAE;
        return this;
    }

    @Override
    public String toString() {
        return "Cihaz{" + "dicomDeviceName=" + dicomDeviceName + ", dicomInstalled=" + dicomInstalled + ", dicomNetworkConnection=" + dicomNetworkConnection + ", dicomNetworkAE=" + dicomNetworkAE + '}';
    }

}
