package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class MicroArrayAssayShadow implements MicroArrayAssay, ShadowClass
{
    public static final Class<MicroArrayAssay> shadowOf = MicroArrayAssay.class;
    // Attr: org.intermine.model.bio.MicroArrayAssay.sample1
    protected java.lang.String sample1;
    public java.lang.String getSample1() { return sample1; }
    public void setSample1(final java.lang.String sample1) { this.sample1 = sample1; }

    // Attr: org.intermine.model.bio.MicroArrayAssay.sample2
    protected java.lang.String sample2;
    public java.lang.String getSample2() { return sample2; }
    public void setSample2(final java.lang.String sample2) { this.sample2 = sample2; }

    // Attr: org.intermine.model.bio.MicroArrayAssay.description
    protected java.lang.String description;
    public java.lang.String getDescription() { return description; }
    public void setDescription(final java.lang.String description) { this.description = description; }

    // Attr: org.intermine.model.bio.MicroArrayAssay.displayOrder
    protected java.lang.Integer displayOrder;
    public java.lang.Integer getDisplayOrder() { return displayOrder; }
    public void setDisplayOrder(final java.lang.Integer displayOrder) { this.displayOrder = displayOrder; }

    // Attr: org.intermine.model.bio.MicroArrayAssay.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Ref: org.intermine.model.bio.MicroArrayAssay.experiment
    protected org.intermine.model.InterMineObject experiment;
    public org.intermine.model.bio.MicroArrayExperiment getExperiment() { if (experiment instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.MicroArrayExperiment) ((org.intermine.objectstore.proxy.ProxyReference) experiment).getObject()); }; return (org.intermine.model.bio.MicroArrayExperiment) experiment; }
    public void setExperiment(final org.intermine.model.bio.MicroArrayExperiment experiment) { this.experiment = experiment; }
    public void proxyExperiment(final org.intermine.objectstore.proxy.ProxyReference experiment) { this.experiment = experiment; }
    public org.intermine.model.InterMineObject proxGetExperiment() { return experiment; }

    // Col: org.intermine.model.bio.MicroArrayAssay.results
    protected java.util.Set<org.intermine.model.bio.MicroArrayResult> results = new java.util.HashSet<org.intermine.model.bio.MicroArrayResult>();
    public java.util.Set<org.intermine.model.bio.MicroArrayResult> getResults() { return results; }
    public void setResults(final java.util.Set<org.intermine.model.bio.MicroArrayResult> results) { this.results = results; }
    public void addResults(final org.intermine.model.bio.MicroArrayResult arg) { results.add(arg); }

    // Col: org.intermine.model.bio.MicroArrayAssay.samples
    protected java.util.Set<org.intermine.model.bio.Sample> samples = new java.util.HashSet<org.intermine.model.bio.Sample>();
    public java.util.Set<org.intermine.model.bio.Sample> getSamples() { return samples; }
    public void setSamples(final java.util.Set<org.intermine.model.bio.Sample> samples) { this.samples = samples; }
    public void addSamples(final org.intermine.model.bio.Sample arg) { samples.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof MicroArrayAssay && id != null) ? id.equals(((MicroArrayAssay)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "MicroArrayAssay [description=" + (description == null ? "null" : "\"" + description + "\"") + ", displayOrder=" + displayOrder + ", experiment=" + (experiment == null ? "null" : (experiment.getId() == null ? "no id" : experiment.getId().toString())) + ", id=" + id + ", name=" + (name == null ? "null" : "\"" + name + "\"") + ", sample1=" + (sample1 == null ? "null" : "\"" + sample1 + "\"") + ", sample2=" + (sample2 == null ? "null" : "\"" + sample2 + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("sample1".equals(fieldName)) {
            return sample1;
        }
        if ("sample2".equals(fieldName)) {
            return sample2;
        }
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("displayOrder".equals(fieldName)) {
            return displayOrder;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("experiment".equals(fieldName)) {
            if (experiment instanceof ProxyReference) {
                return ((ProxyReference) experiment).getObject();
            } else {
                return experiment;
            }
        }
        if ("results".equals(fieldName)) {
            return results;
        }
        if ("samples".equals(fieldName)) {
            return samples;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.MicroArrayAssay.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("sample1".equals(fieldName)) {
            return sample1;
        }
        if ("sample2".equals(fieldName)) {
            return sample2;
        }
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("displayOrder".equals(fieldName)) {
            return displayOrder;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("experiment".equals(fieldName)) {
            return experiment;
        }
        if ("results".equals(fieldName)) {
            return results;
        }
        if ("samples".equals(fieldName)) {
            return samples;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.MicroArrayAssay.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("sample1".equals(fieldName)) {
            sample1 = (java.lang.String) value;
        } else if ("sample2".equals(fieldName)) {
            sample2 = (java.lang.String) value;
        } else if ("description".equals(fieldName)) {
            description = (java.lang.String) value;
        } else if ("displayOrder".equals(fieldName)) {
            displayOrder = (java.lang.Integer) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("experiment".equals(fieldName)) {
            experiment = (org.intermine.model.InterMineObject) value;
        } else if ("results".equals(fieldName)) {
            results = (java.util.Set) value;
        } else if ("samples".equals(fieldName)) {
            samples = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.MicroArrayAssay.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("sample1".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("sample2".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("description".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("displayOrder".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("experiment".equals(fieldName)) {
            return org.intermine.model.bio.MicroArrayExperiment.class;
        }
        if ("results".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("samples".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.MicroArrayAssay.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.MicroArrayAssay.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.MicroArrayAssayShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.MicroArrayAssay");
        if (sample1 != null) {
            sb.append("$_^asample1$_^");
            String string = sample1;
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
        if (sample2 != null) {
            sb.append("$_^asample2$_^");
            String string = sample2;
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
        if (description != null) {
            sb.append("$_^adescription$_^");
            String string = description;
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
        if (displayOrder != null) {
            sb.append("$_^adisplayOrder$_^").append(displayOrder);
        }
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
        if (experiment != null) {
            sb.append("$_^rexperiment$_^").append(experiment.getId());
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
        if (!org.intermine.model.bio.MicroArrayAssayShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.MicroArrayAssay)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "asample1".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                sample1 = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asample2".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                sample2 = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "adescription".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                description = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "adisplayOrder".equals(notXml[i])) {
                i++;
                displayOrder = Integer.valueOf(notXml[i]);
                i++;
            }
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
            if ((i < notXml.length) &&"rexperiment".equals(notXml[i])) {
                i++;
                experiment = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.MicroArrayExperiment.class);
                i++;
            };
            if ((i < notXml.length) && "aid".equals(notXml[i])) {
                i++;
                id = Integer.valueOf(notXml[i]);
                i++;
            }
            if (startI == i) {
                throw new IllegalArgumentException("Unknown field " + notXml[i]);
            }
        }
        results = new ProxyCollection<org.intermine.model.bio.MicroArrayResult>(os, this, "results", org.intermine.model.bio.MicroArrayResult.class);
        samples = new ProxyCollection<org.intermine.model.bio.Sample>(os, this, "samples", org.intermine.model.bio.Sample.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("results".equals(fieldName)) {
            results.add((org.intermine.model.bio.MicroArrayResult) element);
        } else if ("samples".equals(fieldName)) {
            samples.add((org.intermine.model.bio.Sample) element);
        } else {
            if (!org.intermine.model.bio.MicroArrayAssay.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("results".equals(fieldName)) {
            return org.intermine.model.bio.MicroArrayResult.class;
        }
        if ("samples".equals(fieldName)) {
            return org.intermine.model.bio.Sample.class;
        }
        if (!org.intermine.model.bio.MicroArrayAssay.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.MicroArrayAssay.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
