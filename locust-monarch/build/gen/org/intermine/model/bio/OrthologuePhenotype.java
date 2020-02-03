package org.intermine.model.bio;

public interface OrthologuePhenotype extends org.intermine.model.bio.Homologue
{
    public java.util.Set<org.intermine.model.bio.MonarchPhenotypeTerm> getMonarchPhenotypeTerms();
    public void setMonarchPhenotypeTerms(final java.util.Set<org.intermine.model.bio.MonarchPhenotypeTerm> monarchPhenotypeTerms);
    public void addMonarchPhenotypeTerms(final org.intermine.model.bio.MonarchPhenotypeTerm arg);

}
