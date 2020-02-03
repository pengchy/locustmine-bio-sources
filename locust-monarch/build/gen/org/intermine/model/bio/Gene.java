package org.intermine.model.bio;

public interface Gene extends org.intermine.model.bio.SequenceFeature
{
    public java.lang.String getBriefDescription();
    public void setBriefDescription(final java.lang.String briefDescription);

    public java.lang.String getDescription();
    public void setDescription(final java.lang.String description);

    public org.intermine.model.bio.IntergenicRegion getUpstreamIntergenicRegion();
    public void setUpstreamIntergenicRegion(final org.intermine.model.bio.IntergenicRegion upstreamIntergenicRegion);
    public void proxyUpstreamIntergenicRegion(final org.intermine.objectstore.proxy.ProxyReference upstreamIntergenicRegion);
    public org.intermine.model.InterMineObject proxGetUpstreamIntergenicRegion();

    public org.intermine.model.bio.IntergenicRegion getDownstreamIntergenicRegion();
    public void setDownstreamIntergenicRegion(final org.intermine.model.bio.IntergenicRegion downstreamIntergenicRegion);
    public void proxyDownstreamIntergenicRegion(final org.intermine.objectstore.proxy.ProxyReference downstreamIntergenicRegion);
    public org.intermine.model.InterMineObject proxGetDownstreamIntergenicRegion();

    public java.util.Set<org.intermine.model.bio.GeneFlankingRegion> getFlankingRegions();
    public void setFlankingRegions(final java.util.Set<org.intermine.model.bio.GeneFlankingRegion> flankingRegions);
    public void addFlankingRegions(final org.intermine.model.bio.GeneFlankingRegion arg);

    public java.util.Set<org.intermine.model.bio.Phenotype> getPhenotypes();
    public void setPhenotypes(final java.util.Set<org.intermine.model.bio.Phenotype> phenotypes);
    public void addPhenotypes(final org.intermine.model.bio.Phenotype arg);

    public java.util.Set<org.intermine.model.bio.OrthologuePhenotype> getOrthologuePhenotypes();
    public void setOrthologuePhenotypes(final java.util.Set<org.intermine.model.bio.OrthologuePhenotype> orthologuePhenotypes);
    public void addOrthologuePhenotypes(final org.intermine.model.bio.OrthologuePhenotype arg);

    public java.util.Set<org.intermine.model.bio.Intron> getIntrons();
    public void setIntrons(final java.util.Set<org.intermine.model.bio.Intron> introns);
    public void addIntrons(final org.intermine.model.bio.Intron arg);

    public java.util.Set<org.intermine.model.bio.Protein> getProteins();
    public void setProteins(final java.util.Set<org.intermine.model.bio.Protein> proteins);
    public void addProteins(final org.intermine.model.bio.Protein arg);

    public java.util.Set<org.intermine.model.bio.MonarchDiseaseAnnotation> getMonarchDiseaseAnnotations();
    public void setMonarchDiseaseAnnotations(final java.util.Set<org.intermine.model.bio.MonarchDiseaseAnnotation> monarchDiseaseAnnotations);
    public void addMonarchDiseaseAnnotations(final org.intermine.model.bio.MonarchDiseaseAnnotation arg);

    public java.util.Set<org.intermine.model.bio.CDS> getcDSs();
    public void setcDSs(final java.util.Set<org.intermine.model.bio.CDS> CDSs);
    public void addcDSs(final org.intermine.model.bio.CDS arg);

    public java.util.Set<org.intermine.model.bio.Homologue> getHomologues();
    public void setHomologues(final java.util.Set<org.intermine.model.bio.Homologue> homologues);
    public void addHomologues(final org.intermine.model.bio.Homologue arg);

    public java.util.Set<org.intermine.model.bio.Exon> getExons();
    public void setExons(final java.util.Set<org.intermine.model.bio.Exon> exons);
    public void addExons(final org.intermine.model.bio.Exon arg);

    public java.util.Set<org.intermine.model.bio.OrthologueDisease> getOrthologueDiseases();
    public void setOrthologueDiseases(final java.util.Set<org.intermine.model.bio.OrthologueDisease> orthologueDiseases);
    public void addOrthologueDiseases(final org.intermine.model.bio.OrthologueDisease arg);

    public java.util.Set<org.intermine.model.bio.UTR> getuTRs();
    public void setuTRs(final java.util.Set<org.intermine.model.bio.UTR> UTRs);
    public void adduTRs(final org.intermine.model.bio.UTR arg);

    public java.util.Set<org.intermine.model.bio.MonarchPhenotypeAnnotation> getMonarchPhenotypeAnnotations();
    public void setMonarchPhenotypeAnnotations(final java.util.Set<org.intermine.model.bio.MonarchPhenotypeAnnotation> monarchPhenotypeAnnotations);
    public void addMonarchPhenotypeAnnotations(final org.intermine.model.bio.MonarchPhenotypeAnnotation arg);

}
