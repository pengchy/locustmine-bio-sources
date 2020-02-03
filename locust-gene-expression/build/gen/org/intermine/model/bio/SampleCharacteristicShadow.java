package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class SampleCharacteristicShadow implements SampleCharacteristic, ShadowClass
{
    public static final Class<SampleCharacteristic> shadowOf = SampleCharacteristic.class;
    // Attr: org.intermine.model.bio.SampleCharacteristic.type
    protected java.lang.String type;
    public java.lang.String getType() { return type; }
    public void setType(final java.lang.String type) { this.type = type; }

    // Attr: org.intermine.model.bio.SampleCharacteristic.value
    protected java.lang.String value;
    public java.lang.String getValue() { return value; }
    public void setValue(final java.lang.String value) { this.value = value; }

    // Ref: org.intermine.model.bio.SampleCharacteristic.ontologyTerm
    protected org.intermine.model.InterMineObject ontologyTerm;
    public org.intermine.model.bio.OntologyTerm getOntologyTerm() { if (ontologyTerm instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.OntologyTerm) ((org.intermine.objectstore.proxy.ProxyReference) ontologyTerm).getObject()); }; return (org.intermine.model.bio.OntologyTerm) ontologyTerm; }
    public void setOntologyTerm(final org.intermine.model.bio.OntologyTerm ontologyTerm) { this.ontologyTerm = ontologyTerm; }
    public void proxyOntologyTerm(final org.intermine.objectstore.proxy.ProxyReference ontologyTerm) { this.ontologyTerm = ontologyTerm; }
    public org.intermine.model.InterMineObject proxGetOntologyTerm() { return ontologyTerm; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof SampleCharacteristic && id != null) ? id.equals(((SampleCharacteristic)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "SampleCharacteristic [id=" + id + ", ontologyTerm=" + (ontologyTerm == null ? "null" : (ontologyTerm.getId() == null ? "no id" : ontologyTerm.getId().toString())) + ", type=" + (type == null ? "null" : "\"" + type + "\"") + ", value=" + (value == null ? "null" : "\"" + value + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("value".equals(fieldName)) {
            return value;
        }
        if ("ontologyTerm".equals(fieldName)) {
            if (ontologyTerm instanceof ProxyReference) {
                return ((ProxyReference) ontologyTerm).getObject();
            } else {
                return ontologyTerm;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.SampleCharacteristic.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("value".equals(fieldName)) {
            return value;
        }
        if ("ontologyTerm".equals(fieldName)) {
            return ontologyTerm;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.SampleCharacteristic.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("type".equals(fieldName)) {
            type = (java.lang.String) value;
        } else if ("value".equals(fieldName)) {
            this.value = (java.lang.String) value;
        } else if ("ontologyTerm".equals(fieldName)) {
            ontologyTerm = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.SampleCharacteristic.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("type".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("value".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("ontologyTerm".equals(fieldName)) {
            return org.intermine.model.bio.OntologyTerm.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.SampleCharacteristic.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.SampleCharacteristic.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.SampleCharacteristicShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.SampleCharacteristic");
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
            sb.append("$_^avalue$_^");
            String string = value;
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
        if (ontologyTerm != null) {
            sb.append("$_^rontologyTerm$_^").append(ontologyTerm.getId());
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
        if (!org.intermine.model.bio.SampleCharacteristicShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.SampleCharacteristic)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
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
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                value = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rontologyTerm".equals(notXml[i])) {
                i++;
                ontologyTerm = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.OntologyTerm.class);
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
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        {
            if (!org.intermine.model.bio.SampleCharacteristic.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.SampleCharacteristic.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.SampleCharacteristic.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
