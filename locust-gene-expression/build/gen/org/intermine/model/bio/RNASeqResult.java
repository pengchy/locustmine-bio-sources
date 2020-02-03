package org.intermine.model.bio;

public interface RNASeqResult extends org.intermine.model.InterMineObject
{
    public java.lang.String getTissue();
    public void setTissue(final java.lang.String tissue);

    public java.lang.String getPhase();
    public void setPhase(final java.lang.String phase);

    public java.lang.Double getExpressionScore();
    public void setExpressionScore(final java.lang.Double expressionScore);

    public java.lang.String getDevelopmentalStage();
    public void setDevelopmentalStage(final java.lang.String developmentalStage);

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

    public org.intermine.model.bio.Sample getSample();
    public void setSample(final org.intermine.model.bio.Sample sample);
    public void proxySample(final org.intermine.objectstore.proxy.ProxyReference sample);
    public org.intermine.model.InterMineObject proxGetSample();

    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets();
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets);
    public void addDataSets(final org.intermine.model.bio.DataSet arg);

}
