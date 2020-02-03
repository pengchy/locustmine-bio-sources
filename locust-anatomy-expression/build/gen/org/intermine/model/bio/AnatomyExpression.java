package org.intermine.model.bio;

public interface AnatomyExpression extends org.intermine.model.InterMineObject
{
    public java.lang.Float getExpressionRPKMMin();
    public void setExpressionRPKMMin(final java.lang.Float expressionRPKMMin);

    public java.lang.Float getExpressionRankMean();
    public void setExpressionRankMean(final java.lang.Float expressionRankMean);

    public java.lang.Float getExpressionRankMedian();
    public void setExpressionRankMedian(final java.lang.Float expressionRankMedian);

    public java.lang.Float getExpressionRankMax();
    public void setExpressionRankMax(final java.lang.Float expressionRankMax);

    public java.lang.Float getExpressionRank1stQu();
    public void setExpressionRank1stQu(final java.lang.Float expressionRank1stQu);

    public java.lang.Float getExpressionRPKM3rdQu();
    public void setExpressionRPKM3rdQu(final java.lang.Float expressionRPKM3rdQu);

    public java.lang.Float getExpressionRPKMMax();
    public void setExpressionRPKMMax(final java.lang.Float expressionRPKMMax);

    public java.lang.Float getExpressionRPKM1stQu();
    public void setExpressionRPKM1stQu(final java.lang.Float expressionRPKM1stQu);

    public java.lang.Float getExpressionRankMin();
    public void setExpressionRankMin(final java.lang.Float expressionRankMin);

    public java.lang.Float getExpressionRank3rdQu();
    public void setExpressionRank3rdQu(final java.lang.Float expressionRank3rdQu);

    public java.lang.Float getExpressionRPKMMedian();
    public void setExpressionRPKMMedian(final java.lang.Float expressionRPKMMedian);

    public java.lang.Float getExpressionRPKMMean();
    public void setExpressionRPKMMean(final java.lang.Float expressionRPKMMean);

    public org.intermine.model.bio.AnatomyTerm getAnatomyTerm();
    public void setAnatomyTerm(final org.intermine.model.bio.AnatomyTerm anatomyTerm);
    public void proxyAnatomyTerm(final org.intermine.objectstore.proxy.ProxyReference anatomyTerm);
    public org.intermine.model.InterMineObject proxGetAnatomyTerm();

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets();
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets);
    public void addDataSets(final org.intermine.model.bio.DataSet arg);

}
