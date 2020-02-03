package org.intermine.model.bio;

public interface AnatomyTerm extends org.intermine.model.bio.OntologyTerm
{
    public java.util.Set<org.intermine.model.bio.AnatomyExpression> getAnatomyExpressions();
    public void setAnatomyExpressions(final java.util.Set<org.intermine.model.bio.AnatomyExpression> anatomyExpressions);
    public void addAnatomyExpressions(final org.intermine.model.bio.AnatomyExpression arg);

}
