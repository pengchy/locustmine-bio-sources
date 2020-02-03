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

public class AnatomyExpressionShadow implements AnatomyExpression, ShadowClass
{
    public static final Class<AnatomyExpression> shadowOf = AnatomyExpression.class;
    // Attr: org.intermine.model.bio.AnatomyExpression.expressionRPKMMin
    protected java.lang.Float expressionRPKMMin;
    public java.lang.Float getExpressionRPKMMin() { return expressionRPKMMin; }
    public void setExpressionRPKMMin(final java.lang.Float expressionRPKMMin) { this.expressionRPKMMin = expressionRPKMMin; }

    // Attr: org.intermine.model.bio.AnatomyExpression.expressionRankMean
    protected java.lang.Float expressionRankMean;
    public java.lang.Float getExpressionRankMean() { return expressionRankMean; }
    public void setExpressionRankMean(final java.lang.Float expressionRankMean) { this.expressionRankMean = expressionRankMean; }

    // Attr: org.intermine.model.bio.AnatomyExpression.expressionRankMedian
    protected java.lang.Float expressionRankMedian;
    public java.lang.Float getExpressionRankMedian() { return expressionRankMedian; }
    public void setExpressionRankMedian(final java.lang.Float expressionRankMedian) { this.expressionRankMedian = expressionRankMedian; }

    // Attr: org.intermine.model.bio.AnatomyExpression.expressionRankMax
    protected java.lang.Float expressionRankMax;
    public java.lang.Float getExpressionRankMax() { return expressionRankMax; }
    public void setExpressionRankMax(final java.lang.Float expressionRankMax) { this.expressionRankMax = expressionRankMax; }

    // Attr: org.intermine.model.bio.AnatomyExpression.expressionRank1stQu
    protected java.lang.Float expressionRank1stQu;
    public java.lang.Float getExpressionRank1stQu() { return expressionRank1stQu; }
    public void setExpressionRank1stQu(final java.lang.Float expressionRank1stQu) { this.expressionRank1stQu = expressionRank1stQu; }

    // Attr: org.intermine.model.bio.AnatomyExpression.expressionRPKM3rdQu
    protected java.lang.Float expressionRPKM3rdQu;
    public java.lang.Float getExpressionRPKM3rdQu() { return expressionRPKM3rdQu; }
    public void setExpressionRPKM3rdQu(final java.lang.Float expressionRPKM3rdQu) { this.expressionRPKM3rdQu = expressionRPKM3rdQu; }

    // Attr: org.intermine.model.bio.AnatomyExpression.expressionRPKMMax
    protected java.lang.Float expressionRPKMMax;
    public java.lang.Float getExpressionRPKMMax() { return expressionRPKMMax; }
    public void setExpressionRPKMMax(final java.lang.Float expressionRPKMMax) { this.expressionRPKMMax = expressionRPKMMax; }

    // Attr: org.intermine.model.bio.AnatomyExpression.expressionRPKM1stQu
    protected java.lang.Float expressionRPKM1stQu;
    public java.lang.Float getExpressionRPKM1stQu() { return expressionRPKM1stQu; }
    public void setExpressionRPKM1stQu(final java.lang.Float expressionRPKM1stQu) { this.expressionRPKM1stQu = expressionRPKM1stQu; }

    // Attr: org.intermine.model.bio.AnatomyExpression.expressionRankMin
    protected java.lang.Float expressionRankMin;
    public java.lang.Float getExpressionRankMin() { return expressionRankMin; }
    public void setExpressionRankMin(final java.lang.Float expressionRankMin) { this.expressionRankMin = expressionRankMin; }

    // Attr: org.intermine.model.bio.AnatomyExpression.expressionRank3rdQu
    protected java.lang.Float expressionRank3rdQu;
    public java.lang.Float getExpressionRank3rdQu() { return expressionRank3rdQu; }
    public void setExpressionRank3rdQu(final java.lang.Float expressionRank3rdQu) { this.expressionRank3rdQu = expressionRank3rdQu; }

    // Attr: org.intermine.model.bio.AnatomyExpression.expressionRPKMMedian
    protected java.lang.Float expressionRPKMMedian;
    public java.lang.Float getExpressionRPKMMedian() { return expressionRPKMMedian; }
    public void setExpressionRPKMMedian(final java.lang.Float expressionRPKMMedian) { this.expressionRPKMMedian = expressionRPKMMedian; }

    // Attr: org.intermine.model.bio.AnatomyExpression.expressionRPKMMean
    protected java.lang.Float expressionRPKMMean;
    public java.lang.Float getExpressionRPKMMean() { return expressionRPKMMean; }
    public void setExpressionRPKMMean(final java.lang.Float expressionRPKMMean) { this.expressionRPKMMean = expressionRPKMMean; }

    // Ref: org.intermine.model.bio.AnatomyExpression.anatomyTerm
    protected org.intermine.model.InterMineObject anatomyTerm;
    public org.intermine.model.bio.AnatomyTerm getAnatomyTerm() { if (anatomyTerm instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.AnatomyTerm) ((org.intermine.objectstore.proxy.ProxyReference) anatomyTerm).getObject()); }; return (org.intermine.model.bio.AnatomyTerm) anatomyTerm; }
    public void setAnatomyTerm(final org.intermine.model.bio.AnatomyTerm anatomyTerm) { this.anatomyTerm = anatomyTerm; }
    public void proxyAnatomyTerm(final org.intermine.objectstore.proxy.ProxyReference anatomyTerm) { this.anatomyTerm = anatomyTerm; }
    public org.intermine.model.InterMineObject proxGetAnatomyTerm() { return anatomyTerm; }

    // Ref: org.intermine.model.bio.AnatomyExpression.gene
    protected org.intermine.model.InterMineObject gene;
    public org.intermine.model.bio.Gene getGene() { if (gene instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Gene) ((org.intermine.objectstore.proxy.ProxyReference) gene).getObject()); }; return (org.intermine.model.bio.Gene) gene; }
    public void setGene(final org.intermine.model.bio.Gene gene) { this.gene = gene; }
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene) { this.gene = gene; }
    public org.intermine.model.InterMineObject proxGetGene() { return gene; }

    // Col: org.intermine.model.bio.AnatomyExpression.dataSets
    protected java.util.Set<org.intermine.model.bio.DataSet> dataSets = new java.util.HashSet<org.intermine.model.bio.DataSet>();
    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets() { return dataSets; }
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets) { this.dataSets = dataSets; }
    public void addDataSets(final org.intermine.model.bio.DataSet arg) { dataSets.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof AnatomyExpression && id != null) ? id.equals(((AnatomyExpression)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "AnatomyExpression [anatomyTerm=" + (anatomyTerm == null ? "null" : (anatomyTerm.getId() == null ? "no id" : anatomyTerm.getId().toString())) + ", expressionRPKM1stQu=" + expressionRPKM1stQu + ", expressionRPKM3rdQu=" + expressionRPKM3rdQu + ", expressionRPKMMax=" + expressionRPKMMax + ", expressionRPKMMean=" + expressionRPKMMean + ", expressionRPKMMedian=" + expressionRPKMMedian + ", expressionRPKMMin=" + expressionRPKMMin + ", expressionRank1stQu=" + expressionRank1stQu + ", expressionRank3rdQu=" + expressionRank3rdQu + ", expressionRankMax=" + expressionRankMax + ", expressionRankMean=" + expressionRankMean + ", expressionRankMedian=" + expressionRankMedian + ", expressionRankMin=" + expressionRankMin + ", gene=" + (gene == null ? "null" : (gene.getId() == null ? "no id" : gene.getId().toString())) + ", id=" + id + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("expressionRPKMMin".equals(fieldName)) {
            return expressionRPKMMin;
        }
        if ("expressionRankMean".equals(fieldName)) {
            return expressionRankMean;
        }
        if ("expressionRankMedian".equals(fieldName)) {
            return expressionRankMedian;
        }
        if ("expressionRankMax".equals(fieldName)) {
            return expressionRankMax;
        }
        if ("expressionRank1stQu".equals(fieldName)) {
            return expressionRank1stQu;
        }
        if ("expressionRPKM3rdQu".equals(fieldName)) {
            return expressionRPKM3rdQu;
        }
        if ("expressionRPKMMax".equals(fieldName)) {
            return expressionRPKMMax;
        }
        if ("expressionRPKM1stQu".equals(fieldName)) {
            return expressionRPKM1stQu;
        }
        if ("expressionRankMin".equals(fieldName)) {
            return expressionRankMin;
        }
        if ("expressionRank3rdQu".equals(fieldName)) {
            return expressionRank3rdQu;
        }
        if ("expressionRPKMMedian".equals(fieldName)) {
            return expressionRPKMMedian;
        }
        if ("expressionRPKMMean".equals(fieldName)) {
            return expressionRPKMMean;
        }
        if ("anatomyTerm".equals(fieldName)) {
            if (anatomyTerm instanceof ProxyReference) {
                return ((ProxyReference) anatomyTerm).getObject();
            } else {
                return anatomyTerm;
            }
        }
        if ("gene".equals(fieldName)) {
            if (gene instanceof ProxyReference) {
                return ((ProxyReference) gene).getObject();
            } else {
                return gene;
            }
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.AnatomyExpression.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("expressionRPKMMin".equals(fieldName)) {
            return expressionRPKMMin;
        }
        if ("expressionRankMean".equals(fieldName)) {
            return expressionRankMean;
        }
        if ("expressionRankMedian".equals(fieldName)) {
            return expressionRankMedian;
        }
        if ("expressionRankMax".equals(fieldName)) {
            return expressionRankMax;
        }
        if ("expressionRank1stQu".equals(fieldName)) {
            return expressionRank1stQu;
        }
        if ("expressionRPKM3rdQu".equals(fieldName)) {
            return expressionRPKM3rdQu;
        }
        if ("expressionRPKMMax".equals(fieldName)) {
            return expressionRPKMMax;
        }
        if ("expressionRPKM1stQu".equals(fieldName)) {
            return expressionRPKM1stQu;
        }
        if ("expressionRankMin".equals(fieldName)) {
            return expressionRankMin;
        }
        if ("expressionRank3rdQu".equals(fieldName)) {
            return expressionRank3rdQu;
        }
        if ("expressionRPKMMedian".equals(fieldName)) {
            return expressionRPKMMedian;
        }
        if ("expressionRPKMMean".equals(fieldName)) {
            return expressionRPKMMean;
        }
        if ("anatomyTerm".equals(fieldName)) {
            return anatomyTerm;
        }
        if ("gene".equals(fieldName)) {
            return gene;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.AnatomyExpression.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("expressionRPKMMin".equals(fieldName)) {
            expressionRPKMMin = (java.lang.Float) value;
        } else if ("expressionRankMean".equals(fieldName)) {
            expressionRankMean = (java.lang.Float) value;
        } else if ("expressionRankMedian".equals(fieldName)) {
            expressionRankMedian = (java.lang.Float) value;
        } else if ("expressionRankMax".equals(fieldName)) {
            expressionRankMax = (java.lang.Float) value;
        } else if ("expressionRank1stQu".equals(fieldName)) {
            expressionRank1stQu = (java.lang.Float) value;
        } else if ("expressionRPKM3rdQu".equals(fieldName)) {
            expressionRPKM3rdQu = (java.lang.Float) value;
        } else if ("expressionRPKMMax".equals(fieldName)) {
            expressionRPKMMax = (java.lang.Float) value;
        } else if ("expressionRPKM1stQu".equals(fieldName)) {
            expressionRPKM1stQu = (java.lang.Float) value;
        } else if ("expressionRankMin".equals(fieldName)) {
            expressionRankMin = (java.lang.Float) value;
        } else if ("expressionRank3rdQu".equals(fieldName)) {
            expressionRank3rdQu = (java.lang.Float) value;
        } else if ("expressionRPKMMedian".equals(fieldName)) {
            expressionRPKMMedian = (java.lang.Float) value;
        } else if ("expressionRPKMMean".equals(fieldName)) {
            expressionRPKMMean = (java.lang.Float) value;
        } else if ("anatomyTerm".equals(fieldName)) {
            anatomyTerm = (org.intermine.model.InterMineObject) value;
        } else if ("gene".equals(fieldName)) {
            gene = (org.intermine.model.InterMineObject) value;
        } else if ("dataSets".equals(fieldName)) {
            dataSets = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.AnatomyExpression.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("expressionRPKMMin".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("expressionRankMean".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("expressionRankMedian".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("expressionRankMax".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("expressionRank1stQu".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("expressionRPKM3rdQu".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("expressionRPKMMax".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("expressionRPKM1stQu".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("expressionRankMin".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("expressionRank3rdQu".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("expressionRPKMMedian".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("expressionRPKMMean".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("anatomyTerm".equals(fieldName)) {
            return org.intermine.model.bio.AnatomyTerm.class;
        }
        if ("gene".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("dataSets".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.AnatomyExpression.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.AnatomyExpression.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.AnatomyExpressionShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.AnatomyExpression");
        if (expressionRPKMMin != null) {
            sb.append("$_^aexpressionRPKMMin$_^").append(expressionRPKMMin);
        }
        if (expressionRankMean != null) {
            sb.append("$_^aexpressionRankMean$_^").append(expressionRankMean);
        }
        if (expressionRankMedian != null) {
            sb.append("$_^aexpressionRankMedian$_^").append(expressionRankMedian);
        }
        if (expressionRankMax != null) {
            sb.append("$_^aexpressionRankMax$_^").append(expressionRankMax);
        }
        if (expressionRank1stQu != null) {
            sb.append("$_^aexpressionRank1stQu$_^").append(expressionRank1stQu);
        }
        if (expressionRPKM3rdQu != null) {
            sb.append("$_^aexpressionRPKM3rdQu$_^").append(expressionRPKM3rdQu);
        }
        if (expressionRPKMMax != null) {
            sb.append("$_^aexpressionRPKMMax$_^").append(expressionRPKMMax);
        }
        if (expressionRPKM1stQu != null) {
            sb.append("$_^aexpressionRPKM1stQu$_^").append(expressionRPKM1stQu);
        }
        if (expressionRankMin != null) {
            sb.append("$_^aexpressionRankMin$_^").append(expressionRankMin);
        }
        if (expressionRank3rdQu != null) {
            sb.append("$_^aexpressionRank3rdQu$_^").append(expressionRank3rdQu);
        }
        if (expressionRPKMMedian != null) {
            sb.append("$_^aexpressionRPKMMedian$_^").append(expressionRPKMMedian);
        }
        if (expressionRPKMMean != null) {
            sb.append("$_^aexpressionRPKMMean$_^").append(expressionRPKMMean);
        }
        if (anatomyTerm != null) {
            sb.append("$_^ranatomyTerm$_^").append(anatomyTerm.getId());
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
        if (!org.intermine.model.bio.AnatomyExpressionShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.AnatomyExpression)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aexpressionRPKMMin".equals(notXml[i])) {
                i++;
                expressionRPKMMin = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aexpressionRankMean".equals(notXml[i])) {
                i++;
                expressionRankMean = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aexpressionRankMedian".equals(notXml[i])) {
                i++;
                expressionRankMedian = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aexpressionRankMax".equals(notXml[i])) {
                i++;
                expressionRankMax = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aexpressionRank1stQu".equals(notXml[i])) {
                i++;
                expressionRank1stQu = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aexpressionRPKM3rdQu".equals(notXml[i])) {
                i++;
                expressionRPKM3rdQu = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aexpressionRPKMMax".equals(notXml[i])) {
                i++;
                expressionRPKMMax = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aexpressionRPKM1stQu".equals(notXml[i])) {
                i++;
                expressionRPKM1stQu = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aexpressionRankMin".equals(notXml[i])) {
                i++;
                expressionRankMin = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aexpressionRank3rdQu".equals(notXml[i])) {
                i++;
                expressionRank3rdQu = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aexpressionRPKMMedian".equals(notXml[i])) {
                i++;
                expressionRPKMMedian = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aexpressionRPKMMean".equals(notXml[i])) {
                i++;
                expressionRPKMMean = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) &&"ranatomyTerm".equals(notXml[i])) {
                i++;
                anatomyTerm = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.AnatomyTerm.class);
                i++;
            };
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
        dataSets = new ProxyCollection<org.intermine.model.bio.DataSet>(os, this, "dataSets", org.intermine.model.bio.DataSet.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("dataSets".equals(fieldName)) {
            dataSets.add((org.intermine.model.bio.DataSet) element);
        } else {
            if (!org.intermine.model.bio.AnatomyExpression.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("dataSets".equals(fieldName)) {
            return org.intermine.model.bio.DataSet.class;
        }
        if (!org.intermine.model.bio.AnatomyExpression.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.AnatomyExpression.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
