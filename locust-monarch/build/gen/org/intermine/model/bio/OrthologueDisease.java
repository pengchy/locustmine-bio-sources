package org.intermine.model.bio;

public interface OrthologueDisease extends org.intermine.model.bio.Homologue
{
    public java.util.Set<org.intermine.model.bio.MonarchDiseaseTerm> getMonarchDiseaseTerms();
    public void setMonarchDiseaseTerms(final java.util.Set<org.intermine.model.bio.MonarchDiseaseTerm> monarchDiseaseTerms);
    public void addMonarchDiseaseTerms(final org.intermine.model.bio.MonarchDiseaseTerm arg);

}
