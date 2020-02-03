package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class TreatmentShadow implements Treatment, ShadowClass
{
    public static final Class<Treatment> shadowOf = Treatment.class;
    // Attr: org.intermine.model.bio.Treatment.action
    protected java.lang.String action;
    public java.lang.String getAction() { return action; }
    public void setAction(final java.lang.String action) { this.action = action; }

    // Col: org.intermine.model.bio.Treatment.protocols
    protected java.util.Set<org.intermine.model.bio.Protocol> protocols = new java.util.HashSet<org.intermine.model.bio.Protocol>();
    public java.util.Set<org.intermine.model.bio.Protocol> getProtocols() { return protocols; }
    public void setProtocols(final java.util.Set<org.intermine.model.bio.Protocol> protocols) { this.protocols = protocols; }
    public void addProtocols(final org.intermine.model.bio.Protocol arg) { protocols.add(arg); }

    // Col: org.intermine.model.bio.Treatment.parameters
    protected java.util.Set<org.intermine.model.bio.TreatmentParameter> parameters = new java.util.HashSet<org.intermine.model.bio.TreatmentParameter>();
    public java.util.Set<org.intermine.model.bio.TreatmentParameter> getParameters() { return parameters; }
    public void setParameters(final java.util.Set<org.intermine.model.bio.TreatmentParameter> parameters) { this.parameters = parameters; }
    public void addParameters(final org.intermine.model.bio.TreatmentParameter arg) { parameters.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof Treatment && id != null) ? id.equals(((Treatment)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "Treatment [action=" + (action == null ? "null" : "\"" + action + "\"") + ", id=" + id + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("action".equals(fieldName)) {
            return action;
        }
        if ("protocols".equals(fieldName)) {
            return protocols;
        }
        if ("parameters".equals(fieldName)) {
            return parameters;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Treatment.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("action".equals(fieldName)) {
            return action;
        }
        if ("protocols".equals(fieldName)) {
            return protocols;
        }
        if ("parameters".equals(fieldName)) {
            return parameters;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Treatment.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("action".equals(fieldName)) {
            action = (java.lang.String) value;
        } else if ("protocols".equals(fieldName)) {
            protocols = (java.util.Set) value;
        } else if ("parameters".equals(fieldName)) {
            parameters = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Treatment.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("action".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("protocols".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("parameters".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Treatment.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Treatment.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.TreatmentShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Treatment");
        if (action != null) {
            sb.append("$_^aaction$_^");
            String string = action;
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
        if (!org.intermine.model.bio.TreatmentShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Treatment)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aaction".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                action = string == null ? notXml[i] : string.toString();
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
        protocols = new ProxyCollection<org.intermine.model.bio.Protocol>(os, this, "protocols", org.intermine.model.bio.Protocol.class);
        parameters = new ProxyCollection<org.intermine.model.bio.TreatmentParameter>(os, this, "parameters", org.intermine.model.bio.TreatmentParameter.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("protocols".equals(fieldName)) {
            protocols.add((org.intermine.model.bio.Protocol) element);
        } else if ("parameters".equals(fieldName)) {
            parameters.add((org.intermine.model.bio.TreatmentParameter) element);
        } else {
            if (!org.intermine.model.bio.Treatment.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("protocols".equals(fieldName)) {
            return org.intermine.model.bio.Protocol.class;
        }
        if ("parameters".equals(fieldName)) {
            return org.intermine.model.bio.TreatmentParameter.class;
        }
        if (!org.intermine.model.bio.Treatment.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Treatment.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
