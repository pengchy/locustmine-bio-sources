package org.intermine.model.bio;

public interface MicroArrayAssay extends org.intermine.model.InterMineObject
{
    public java.lang.String getSample1();
    public void setSample1(final java.lang.String sample1);

    public java.lang.String getSample2();
    public void setSample2(final java.lang.String sample2);

    public java.lang.String getDescription();
    public void setDescription(final java.lang.String description);

    public java.lang.Integer getDisplayOrder();
    public void setDisplayOrder(final java.lang.Integer displayOrder);

    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public org.intermine.model.bio.MicroArrayExperiment getExperiment();
    public void setExperiment(final org.intermine.model.bio.MicroArrayExperiment experiment);
    public void proxyExperiment(final org.intermine.objectstore.proxy.ProxyReference experiment);
    public org.intermine.model.InterMineObject proxGetExperiment();

    public java.util.Set<org.intermine.model.bio.MicroArrayResult> getResults();
    public void setResults(final java.util.Set<org.intermine.model.bio.MicroArrayResult> results);
    public void addResults(final org.intermine.model.bio.MicroArrayResult arg);

    public java.util.Set<org.intermine.model.bio.Sample> getSamples();
    public void setSamples(final java.util.Set<org.intermine.model.bio.Sample> samples);
    public void addSamples(final org.intermine.model.bio.Sample arg);

}
