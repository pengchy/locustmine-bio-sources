package org.intermine.model.bio;

public interface Sample extends org.intermine.model.bio.BioEntity
{
    public java.lang.String getMaterialType();
    public void setMaterialType(final java.lang.String materialType);

    public java.lang.String getDescription();
    public void setDescription(final java.lang.String description);

    public java.lang.String getPrimaryCharacteristic();
    public void setPrimaryCharacteristic(final java.lang.String primaryCharacteristic);

    public java.lang.String getPrimaryCharacteristicType();
    public void setPrimaryCharacteristicType(final java.lang.String primaryCharacteristicType);

    public org.intermine.model.bio.Publication getPublication();
    public void setPublication(final org.intermine.model.bio.Publication publication);
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication);
    public org.intermine.model.InterMineObject proxGetPublication();

    public java.util.Set<org.intermine.model.bio.MicroArrayAssay> getAssays();
    public void setAssays(final java.util.Set<org.intermine.model.bio.MicroArrayAssay> assays);
    public void addAssays(final org.intermine.model.bio.MicroArrayAssay arg);

    public java.util.Set<org.intermine.model.bio.SampleCharacteristic> getCharacteristics();
    public void setCharacteristics(final java.util.Set<org.intermine.model.bio.SampleCharacteristic> characteristics);
    public void addCharacteristics(final org.intermine.model.bio.SampleCharacteristic arg);

    public java.util.Set<org.intermine.model.bio.Treatment> getTreatments();
    public void setTreatments(final java.util.Set<org.intermine.model.bio.Treatment> treatments);
    public void addTreatments(final org.intermine.model.bio.Treatment arg);

    public java.util.Set<org.intermine.model.bio.RNASeqResult> getRnaSeqResults();
    public void setRnaSeqResults(final java.util.Set<org.intermine.model.bio.RNASeqResult> rnaSeqResults);
    public void addRnaSeqResults(final org.intermine.model.bio.RNASeqResult arg);

    public java.util.Set<org.intermine.model.bio.SampleGroup> getSampleGroups();
    public void setSampleGroups(final java.util.Set<org.intermine.model.bio.SampleGroup> sampleGroups);
    public void addSampleGroups(final org.intermine.model.bio.SampleGroup arg);

}
