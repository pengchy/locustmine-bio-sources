package org.intermine.model.bio;

public interface MicroArrayExperiment extends org.intermine.model.InterMineObject
{
    public java.lang.String getIdentifier();
    public void setIdentifier(final java.lang.String identifier);

    public java.lang.String getDescription();
    public void setDescription(final java.lang.String description);

    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public org.intermine.model.bio.Publication getPublication();
    public void setPublication(final org.intermine.model.bio.Publication publication);
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication);
    public org.intermine.model.InterMineObject proxGetPublication();

    public java.util.Set<org.intermine.model.bio.MicroArrayResult> getResults();
    public void setResults(final java.util.Set<org.intermine.model.bio.MicroArrayResult> results);
    public void addResults(final org.intermine.model.bio.MicroArrayResult arg);

    public java.util.Set<org.intermine.model.bio.MicroArrayAssay> getAssays();
    public void setAssays(final java.util.Set<org.intermine.model.bio.MicroArrayAssay> assays);
    public void addAssays(final org.intermine.model.bio.MicroArrayAssay arg);

}
