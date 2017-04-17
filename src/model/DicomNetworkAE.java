
package model;

import java.util.List;

public class DicomNetworkAE {

    private String dicomAETitle;
    private Boolean dicomAssociationInitiator;
    private Boolean dicomAssociationAcceptor;
    private List<String> dicomNetworkConnectionReference = null;   //  "/dicomNetworkConnection/0"

    public String getDicomAETitle() {
        return dicomAETitle;
    }

    public void setDicomAETitle(String dicomAETitle) {
        this.dicomAETitle = dicomAETitle;
    }

    public DicomNetworkAE withDicomAETitle(String dicomAETitle) {
        this.dicomAETitle = dicomAETitle;
        return this;
    }

    public Boolean getDicomAssociationInitiator() {
        return dicomAssociationInitiator;
    }

    public void setDicomAssociationInitiator(Boolean dicomAssociationInitiator) {
        this.dicomAssociationInitiator = dicomAssociationInitiator;
    }

    public DicomNetworkAE withDicomAssociationInitiator(Boolean dicomAssociationInitiator) {
        this.dicomAssociationInitiator = dicomAssociationInitiator;
        return this;
    }

    public Boolean getDicomAssociationAcceptor() {
        return dicomAssociationAcceptor;
    }

    public void setDicomAssociationAcceptor(Boolean dicomAssociationAcceptor) {
        this.dicomAssociationAcceptor = dicomAssociationAcceptor;
    }

    public DicomNetworkAE withDicomAssociationAcceptor(Boolean dicomAssociationAcceptor) {
        this.dicomAssociationAcceptor = dicomAssociationAcceptor;
        return this;
    }

    public List<String> getDicomNetworkConnectionReference() {
        return dicomNetworkConnectionReference;
    }

    public void setDicomNetworkConnectionReference(List<String> dicomNetworkConnectionReference) {
        this.dicomNetworkConnectionReference = dicomNetworkConnectionReference;
    }

    public DicomNetworkAE withDicomNetworkConnectionReference(List<String> dicomNetworkConnectionReference) {
        this.dicomNetworkConnectionReference = dicomNetworkConnectionReference;
        return this;
    }

    @Override
    public String toString() {
        return "DicomNetworkAE{" + "dicomAETitle=" + dicomAETitle + ", dicomAssociationInitiator=" + dicomAssociationInitiator + ", dicomAssociationAcceptor=" + dicomAssociationAcceptor + ", dicomNetworkConnectionReference=" + dicomNetworkConnectionReference + '}';
    }

}
