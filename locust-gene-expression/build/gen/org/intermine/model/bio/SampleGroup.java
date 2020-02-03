package org.intermine.model.bio;

public interface SampleGroup extends org.intermine.model.InterMineObject
{
    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.util.Set<org.intermine.model.bio.Sample> getSamples();
    public void setSamples(final java.util.Set<org.intermine.model.bio.Sample> samples);
    public void addSamples(final org.intermine.model.bio.Sample arg);

}
