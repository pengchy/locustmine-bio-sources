package org.intermine.model.bio;

public interface Reporter extends org.intermine.model.InterMineObject
{
    public java.lang.Boolean getIsControl();
    public void setIsControl(final java.lang.Boolean isControl);

    public java.lang.String getControlType();
    public void setControlType(final java.lang.String controlType);

    public java.lang.String getFailType();
    public void setFailType(final java.lang.String failType);

    public org.intermine.model.bio.BioEntity getMaterial();
    public void setMaterial(final org.intermine.model.bio.BioEntity material);
    public void proxyMaterial(final org.intermine.objectstore.proxy.ProxyReference material);
    public org.intermine.model.InterMineObject proxGetMaterial();

    public java.util.Set<org.intermine.model.bio.MicroArrayResult> getResults();
    public void setResults(final java.util.Set<org.intermine.model.bio.MicroArrayResult> results);
    public void addResults(final org.intermine.model.bio.MicroArrayResult arg);

}
