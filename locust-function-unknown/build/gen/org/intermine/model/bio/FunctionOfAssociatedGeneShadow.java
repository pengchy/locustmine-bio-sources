package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class FunctionOfAssociatedGeneShadow implements FunctionOfAssociatedGene, ShadowClass
{
    public static final Class<FunctionOfAssociatedGene> shadowOf = FunctionOfAssociatedGene.class;
    // Attr: org.intermine.model.bio.FunctionOfAssociatedGene.geneInFunctionDB
    protected java.lang.Double geneInFunctionDB;
    public java.lang.Double getGeneInFunctionDB() { return geneInFunctionDB; }
    public void setGeneInFunctionDB(final java.lang.Double geneInFunctionDB) { this.geneInFunctionDB = geneInFunctionDB; }

    // Attr: org.intermine.model.bio.FunctionOfAssociatedGene.geneAssociated
    protected java.lang.Double geneAssociated;
    public java.lang.Double getGeneAssociated() { return geneAssociated; }
    public void setGeneAssociated(final java.lang.Double geneAssociated) { this.geneAssociated = geneAssociated; }

    // Attr: org.intermine.model.bio.FunctionOfAssociatedGene.identifier
    protected java.lang.String identifier;
    public java.lang.String getIdentifier() { return identifier; }
    public void setIdentifier(final java.lang.String identifier) { this.identifier = identifier; }

    // Attr: org.intermine.model.bio.FunctionOfAssociatedGene.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.bio.FunctionOfAssociatedGene.FunctionDB
    protected java.lang.String FunctionDB;
    public java.lang.String getfunctionDB() { return FunctionDB; }
    public void setfunctionDB(final java.lang.String FunctionDB) { this.FunctionDB = FunctionDB; }

    // Attr: org.intermine.model.bio.FunctionOfAssociatedGene.geneInFunctionSet
    protected java.lang.Double geneInFunctionSet;
    public java.lang.Double getGeneInFunctionSet() { return geneInFunctionSet; }
    public void setGeneInFunctionSet(final java.lang.Double geneInFunctionSet) { this.geneInFunctionSet = geneInFunctionSet; }

    // Ref: org.intermine.model.bio.FunctionOfAssociatedGene.gene
    protected org.intermine.model.InterMineObject gene;
    public org.intermine.model.bio.Gene getGene() { if (gene instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Gene) ((org.intermine.objectstore.proxy.ProxyReference) gene).getObject()); }; return (org.intermine.model.bio.Gene) gene; }
    public void setGene(final org.intermine.model.bio.Gene gene) { this.gene = gene; }
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene) { this.gene = gene; }
    public org.intermine.model.InterMineObject proxGetGene() { return gene; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof FunctionOfAssociatedGene && id != null) ? id.equals(((FunctionOfAssociatedGene)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "FunctionOfAssociatedGene [FunctionDB=" + (FunctionDB == null ? "null" : "\"" + FunctionDB + "\"") + ", gene=" + (gene == null ? "null" : (gene.getId() == null ? "no id" : gene.getId().toString())) + ", geneAssociated=" + geneAssociated + ", geneInFunctionDB=" + geneInFunctionDB + ", geneInFunctionSet=" + geneInFunctionSet + ", id=" + id + ", identifier=" + (identifier == null ? "null" : "\"" + identifier + "\"") + ", name=" + (name == null ? "null" : "\"" + name + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("geneInFunctionDB".equals(fieldName)) {
            return geneInFunctionDB;
        }
        if ("geneAssociated".equals(fieldName)) {
            return geneAssociated;
        }
        if ("identifier".equals(fieldName)) {
            return identifier;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("FunctionDB".equals(fieldName)) {
            return FunctionDB;
        }
        if ("geneInFunctionSet".equals(fieldName)) {
            return geneInFunctionSet;
        }
        if ("gene".equals(fieldName)) {
            if (gene instanceof ProxyReference) {
                return ((ProxyReference) gene).getObject();
            } else {
                return gene;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.FunctionOfAssociatedGene.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("geneInFunctionDB".equals(fieldName)) {
            return geneInFunctionDB;
        }
        if ("geneAssociated".equals(fieldName)) {
            return geneAssociated;
        }
        if ("identifier".equals(fieldName)) {
            return identifier;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("FunctionDB".equals(fieldName)) {
            return FunctionDB;
        }
        if ("geneInFunctionSet".equals(fieldName)) {
            return geneInFunctionSet;
        }
        if ("gene".equals(fieldName)) {
            return gene;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.FunctionOfAssociatedGene.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("geneInFunctionDB".equals(fieldName)) {
            geneInFunctionDB = (java.lang.Double) value;
        } else if ("geneAssociated".equals(fieldName)) {
            geneAssociated = (java.lang.Double) value;
        } else if ("identifier".equals(fieldName)) {
            identifier = (java.lang.String) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("FunctionDB".equals(fieldName)) {
            FunctionDB = (java.lang.String) value;
        } else if ("geneInFunctionSet".equals(fieldName)) {
            geneInFunctionSet = (java.lang.Double) value;
        } else if ("gene".equals(fieldName)) {
            gene = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.FunctionOfAssociatedGene.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("geneInFunctionDB".equals(fieldName)) {
            return java.lang.Double.class;
        }
        if ("geneAssociated".equals(fieldName)) {
            return java.lang.Double.class;
        }
        if ("identifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("FunctionDB".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("geneInFunctionSet".equals(fieldName)) {
            return java.lang.Double.class;
        }
        if ("gene".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.FunctionOfAssociatedGene.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.FunctionOfAssociatedGene.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.FunctionOfAssociatedGeneShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.FunctionOfAssociatedGene");
        if (geneInFunctionDB != null) {
            sb.append("$_^ageneInFunctionDB$_^").append(geneInFunctionDB);
        }
        if (geneAssociated != null) {
            sb.append("$_^ageneAssociated$_^").append(geneAssociated);
        }
        if (identifier != null) {
            sb.append("$_^aidentifier$_^");
            String string = identifier;
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
        if (FunctionDB != null) {
            sb.append("$_^aFunctionDB$_^");
            String string = FunctionDB;
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
        if (geneInFunctionSet != null) {
            sb.append("$_^ageneInFunctionSet$_^").append(geneInFunctionSet);
        }
        if (gene != null) {
            sb.append("$_^rgene$_^").append(gene.getId());
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
        if (!org.intermine.model.bio.FunctionOfAssociatedGeneShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.FunctionOfAssociatedGene)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "ageneInFunctionDB".equals(notXml[i])) {
                i++;
                geneInFunctionDB = Double.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "ageneAssociated".equals(notXml[i])) {
                i++;
                geneAssociated = Double.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aidentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                identifier = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) && "aFunctionDB".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                FunctionDB = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "ageneInFunctionSet".equals(notXml[i])) {
                i++;
                geneInFunctionSet = Double.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) &&"rgene".equals(notXml[i])) {
                i++;
                gene = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Gene.class);
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
            if (!org.intermine.model.bio.FunctionOfAssociatedGene.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.FunctionOfAssociatedGene.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.FunctionOfAssociatedGene.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
