package org.intermine.model.bio;

public interface SampleCharacteristic extends org.intermine.model.InterMineObject
{
    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public java.lang.String getValue();
    public void setValue(final java.lang.String value);

    public org.intermine.model.bio.OntologyTerm getOntologyTerm();
    public void setOntologyTerm(final org.intermine.model.bio.OntologyTerm ontologyTerm);
    public void proxyOntologyTerm(final org.intermine.objectstore.proxy.ProxyReference ontologyTerm);
    public org.intermine.model.InterMineObject proxGetOntologyTerm();

}
