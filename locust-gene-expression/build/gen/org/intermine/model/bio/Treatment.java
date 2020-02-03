package org.intermine.model.bio;

public interface Treatment extends org.intermine.model.InterMineObject
{
    public java.lang.String getAction();
    public void setAction(final java.lang.String action);

    public java.util.Set<org.intermine.model.bio.Protocol> getProtocols();
    public void setProtocols(final java.util.Set<org.intermine.model.bio.Protocol> protocols);
    public void addProtocols(final org.intermine.model.bio.Protocol arg);

    public java.util.Set<org.intermine.model.bio.TreatmentParameter> getParameters();
    public void setParameters(final java.util.Set<org.intermine.model.bio.TreatmentParameter> parameters);
    public void addParameters(final org.intermine.model.bio.TreatmentParameter arg);

}
