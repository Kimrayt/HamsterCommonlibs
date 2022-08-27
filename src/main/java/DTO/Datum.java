
package DTO;

import DTO.Name;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Datum implements Serializable
{

    private Name name;
    private String id;
    private String weight;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2574686835852199417L;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
