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

public class OrthologuePhenotypeShadow implements OrthologuePhenotype, ShadowClass
{
    public static final Class<OrthologuePhenotype> shadowOf = OrthologuePhenotype.class;
    // Col: org.intermine.model.bio.OrthologuePhenotype.monarchPhenotypeTerms
    protected java.util.Set<org.intermine.model.bio.MonarchPhenotypeTerm> monarchPhenotypeTerms = new java.util.HashSet<org.intermine.model.bio.MonarchPhenotypeTerm>();
    public java.util.Set<org.intermine.model.bio.MonarchPhenotypeTerm> getMonarchPhenotypeTerms() { return monarchPhenotypeTerms; }
    public void setMonarchPhenotypeTerms(final java.util.Set<org.intermine.model.bio.MonarchPhenotypeTerm> monarchPhenotypeTerms) { this.monarchPhenotypeTerms = monarchPhenotypeTerms; }
    public void addMonarchPhenotypeTerms(final org.intermine.model.bio.MonarchPhenotypeTerm arg) { monarchPhenotypeTerms.add(arg); }

    // Attr: org.intermine.model.bio.Homologue.homologueBootstrapScore
    protected java.lang.Integer homologueBootstrapScore;
    public java.lang.Integer getHomologueBootstrapScore() { return homologueBootstrapScore; }
    public void setHomologueBootstrapScore(final java.lang.Integer homologueBootstrapScore) { this.homologueBootstrapScore = homologueBootstrapScore; }

    // Attr: org.intermine.model.bio.Homologue.inParanoidScore
    protected java.lang.Double inParanoidScore;
    public java.lang.Double getInParanoidScore() { return inParanoidScore; }
    public void setInParanoidScore(final java.lang.Double inParanoidScore) { this.inParanoidScore = inParanoidScore; }

    // Attr: org.intermine.model.bio.Homologue.type
    protected java.lang.String type;
    public java.lang.String getType() { return type; }
    public void setType(final java.lang.String type) { this.type = type; }

    // Attr: org.intermine.model.bio.Homologue.bootstrapScore
    protected java.lang.Integer bootstrapScore;
    public java.lang.Integer getBootstrapScore() { return bootstrapScore; }
    public void setBootstrapScore(final java.lang.Integer bootstrapScore) { this.bootstrapScore = bootstrapScore; }

    // Attr: org.intermine.model.bio.Homologue.clusterName
    protected java.lang.String clusterName;
    public java.lang.String getClusterName() { return clusterName; }
    public void setClusterName(final java.lang.String clusterName) { this.clusterName = clusterName; }

    // Ref: org.intermine.model.bio.Homologue.gene
    protected org.intermine.model.InterMineObject gene;
    public org.intermine.model.bio.Gene getGene() { if (gene instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Gene) ((org.intermine.objectstore.proxy.ProxyReference) gene).getObject()); }; return (org.intermine.model.bio.Gene) gene; }
    public void setGene(final org.intermine.model.bio.Gene gene) { this.gene = gene; }
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene) { this.gene = gene; }
    public org.intermine.model.InterMineObject proxGetGene() { return gene; }

    // Ref: org.intermine.model.bio.Homologue.protein
    protected org.intermine.model.InterMineObject protein;
    public org.intermine.model.bio.Protein getProtein() { if (protein instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Protein) ((org.intermine.objectstore.proxy.ProxyReference) protein).getObject()); }; return (org.intermine.model.bio.Protein) protein; }
    public void setProtein(final org.intermine.model.bio.Protein protein) { this.protein = protein; }
    public void proxyProtein(final org.intermine.objectstore.proxy.ProxyReference protein) { this.protein = protein; }
    public org.intermine.model.InterMineObject proxGetProtein() { return protein; }

    // Ref: org.intermine.model.bio.Homologue.homologue
    protected org.intermine.model.InterMineObject homologue;
    public org.intermine.model.bio.Gene getHomologue() { if (homologue instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Gene) ((org.intermine.objectstore.proxy.ProxyReference) homologue).getObject()); }; return (org.intermine.model.bio.Gene) homologue; }
    public void setHomologue(final org.intermine.model.bio.Gene homologue) { this.homologue = homologue; }
    public void proxyHomologue(final org.intermine.objectstore.proxy.ProxyReference homologue) { this.homologue = homologue; }
    public org.intermine.model.InterMineObject proxGetHomologue() { return homologue; }

    // Ref: org.intermine.model.bio.Homologue.homologueProtein
    protected org.intermine.model.InterMineObject homologueProtein;
    public org.intermine.model.bio.Protein getHomologueProtein() { if (homologueProtein instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Protein) ((org.intermine.objectstore.proxy.ProxyReference) homologueProtein).getObject()); }; return (org.intermine.model.bio.Protein) homologueProtein; }
    public void setHomologueProtein(final org.intermine.model.bio.Protein homologueProtein) { this.homologueProtein = homologueProtein; }
    public void proxyHomologueProtein(final org.intermine.objectstore.proxy.ProxyReference homologueProtein) { this.homologueProtein = homologueProtein; }
    public org.intermine.model.InterMineObject proxGetHomologueProtein() { return homologueProtein; }

    // Col: org.intermine.model.bio.Homologue.evidence
    protected java.util.Set<org.intermine.model.bio.OrthologueEvidence> evidence = new java.util.HashSet<org.intermine.model.bio.OrthologueEvidence>();
    public java.util.Set<org.intermine.model.bio.OrthologueEvidence> getEvidence() { return evidence; }
    public void setEvidence(final java.util.Set<org.intermine.model.bio.OrthologueEvidence> evidence) { this.evidence = evidence; }
    public void addEvidence(final org.intermine.model.bio.OrthologueEvidence arg) { evidence.add(arg); }

    // Col: org.intermine.model.bio.Homologue.dataSets
    protected java.util.Set<org.intermine.model.bio.DataSet> dataSets = new java.util.HashSet<org.intermine.model.bio.DataSet>();
    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets() { return dataSets; }
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets) { this.dataSets = dataSets; }
    public void addDataSets(final org.intermine.model.bio.DataSet arg) { dataSets.add(arg); }

    // Col: org.intermine.model.bio.Homologue.phenotypes
    protected java.util.Set<org.intermine.model.bio.Phenotype> phenotypes = new java.util.HashSet<org.intermine.model.bio.Phenotype>();
    public java.util.Set<org.intermine.model.bio.Phenotype> getPhenotypes() { return phenotypes; }
    public void setPhenotypes(final java.util.Set<org.intermine.model.bio.Phenotype> phenotypes) { this.phenotypes = phenotypes; }
    public void addPhenotypes(final org.intermine.model.bio.Phenotype arg) { phenotypes.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof OrthologuePhenotype && id != null) ? id.equals(((OrthologuePhenotype)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "OrthologuePhenotype [bootstrapScore=" + bootstrapScore + ", clusterName=" + (clusterName == null ? "null" : "\"" + clusterName + "\"") + ", gene=" + (gene == null ? "null" : (gene.getId() == null ? "no id" : gene.getId().toString())) + ", homologue=" + (homologue == null ? "null" : (homologue.getId() == null ? "no id" : homologue.getId().toString())) + ", homologueBootstrapScore=" + homologueBootstrapScore + ", homologueProtein=" + (homologueProtein == null ? "null" : (homologueProtein.getId() == null ? "no id" : homologueProtein.getId().toString())) + ", id=" + id + ", inParanoidScore=" + inParanoidScore + ", protein=" + (protein == null ? "null" : (protein.getId() == null ? "no id" : protein.getId().toString())) + ", type=" + (type == null ? "null" : "\"" + type + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("monarchPhenotypeTerms".equals(fieldName)) {
            return monarchPhenotypeTerms;
        }
        if ("homologueBootstrapScore".equals(fieldName)) {
            return homologueBootstrapScore;
        }
        if ("inParanoidScore".equals(fieldName)) {
            return inParanoidScore;
        }
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("bootstrapScore".equals(fieldName)) {
            return bootstrapScore;
        }
        if ("clusterName".equals(fieldName)) {
            return clusterName;
        }
        if ("gene".equals(fieldName)) {
            if (gene instanceof ProxyReference) {
                return ((ProxyReference) gene).getObject();
            } else {
                return gene;
            }
        }
        if ("protein".equals(fieldName)) {
            if (protein instanceof ProxyReference) {
                return ((ProxyReference) protein).getObject();
            } else {
                return protein;
            }
        }
        if ("homologue".equals(fieldName)) {
            if (homologue instanceof ProxyReference) {
                return ((ProxyReference) homologue).getObject();
            } else {
                return homologue;
            }
        }
        if ("homologueProtein".equals(fieldName)) {
            if (homologueProtein instanceof ProxyReference) {
                return ((ProxyReference) homologueProtein).getObject();
            } else {
                return homologueProtein;
            }
        }
        if ("evidence".equals(fieldName)) {
            return evidence;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("phenotypes".equals(fieldName)) {
            return phenotypes;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.OrthologuePhenotype.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("monarchPhenotypeTerms".equals(fieldName)) {
            return monarchPhenotypeTerms;
        }
        if ("homologueBootstrapScore".equals(fieldName)) {
            return homologueBootstrapScore;
        }
        if ("inParanoidScore".equals(fieldName)) {
            return inParanoidScore;
        }
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("bootstrapScore".equals(fieldName)) {
            return bootstrapScore;
        }
        if ("clusterName".equals(fieldName)) {
            return clusterName;
        }
        if ("gene".equals(fieldName)) {
            return gene;
        }
        if ("protein".equals(fieldName)) {
            return protein;
        }
        if ("homologue".equals(fieldName)) {
            return homologue;
        }
        if ("homologueProtein".equals(fieldName)) {
            return homologueProtein;
        }
        if ("evidence".equals(fieldName)) {
            return evidence;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("phenotypes".equals(fieldName)) {
            return phenotypes;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.OrthologuePhenotype.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("monarchPhenotypeTerms".equals(fieldName)) {
            monarchPhenotypeTerms = (java.util.Set) value;
        } else if ("homologueBootstrapScore".equals(fieldName)) {
            homologueBootstrapScore = (java.lang.Integer) value;
        } else if ("inParanoidScore".equals(fieldName)) {
            inParanoidScore = (java.lang.Double) value;
        } else if ("type".equals(fieldName)) {
            type = (java.lang.String) value;
        } else if ("bootstrapScore".equals(fieldName)) {
            bootstrapScore = (java.lang.Integer) value;
        } else if ("clusterName".equals(fieldName)) {
            clusterName = (java.lang.String) value;
        } else if ("gene".equals(fieldName)) {
            gene = (org.intermine.model.InterMineObject) value;
        } else if ("protein".equals(fieldName)) {
            protein = (org.intermine.model.InterMineObject) value;
        } else if ("homologue".equals(fieldName)) {
            homologue = (org.intermine.model.InterMineObject) value;
        } else if ("homologueProtein".equals(fieldName)) {
            homologueProtein = (org.intermine.model.InterMineObject) value;
        } else if ("evidence".equals(fieldName)) {
            evidence = (java.util.Set) value;
        } else if ("dataSets".equals(fieldName)) {
            dataSets = (java.util.Set) value;
        } else if ("phenotypes".equals(fieldName)) {
            phenotypes = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.OrthologuePhenotype.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("monarchPhenotypeTerms".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("homologueBootstrapScore".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("inParanoidScore".equals(fieldName)) {
            return java.lang.Double.class;
        }
        if ("type".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("bootstrapScore".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("clusterName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("gene".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("protein".equals(fieldName)) {
            return org.intermine.model.bio.Protein.class;
        }
        if ("homologue".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("homologueProtein".equals(fieldName)) {
            return org.intermine.model.bio.Protein.class;
        }
        if ("evidence".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("dataSets".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("phenotypes".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.OrthologuePhenotype.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.OrthologuePhenotype.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.OrthologuePhenotypeShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.OrthologuePhenotype");
        if (homologueBootstrapScore != null) {
            sb.append("$_^ahomologueBootstrapScore$_^").append(homologueBootstrapScore);
        }
        if (inParanoidScore != null) {
            sb.append("$_^ainParanoidScore$_^").append(inParanoidScore);
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
        if (bootstrapScore != null) {
            sb.append("$_^abootstrapScore$_^").append(bootstrapScore);
        }
        if (clusterName != null) {
            sb.append("$_^aclusterName$_^");
            String string = clusterName;
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
        if (gene != null) {
            sb.append("$_^rgene$_^").append(gene.getId());
        }
        if (protein != null) {
            sb.append("$_^rprotein$_^").append(protein.getId());
        }
        if (homologue != null) {
            sb.append("$_^rhomologue$_^").append(homologue.getId());
        }
        if (homologueProtein != null) {
            sb.append("$_^rhomologueProtein$_^").append(homologueProtein.getId());
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
        if (!org.intermine.model.bio.OrthologuePhenotypeShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.OrthologuePhenotype)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "ahomologueBootstrapScore".equals(notXml[i])) {
                i++;
                homologueBootstrapScore = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "ainParanoidScore".equals(notXml[i])) {
                i++;
                inParanoidScore = Double.valueOf(notXml[i]);
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
            if ((i < notXml.length) && "abootstrapScore".equals(notXml[i])) {
                i++;
                bootstrapScore = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aclusterName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                clusterName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rgene".equals(notXml[i])) {
                i++;
                gene = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Gene.class);
                i++;
            };
            if ((i < notXml.length) &&"rprotein".equals(notXml[i])) {
                i++;
                protein = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Protein.class);
                i++;
            };
            if ((i < notXml.length) &&"rhomologue".equals(notXml[i])) {
                i++;
                homologue = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Gene.class);
                i++;
            };
            if ((i < notXml.length) &&"rhomologueProtein".equals(notXml[i])) {
                i++;
                homologueProtein = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Protein.class);
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
        monarchPhenotypeTerms = new ProxyCollection<org.intermine.model.bio.MonarchPhenotypeTerm>(os, this, "monarchPhenotypeTerms", org.intermine.model.bio.MonarchPhenotypeTerm.class);
        evidence = new ProxyCollection<org.intermine.model.bio.OrthologueEvidence>(os, this, "evidence", org.intermine.model.bio.OrthologueEvidence.class);
        dataSets = new ProxyCollection<org.intermine.model.bio.DataSet>(os, this, "dataSets", org.intermine.model.bio.DataSet.class);
        phenotypes = new ProxyCollection<org.intermine.model.bio.Phenotype>(os, this, "phenotypes", org.intermine.model.bio.Phenotype.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("monarchPhenotypeTerms".equals(fieldName)) {
            monarchPhenotypeTerms.add((org.intermine.model.bio.MonarchPhenotypeTerm) element);
        } else if ("evidence".equals(fieldName)) {
            evidence.add((org.intermine.model.bio.OrthologueEvidence) element);
        } else if ("dataSets".equals(fieldName)) {
            dataSets.add((org.intermine.model.bio.DataSet) element);
        } else if ("phenotypes".equals(fieldName)) {
            phenotypes.add((org.intermine.model.bio.Phenotype) element);
        } else {
            if (!org.intermine.model.bio.OrthologuePhenotype.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("monarchPhenotypeTerms".equals(fieldName)) {
            return org.intermine.model.bio.MonarchPhenotypeTerm.class;
        }
        if ("evidence".equals(fieldName)) {
            return org.intermine.model.bio.OrthologueEvidence.class;
        }
        if ("dataSets".equals(fieldName)) {
            return org.intermine.model.bio.DataSet.class;
        }
        if ("phenotypes".equals(fieldName)) {
            return org.intermine.model.bio.Phenotype.class;
        }
        if (!org.intermine.model.bio.OrthologuePhenotype.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.OrthologuePhenotype.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
