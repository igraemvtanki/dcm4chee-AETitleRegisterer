
package model;

public class DicomNetworkConnection {

    private String cn;
    private String dicomHostname;
    private Integer dicomPort;

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public DicomNetworkConnection withCn(String cn) {
        this.cn = cn;
        return this;
    }

    public String getDicomHostname() {
        return dicomHostname;
    }

    public void setDicomHostname(String dicomHostname) {
        this.dicomHostname = dicomHostname;
    }

    public DicomNetworkConnection withDicomHostname(String dicomHostname) {
        this.dicomHostname = dicomHostname;
        return this;
    }

    public Integer getDicomPort() {
        return dicomPort;
    }

    public void setDicomPort(Integer dicomPort) {
        this.dicomPort = dicomPort;
    }

    public DicomNetworkConnection withDicomPort(Integer dicomPort) {
        this.dicomPort = dicomPort;
        return this;
    }

    @Override
    public String toString() {
        return "DicomNetworkConnection{" + "cn=" + cn + ", dicomHostname=" + dicomHostname + ", dicomPort=" + dicomPort + '}';
    }

}
