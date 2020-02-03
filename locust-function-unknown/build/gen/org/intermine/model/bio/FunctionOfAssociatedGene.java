package org.intermine.model.bio;

public interface FunctionOfAssociatedGene extends org.intermine.model.InterMineObject
{
    public java.lang.Double getGeneInFunctionDB();
    public void setGeneInFunctionDB(final java.lang.Double geneInFunctionDB);

    public java.lang.Double getGeneAssociated();
    public void setGeneAssociated(final java.lang.Double geneAssociated);

    public java.lang.String getIdentifier();
    public void setIdentifier(final java.lang.String identifier);

    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.lang.String getfunctionDB();
    public void setfunctionDB(final java.lang.String FunctionDB);

    public java.lang.Double getGeneInFunctionSet();
    public void setGeneInFunctionSet(final java.lang.Double geneInFunctionSet);

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

}
