package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class SampleGroupShadow implements SampleGroup, ShadowClass
{
    public static final Class<SampleGroup> shadowOf = SampleGroup.class;
    // Attr: org.intermine.model.bio.SampleGroup.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Col: org.intermine.model.bio.SampleGroup.samples
    protected java.util.Set<org.intermine.model.bio.Sample> samples = new java.util.HashSet<org.intermine.model.bio.Sample>();
    public java.util.Set<org.intermine.model.bio.Sample> getSamples() { return samples; }
    public void setSamples(final java.util.Set<org.intermine.model.bio.Sample> samples) { this.samples = samples; }
    public void addSamples(final org.intermine.model.bio.Sample arg) { samples.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof SampleGroup && id != null) ? id.equals(((SampleGroup)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "SampleGroup [id=" + id + ", name=" + (name == null ? "null" : "\"" + name + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("samples".equals(fieldName)) {
            return samples;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.SampleGroup.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("samples".equals(fieldName)) {
            return samples;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.SampleGroup.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("samples".equals(fieldName)) {
            samples = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.SampleGroup.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("samples".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.SampleGroup.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.SampleGroup.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.SampleGroupShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.SampleGroup");
        if (name != null) {
            sb.append("$_^aname$_^");
            String string = name;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (id != null) {
            sb.append("$_^aid$_^").append(id);
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.SampleGroupShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.SampleGroup)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aname".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                name = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aid".equals(notXml[i])) {
                i++;
                id = Integer.valueOf(notXml[i]);
                i++;
            }
            if (startI == i) {
                throw new IllegalArgumentException("Unknown field " + notXml[i]);
            }
        }
        samples = new ProxyCollection<org.intermine.model.bio.Sample>(os, this, "samples", org.intermine.model.bio.Sample.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("samples".equals(fieldName)) {
            samples.add((org.intermine.model.bio.Sample) element);
        } else {
            if (!org.intermine.model.bio.SampleGroup.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("samples".equals(fieldName)) {
            return org.intermine.model.bio.Sample.class;
        }
        if (!org.intermine.model.bio.SampleGroup.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.SampleGroup.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
