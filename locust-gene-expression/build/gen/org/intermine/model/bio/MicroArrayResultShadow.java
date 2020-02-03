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

public class MicroArrayResultShadow implements MicroArrayResult, ShadowClass
{
    public static final Class<MicroArrayResult> shadowOf = MicroArrayResult.class;
    // Attr: org.intermine.model.bio.MicroArrayResult.isControl
    protected java.lang.Boolean isControl;
    public java.lang.Boolean getIsControl() { return isControl; }
    public void setIsControl(final java.lang.Boolean isControl) { this.isControl = isControl; }

    // Attr: org.intermine.model.bio.MicroArrayResult.type
    protected java.lang.String type;
    public java.lang.String getType() { return type; }
    public void setType(final java.lang.String type) { this.type = type; }

    // Attr: org.intermine.model.bio.MicroArrayResult.value
    protected java.lang.Float value;
    public java.lang.Float getValue() { return value; }
    public void setValue(final java.lang.Float value) { this.value = value; }

    // Attr: org.intermine.model.bio.MicroArrayResult.scale
    protected java.lang.String scale;
    public java.lang.String getScale() { return scale; }
    public void setScale(final java.lang.String scale) { this.scale = scale; }

    // Ref: org.intermine.model.bio.MicroArrayResult.experiment
    protected org.intermine.model.InterMineObject experiment;
    public org.intermine.model.bio.MicroArrayExperiment getExperiment() { if (experiment instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.MicroArrayExperiment) ((org.intermine.objectstore.proxy.ProxyReference) experiment).getObject()); }; return (org.intermine.model.bio.MicroArrayExperiment) experiment; }
    public void setExperiment(final org.intermine.model.bio.MicroArrayExperiment experiment) { this.experiment = experiment; }
    public void proxyExperiment(final org.intermine.objectstore.proxy.ProxyReference experiment) { this.experiment = experiment; }
    public org.intermine.model.InterMineObject proxGetExperiment() { return experiment; }

    // Ref: org.intermine.model.bio.MicroArrayResult.material
    protected org.intermine.model.InterMineObject material;
    public org.intermine.model.bio.ProbeSet getMaterial() { if (material instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.ProbeSet) ((org.intermine.objectstore.proxy.ProxyReference) material).getObject()); }; return (org.intermine.model.bio.ProbeSet) material; }
    public void setMaterial(final org.intermine.model.bio.ProbeSet material) { this.material = material; }
    public void proxyMaterial(final org.intermine.objectstore.proxy.ProxyReference material) { this.material = material; }
    public org.intermine.model.InterMineObject proxGetMaterial() { return material; }

    // Col: org.intermine.model.bio.MicroArrayResult.assays
    protected java.util.Set<org.intermine.model.bio.MicroArrayAssay> assays = new java.util.HashSet<org.intermine.model.bio.MicroArrayAssay>();
    public java.util.Set<org.intermine.model.bio.MicroArrayAssay> getAssays() { return assays; }
    public void setAssays(final java.util.Set<org.intermine.model.bio.MicroArrayAssay> assays) { this.assays = assays; }
    public void addAssays(final org.intermine.model.bio.MicroArrayAssay arg) { assays.add(arg); }

    // Col: org.intermine.model.bio.MicroArrayResult.reporters
    protected java.util.Set<org.intermine.model.bio.Reporter> reporters = new java.util.HashSet<org.intermine.model.bio.Reporter>();
    public java.util.Set<org.intermine.model.bio.Reporter> getReporters() { return reporters; }
    public void setReporters(final java.util.Set<org.intermine.model.bio.Reporter> reporters) { this.reporters = reporters; }
    public void addReporters(final org.intermine.model.bio.Reporter arg) { reporters.add(arg); }

    // Col: org.intermine.model.bio.MicroArrayResult.genes
    protected java.util.Set<org.intermine.model.bio.Gene> genes = new java.util.HashSet<org.intermine.model.bio.Gene>();
    public java.util.Set<org.intermine.model.bio.Gene> getGenes() { return genes; }
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes) { this.genes = genes; }
    public void addGenes(final org.intermine.model.bio.Gene arg) { genes.add(arg); }

    // Col: org.intermine.model.bio.MicroArrayResult.samples
    protected java.util.Set<org.intermine.model.bio.Sample> samples = new java.util.HashSet<org.intermine.model.bio.Sample>();
    public java.util.Set<org.intermine.model.bio.Sample> getSamples() { return samples; }
    public void setSamples(final java.util.Set<org.intermine.model.bio.Sample> samples) { this.samples = samples; }
    public void addSamples(final org.intermine.model.bio.Sample arg) { samples.add(arg); }

    // Col: org.intermine.model.bio.MicroArrayResult.dataSets
    protected java.util.Set<org.intermine.model.bio.DataSet> dataSets = new java.util.HashSet<org.intermine.model.bio.DataSet>();
    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets() { return dataSets; }
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets) { this.dataSets = dataSets; }
    public void addDataSets(final org.intermine.model.bio.DataSet arg) { dataSets.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof MicroArrayResult && id != null) ? id.equals(((MicroArrayResult)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "MicroArrayResult [experiment=" + (experiment == null ? "null" : (experiment.getId() == null ? "no id" : experiment.getId().toString())) + ", id=" + id + ", isControl=" + (isControl == null ? "null" : "\"" + isControl + "\"") + ", material=" + (material == null ? "null" : (material.getId() == null ? "no id" : material.getId().toString())) + ", scale=" + (scale == null ? "null" : "\"" + scale + "\"") + ", type=" + (type == null ? "null" : "\"" + type + "\"") + ", value=" + value + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("isControl".equals(fieldName)) {
            return isControl;
        }
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("value".equals(fieldName)) {
            return value;
        }
        if ("scale".equals(fieldName)) {
            return scale;
        }
        if ("experiment".equals(fieldName)) {
            if (experiment instanceof ProxyReference) {
                return ((ProxyReference) experiment).getObject();
            } else {
                return experiment;
            }
        }
        if ("material".equals(fieldName)) {
            if (material instanceof ProxyReference) {
                return ((ProxyReference) material).getObject();
            } else {
                return material;
            }
        }
        if ("assays".equals(fieldName)) {
            return assays;
        }
        if ("reporters".equals(fieldName)) {
            return reporters;
        }
        if ("genes".equals(fieldName)) {
            return genes;
        }
        if ("samples".equals(fieldName)) {
            return samples;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.MicroArrayResult.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("isControl".equals(fieldName)) {
            return isControl;
        }
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("value".equals(fieldName)) {
            return value;
        }
        if ("scale".equals(fieldName)) {
            return scale;
        }
        if ("experiment".equals(fieldName)) {
            return experiment;
        }
        if ("material".equals(fieldName)) {
            return material;
        }
        if ("assays".equals(fieldName)) {
            return assays;
        }
        if ("reporters".equals(fieldName)) {
            return reporters;
        }
        if ("genes".equals(fieldName)) {
            return genes;
        }
        if ("samples".equals(fieldName)) {
            return samples;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.MicroArrayResult.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("isControl".equals(fieldName)) {
            isControl = (java.lang.Boolean) value;
        } else if ("type".equals(fieldName)) {
            type = (java.lang.String) value;
        } else if ("value".equals(fieldName)) {
            this.value = (java.lang.Float) value;
        } else if ("scale".equals(fieldName)) {
            scale = (java.lang.String) value;
        } else if ("experiment".equals(fieldName)) {
            experiment = (org.intermine.model.InterMineObject) value;
        } else if ("material".equals(fieldName)) {
            material = (org.intermine.model.InterMineObject) value;
        } else if ("assays".equals(fieldName)) {
            assays = (java.util.Set) value;
        } else if ("reporters".equals(fieldName)) {
            reporters = (java.util.Set) value;
        } else if ("genes".equals(fieldName)) {
            genes = (java.util.Set) value;
        } else if ("samples".equals(fieldName)) {
            samples = (java.util.Set) value;
        } else if ("dataSets".equals(fieldName)) {
            dataSets = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.MicroArrayResult.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("isControl".equals(fieldName)) {
            return java.lang.Boolean.class;
        }
        if ("type".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("value".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("scale".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("experiment".equals(fieldName)) {
            return org.intermine.model.bio.MicroArrayExperiment.class;
        }
        if ("material".equals(fieldName)) {
            return org.intermine.model.bio.ProbeSet.class;
        }
        if ("assays".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("reporters".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("genes".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("samples".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("dataSets".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.MicroArrayResult.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.MicroArrayResult.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.MicroArrayResultShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.MicroArrayResult");
        if (isControl != null) {
            sb.append("$_^aisControl$_^").append(isControl);
        }
        if (type != null) {
            sb.append("$_^atype$_^");
            String string = type;
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
        if (value != null) {
            sb.append("$_^avalue$_^").append(value);
        }
        if (scale != null) {
            sb.append("$_^ascale$_^");
            String string = scale;
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
        if (material != null) {
            sb.append("$_^rmaterial$_^").append(material.getId());
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
        if (!org.intermine.model.bio.MicroArrayResultShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.MicroArrayResult)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aisControl".equals(notXml[i])) {
                i++;
                isControl = Boolean.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "atype".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                type = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "avalue".equals(notXml[i])) {
                i++;
                value = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "ascale".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                scale = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rexperiment".equals(notXml[i])) {
                i++;
                experiment = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.MicroArrayExperiment.class);
                i++;
            };
            if ((i < notXml.length) &&"rmaterial".equals(notXml[i])) {
                i++;
                material = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.ProbeSet.class);
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
        assays = new ProxyCollection<org.intermine.model.bio.MicroArrayAssay>(os, this, "assays", org.intermine.model.bio.MicroArrayAssay.class);
        reporters = new ProxyCollection<org.intermine.model.bio.Reporter>(os, this, "reporters", org.intermine.model.bio.Reporter.class);
        genes = new ProxyCollection<org.intermine.model.bio.Gene>(os, this, "genes", org.intermine.model.bio.Gene.class);
        samples = new ProxyCollection<org.intermine.model.bio.Sample>(os, this, "samples", org.intermine.model.bio.Sample.class);
        dataSets = new ProxyCollection<org.intermine.model.bio.DataSet>(os, this, "dataSets", org.intermine.model.bio.DataSet.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("assays".equals(fieldName)) {
            assays.add((org.intermine.model.bio.MicroArrayAssay) element);
        } else if ("reporters".equals(fieldName)) {
            reporters.add((org.intermine.model.bio.Reporter) element);
        } else if ("genes".equals(fieldName)) {
            genes.add((org.intermine.model.bio.Gene) element);
        } else if ("samples".equals(fieldName)) {
            samples.add((org.intermine.model.bio.Sample) element);
        } else if ("dataSets".equals(fieldName)) {
            dataSets.add((org.intermine.model.bio.DataSet) element);
        } else {
            if (!org.intermine.model.bio.MicroArrayResult.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("assays".equals(fieldName)) {
            return org.intermine.model.bio.MicroArrayAssay.class;
        }
        if ("reporters".equals(fieldName)) {
            return org.intermine.model.bio.Reporter.class;
        }
        if ("genes".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("samples".equals(fieldName)) {
            return org.intermine.model.bio.Sample.class;
        }
        if ("dataSets".equals(fieldName)) {
            return org.intermine.model.bio.DataSet.class;
        }
        if (!org.intermine.model.bio.MicroArrayResult.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.MicroArrayResult.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
