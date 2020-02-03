package org.intermine.model.bio;

public interface MicroArrayResult extends org.intermine.model.InterMineObject
{
    public java.lang.Boolean getIsControl();
    public void setIsControl(final java.lang.Boolean isControl);

    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public java.lang.Float getValue();
    public void setValue(final java.lang.Float value);

    public java.lang.String getScale();
    public void setScale(final java.lang.String scale);

    public org.intermine.model.bio.MicroArrayExperiment getExperiment();
    public void setExperiment(final org.intermine.model.bio.MicroArrayExperiment experiment);
    public void proxyExperiment(final org.intermine.objectstore.proxy.ProxyReference experiment);
    public org.intermine.model.InterMineObject proxGetExperiment();

    public org.intermine.model.bio.ProbeSet getMaterial();
    public void setMaterial(final org.intermine.model.bio.ProbeSet material);
    public void proxyMaterial(final org.intermine.objectstore.proxy.ProxyReference material);
    public org.intermine.model.InterMineObject proxGetMaterial();

    public java.util.Set<org.intermine.model.bio.MicroArrayAssay> getAssays();
    public void setAssays(final java.util.Set<org.intermine.model.bio.MicroArrayAssay> assays);
    public void addAssays(final org.intermine.model.bio.MicroArrayAssay arg);

    public java.util.Set<org.intermine.model.bio.Reporter> getReporters();
    public void setReporters(final java.util.Set<org.intermine.model.bio.Reporter> reporters);
    public void addReporters(final org.intermine.model.bio.Reporter arg);

    public java.util.Set<org.intermine.model.bio.Gene> getGenes();
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes);
    public void addGenes(final org.intermine.model.bio.Gene arg);

    public java.util.Set<org.intermine.model.bio.Sample> getSamples();
    public void setSamples(final java.util.Set<org.intermine.model.bio.Sample> samples);
    public void addSamples(final org.intermine.model.bio.Sample arg);

    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets();
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets);
    public void addDataSets(final org.intermine.model.bio.DataSet arg);

}
