
package service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.3.6
 * Tue May 26 13:53:37 CEST 2020
 * Generated source version: 3.3.6
 */

@XmlRootElement(name = "getInfoResponse", namespace = "http://service/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getInfoResponse", namespace = "http://service/")

public class GetInfoResponse {

    @XmlElement(name = "return")
    private model.Course _return;

    public model.Course getReturn() {
        return this._return;
    }

    public void setReturn(model.Course new_return)  {
        this._return = new_return;
    }

}
