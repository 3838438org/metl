package org.jumpmind.metl.core.plugin;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
abstract public class XMLAbstractDefinition implements Serializable, Comparable<XMLAbstractDefinition> {

    private static final long serialVersionUID = 1L;
    
    @XmlElement(required = false)
    protected String description;

    @XmlElement(required = true)
    protected String name;

    @XmlElement(required = true)
    protected String className;
    
    @XmlAttribute(required = true)
    protected String id;
    
    public XMLAbstractDefinition() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public int compareTo(XMLAbstractDefinition o) {
        return name.compareTo(o.getName());
    }

    



}