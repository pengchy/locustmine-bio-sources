package org.intermine.model.bio;

public interface TreatmentParameter extends org.intermine.model.InterMineObject
{
    public java.lang.String getUnits();
    public void setUnits(final java.lang.String units);

    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public java.lang.String getValue();
    public void setValue(final java.lang.String value);

    public org.intermine.model.bio.Treatment getTreatment();
    public void setTreatment(final org.intermine.model.bio.Treatment treatment);
    public void proxyTreatment(final org.intermine.objectstore.proxy.ProxyReference treatment);
    public org.intermine.model.InterMineObject proxGetTreatment();

}
