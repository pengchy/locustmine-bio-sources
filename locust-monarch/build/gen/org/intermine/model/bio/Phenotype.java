package org.intermine.model.bio;

public interface Phenotype extends org.intermine.model.bio.OntologyTerm
{
    public java.lang.String getCode();
    public void setCode(final java.lang.String code);

    public org.intermine.model.bio.Organism getSpecies();
    public void setSpecies(final org.intermine.model.bio.Organism species);
    public void proxySpecies(final org.intermine.objectstore.proxy.ProxyReference species);
    public org.intermine.model.InterMineObject proxGetSpecies();

    public java.util.Set<org.intermine.model.bio.Homologue> getHomologues();
    public void setHomologues(final java.util.Set<org.intermine.model.bio.Homologue> homologues);
    public void addHomologues(final org.intermine.model.bio.Homologue arg);

    public java.util.Set<org.intermine.model.bio.Gene> getGenes();
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes);
    public void addGenes(final org.intermine.model.bio.Gene arg);

}
