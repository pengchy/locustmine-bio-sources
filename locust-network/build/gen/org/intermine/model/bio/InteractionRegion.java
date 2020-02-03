package org.intermine.model.bio;

public interface InteractionRegion extends org.intermine.model.bio.BioEntity
{
    public java.lang.String getStartStatus();
    public void setStartStatus(final java.lang.String startStatus);

    public java.lang.String getEndStatus();
    public void setEndStatus(final java.lang.String endStatus);

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

    public org.intermine.model.bio.OntologyTerm getOntologyTerm();
    public void setOntologyTerm(final org.intermine.model.bio.OntologyTerm ontologyTerm);
    public void proxyOntologyTerm(final org.intermine.objectstore.proxy.ProxyReference ontologyTerm);
    public org.intermine.model.InterMineObject proxGetOntologyTerm();

    public org.intermine.model.bio.InteractionDetail getInteraction();
    public void setInteraction(final org.intermine.model.bio.InteractionDetail interaction);
    public void proxyInteraction(final org.intermine.objectstore.proxy.ProxyReference interaction);
    public org.intermine.model.InterMineObject proxGetInteraction();

}
