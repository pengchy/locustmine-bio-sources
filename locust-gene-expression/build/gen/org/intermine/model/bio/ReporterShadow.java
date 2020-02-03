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

public class ReporterShadow implements Reporter, ShadowClass
{
    public static final Class<Reporter> shadowOf = Reporter.class;
    // Attr: org.intermine.model.bio.Reporter.isControl
    protected java.lang.Boolean isControl;
    public java.lang.Boolean getIsControl() { return isControl; }
    public void setIsControl(final java.lang.Boolean isControl) { this.isControl = isControl; }

    // Attr: org.intermine.model.bio.Reporter.controlType
    protected java.lang.String controlType;
    public java.lang.String getControlType() { return controlType; }
    public void setControlType(final java.lang.String controlType) { this.controlType = controlType; }

    // Attr: org.intermine.model.bio.Reporter.failType
    protected java.lang.String failType;
    public java.lang.String getFailType() { return failType; }
    public void setFailType(final java.lang.String failType) { this.failType = failType; }

    // Ref: org.intermine.model.bio.Reporter.material
    protected org.intermine.model.InterMineObject material;
    public org.intermine.model.bio.BioEntity getMaterial() { if (material instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.BioEntity) ((org.intermine.objectstore.proxy.ProxyReference) material).getObject()); }; return (org.intermine.model.bio.BioEntity) material; }
    public void setMaterial(final org.intermine.model.bio.BioEntity material) { this.material = material; }
    public void proxyMaterial(final org.intermine.objectstore.proxy.ProxyReference material) { this.material = material; }
    public org.intermine.model.InterMineObject proxGetMaterial() { return material; }

    // Col: org.intermine.model.bio.Reporter.results
    protected java.util.Set<org.intermine.model.bio.MicroArrayResult> results = new java.util.HashSet<org.intermine.model.bio.MicroArrayResult>();
    public java.util.Set<org.intermine.model.bio.MicroArrayResult> getResults() { return results; }
    public void setResults(final java.util.Set<org.intermine.model.bio.MicroArrayResult> results) { this.results = results; }
    public void addResults(final org.intermine.model.bio.MicroArrayResult arg) { results.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof Reporter && id != null) ? id.equals(((Reporter)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "Reporter [controlType=" + (controlType == null ? "null" : "\"" + controlType + "\"") + ", failType=" + (failType == null ? "null" : "\"" + failType + "\"") + ", id=" + id + ", isControl=" + (isControl == null ? "null" : "\"" + isControl + "\"") + ", material=" + (material == null ? "null" : (material.getId() == null ? "no id" : material.getId().toString())) + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("isControl".equals(fieldName)) {
            return isControl;
        }
        if ("controlType".equals(fieldName)) {
            return controlType;
        }
        if ("failType".equals(fieldName)) {
            return failType;
        }
        if ("material".equals(fieldName)) {
            if (material instanceof ProxyReference) {
                return ((ProxyReference) material).getObject();
            } else {
                return material;
            }
        }
        if ("results".equals(fieldName)) {
            return results;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Reporter.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("isControl".equals(fieldName)) {
            return isControl;
        }
        if ("controlType".equals(fieldName)) {
            return controlType;
        }
        if ("failType".equals(fieldName)) {
            return failType;
        }
        if ("material".equals(fieldName)) {
            return material;
        }
        if ("results".equals(fieldName)) {
            return results;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Reporter.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("isControl".equals(fieldName)) {
            isControl = (java.lang.Boolean) value;
        } else if ("controlType".equals(fieldName)) {
            controlType = (java.lang.String) value;
        } else if ("failType".equals(fieldName)) {
            failType = (java.lang.String) value;
        } else if ("material".equals(fieldName)) {
            material = (org.intermine.model.InterMineObject) value;
        } else if ("results".equals(fieldName)) {
            results = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Reporter.class.equals(getClass())) {
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
        if ("controlType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("failType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("material".equals(fieldName)) {
            return org.intermine.model.bio.BioEntity.class;
        }
        if ("results".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Reporter.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Reporter.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.ReporterShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Reporter");
        if (isControl != null) {
            sb.append("$_^aisControl$_^").append(isControl);
        }
        if (controlType != null) {
            sb.append("$_^acontrolType$_^");
            String string = controlType;
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
        if (failType != null) {
            sb.append("$_^afailType$_^");
            String string = failType;
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
        if (!org.intermine.model.bio.ReporterShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Reporter)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aisControl".equals(notXml[i])) {
                i++;
                isControl = Boolean.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "acontrolType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                controlType = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "afailType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                failType = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rmaterial".equals(notXml[i])) {
                i++;
                material = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.BioEntity.class);
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
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("results".equals(fieldName)) {
            results.add((org.intermine.model.bio.MicroArrayResult) element);
        } else {
            if (!org.intermine.model.bio.Reporter.class.equals(getClass())) {
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
        if (!org.intermine.model.bio.Reporter.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Reporter.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
