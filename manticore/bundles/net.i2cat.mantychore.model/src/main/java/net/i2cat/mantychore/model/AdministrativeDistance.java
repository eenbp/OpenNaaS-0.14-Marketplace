/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.Serializable;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class AdministrativeDistance as well as methods comparable
 * to the invokeMethods defined for this class. This Class implements the AdministrativeDistanceBean Interface. The CIM class AdministrativeDistance
 * is described as follows:
 *
 * Information in this class affects the choice of one protocol over another, when two protocols learn the same route. Properties define the
 * preference of a protocol, called its distance. The lower the distance, the higher the preference for that protocol. This class affects ALL routes
 * and contains the default distances. Specific administrative distances relative to an individual route and Forwarding Service are defined in the
 * NextHopForwardedByService association, its AdminDistance property. AdministrativeDistance, being a global object, is weak to the AdminDomain that
 * contains it. Hence, the AdminDomain keys are propagated to this class.
 */
public class AdministrativeDistance extends LogicalElement implements
		Serializable {

	/**
	 * This constructor creates a AdministrativeDistanceBeanImpl Class which implements the AdministrativeDistanceBean Interface, and encapsulates the
	 * CIM class AdministrativeDistance in a Java Bean. The CIM class AdministrativeDistance is described as follows:
	 *
	 * Information in this class affects the choice of one protocol over another, when two protocols learn the same route. Properties define the
	 * preference of a protocol, called its distance. The lower the distance, the higher the preference for that protocol. This class affects ALL
	 * routes and contains the default distances. Specific administrative distances relative to an individual route and Forwarding Service are defined
	 * in the NextHopForwardedByService association, its AdminDistance property. AdministrativeDistance, being a global object, is weak to the
	 * AdminDomain that contains it. Hence, the AdminDomain keys are propagated to this class.
	 */
	public AdministrativeDistance() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property systemCreationClassName.
	 */
	private String	systemCreationClassName;

	/**
	 * This method returns the AdministrativeDistance.systemCreationClassName property value. This property is described as follows:
	 *
	 * The scoping AdminDomain's CreationClassName.
	 *
	 * @return String current systemCreationClassName property value
	 * @exception Exception
	 */
	public String getSystemCreationClassName() {

		return this.systemCreationClassName;
	} // getSystemCreationClassName

	/**
	 * This method sets the AdministrativeDistance.systemCreationClassName property value. This property is described as follows:
	 *
	 * The scoping AdminDomain's CreationClassName.
	 *
	 * @param String
	 *            new systemCreationClassName property value
	 * @exception Exception
	 */
	public void setSystemCreationClassName(String systemCreationClassName) {

		this.systemCreationClassName = systemCreationClassName;
	} // setSystemCreationClassName

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property systemName.
	 */
	private String	systemName;

	/**
	 * This method returns the AdministrativeDistance.systemName property value. This property is described as follows:
	 *
	 * The scoping AdminDomain's Name.
	 *
	 * @return String current systemName property value
	 * @exception Exception
	 */
	public String getSystemName() {

		return this.systemName;
	} // getSystemName

	/**
	 * This method sets the AdministrativeDistance.systemName property value. This property is described as follows:
	 *
	 * The scoping AdminDomain's Name.
	 *
	 * @param String
	 *            new systemName property value
	 * @exception Exception
	 */
	public void setSystemName(String systemName) {

		this.systemName = systemName;
	} // setSystemName

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property creationClassName.
	 */
	private String	creationClassName;

	/**
	 * This method returns the AdministrativeDistance.creationClassName property value. This property is described as follows:
	 *
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties
	 * of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 *
	 * @return String current creationClassName property value
	 * @exception Exception
	 */
	public String getCreationClassName() {

		return this.creationClassName;
	} // getCreationClassName

	/**
	 * This method sets the AdministrativeDistance.creationClassName property value. This property is described as follows:
	 *
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties
	 * of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 *
	 * @param String
	 *            new creationClassName property value
	 * @exception Exception
	 */
	public void setCreationClassName(String creationClassName) {

		this.creationClassName = creationClassName;
	} // setCreationClassName

	// /**
	// * The following constants are defined for use with the ValueMap/Values
	// * qualified property name.
	// */
	// private String name;
	/**
	 * This method returns the AdministrativeDistance.name property value. This property is described as follows:
	 *
	 * This is the name of the AdministrativeDistance class.
	 *
	 * @return String current name property value
	 * @exception Exception
	 */
	@Override
	public String getName() {

		return super.getName();
	} // getName

	/**
	 * This method sets the AdministrativeDistance.name property value. This property is described as follows:
	 *
	 * This is the name of the AdministrativeDistance class.
	 *
	 * @param String
	 *            new name property value
	 * @exception Exception
	 */
	@Override
	public void setName(String name) {

		super.setName(name);
	} // setName

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property directConnect.
	 */
	private short	directConnect;

	/**
	 * This method returns the AdministrativeDistance.directConnect property value. This property is described as follows:
	 *
	 * The distance for directly connected peers. It has a default value of 0.
	 *
	 * @return short current directConnect property value
	 * @exception Exception
	 */
	public short getDirectConnect() {

		return this.directConnect;
	} // getDirectConnect

	/**
	 * This method sets the AdministrativeDistance.directConnect property value. This property is described as follows:
	 *
	 * The distance for directly connected peers. It has a default value of 0.
	 *
	 * @param short new directConnect property value
	 * @exception Exception
	 */
	public void setDirectConnect(short directConnect) {

		this.directConnect = directConnect;
	} // setDirectConnect

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property _static.
	 */
	private short	_static;

	/**
	 * This method returns the AdministrativeDistance._static property value. This property is described as follows:
	 *
	 * The distance for staticly connected peers. It has a default value of 1.
	 *
	 * @return short current _static property value
	 * @exception Exception
	 */
	public short getStatic() {

		return this._static;
	} // getStatic

	/**
	 * This method sets the AdministrativeDistance._static property value. This property is described as follows:
	 *
	 * The distance for staticly connected peers. It has a default value of 1.
	 *
	 * @param short new _static property value
	 * @exception Exception
	 */
	public void setStatic(short _static) {

		this._static = _static;
	} // setStatic

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property eBGP.
	 */
	private short	eBGP;

	/**
	 * This method returns the AdministrativeDistance.eBGP property value. This property is described as follows:
	 *
	 * The distance for peers using EBGP. It has a default value of 20.
	 *
	 * @return short current eBGP property value
	 * @exception Exception
	 */
	public short getEBGP() {

		return this.eBGP;
	} // getEBGP

	/**
	 * This method sets the AdministrativeDistance.eBGP property value. This property is described as follows:
	 *
	 * The distance for peers using EBGP. It has a default value of 20.
	 *
	 * @param short new eBGP property value
	 * @exception Exception
	 */
	public void setEBGP(short eBGP) {

		this.eBGP = eBGP;
	} // setEBGP

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property eIGRPInternal.
	 */
	private short	eIGRPInternal;

	/**
	 * This method returns the AdministrativeDistance.eIGRPInternal property value. This property is described as follows:
	 *
	 * The distance for peers using internal EIGRP. It has a default value of 90.
	 *
	 * @return short current eIGRPInternal property value
	 * @exception Exception
	 */
	public short getEIGRPInternal() {

		return this.eIGRPInternal;
	} // getEIGRPInternal

	/**
	 * This method sets the AdministrativeDistance.eIGRPInternal property value. This property is described as follows:
	 *
	 * The distance for peers using internal EIGRP. It has a default value of 90.
	 *
	 * @param short new eIGRPInternal property value
	 * @exception Exception
	 */
	public void setEIGRPInternal(short eIGRPInternal) {

		this.eIGRPInternal = eIGRPInternal;
	} // setEIGRPInternal

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property iGRP.
	 */
	private short	iGRP;

	/**
	 * This method returns the AdministrativeDistance.iGRP property value. This property is described as follows:
	 *
	 * The distance for peers using IGRP. It has a default value of 100.
	 *
	 * @return short current iGRP property value
	 * @exception Exception
	 */
	public short getIGRP() {

		return this.iGRP;
	} // getIGRP

	/**
	 * This method sets the AdministrativeDistance.iGRP property value. This property is described as follows:
	 *
	 * The distance for peers using IGRP. It has a default value of 100.
	 *
	 * @param short new iGRP property value
	 * @exception Exception
	 */
	public void setIGRP(short iGRP) {

		this.iGRP = iGRP;
	} // setIGRP

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property oSPF.
	 */
	private short	oSPF;

	/**
	 * This method returns the AdministrativeDistance.oSPF property value. This property is described as follows:
	 *
	 * The distance for peers using OSPF. It has a default value of 110.
	 *
	 * @return short current oSPF property value
	 * @exception Exception
	 */
	public short getOSPF() {

		return this.oSPF;
	} // getOSPF

	/**
	 * This method sets the AdministrativeDistance.oSPF property value. This property is described as follows:
	 *
	 * The distance for peers using OSPF. It has a default value of 110.
	 *
	 * @param short new oSPF property value
	 * @exception Exception
	 */
	public void setOSPF(short oSPF) {

		this.oSPF = oSPF;
	} // setOSPF

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property iSIS.
	 */
	private short	iSIS;

	/**
	 * This method returns the AdministrativeDistance.iSIS property value. This property is described as follows:
	 *
	 * The distance for peers using ISIS. It has a default value of 115.
	 *
	 * @return short current iSIS property value
	 * @exception Exception
	 */
	public short getISIS() {

		return this.iSIS;
	} // getISIS

	/**
	 * This method sets the AdministrativeDistance.iSIS property value. This property is described as follows:
	 *
	 * The distance for peers using ISIS. It has a default value of 115.
	 *
	 * @param short new iSIS property value
	 * @exception Exception
	 */
	public void setISIS(short iSIS) {

		this.iSIS = iSIS;
	} // setISIS

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property rIP.
	 */
	private short	rIP;

	/**
	 * This method returns the AdministrativeDistance.rIP property value. This property is described as follows:
	 *
	 * The distance for peers using RIP. It has a default value of 120.
	 *
	 * @return short current rIP property value
	 * @exception Exception
	 */
	public short getRIP() {

		return this.rIP;
	} // getRIP

	/**
	 * This method sets the AdministrativeDistance.rIP property value. This property is described as follows:
	 *
	 * The distance for peers using RIP. It has a default value of 120.
	 *
	 * @param short new rIP property value
	 * @exception Exception
	 */
	public void setRIP(short rIP) {

		this.rIP = rIP;
	} // setRIP

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property eGP.
	 */
	private short	eGP;

	/**
	 * This method returns the AdministrativeDistance.eGP property value. This property is described as follows:
	 *
	 * The distance for peers using EGP. It has a default value of 140.
	 *
	 * @return short current eGP property value
	 * @exception Exception
	 */
	public short getEGP() {

		return this.eGP;
	} // getEGP

	/**
	 * This method sets the AdministrativeDistance.eGP property value. This property is described as follows:
	 *
	 * The distance for peers using EGP. It has a default value of 140.
	 *
	 * @param short new eGP property value
	 * @exception Exception
	 */
	public void setEGP(short eGP) {

		this.eGP = eGP;
	} // setEGP

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property eIGRPExternal.
	 */
	private short	eIGRPExternal;

	/**
	 * This method returns the AdministrativeDistance.eIGRPExternal property value. This property is described as follows:
	 *
	 * The distance for peers using external EIGRP. It has a default value of 170.
	 *
	 * @return short current eIGRPExternal property value
	 * @exception Exception
	 */
	public short getEIGRPExternal() {

		return this.eIGRPExternal;
	} // getEIGRPExternal

	/**
	 * This method sets the AdministrativeDistance.eIGRPExternal property value. This property is described as follows:
	 *
	 * The distance for peers using external EIGRP. It has a default value of 170.
	 *
	 * @param short new eIGRPExternal property value
	 * @exception Exception
	 */
	public void setEIGRPExternal(short eIGRPExternal) {

		this.eIGRPExternal = eIGRPExternal;
	} // setEIGRPExternal

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property iBGP.
	 */
	private short	iBGP;

	/**
	 * This method returns the AdministrativeDistance.iBGP property value. This property is described as follows:
	 *
	 * The distance for peers using IBGP. It has a default value of 200.
	 *
	 * @return short current iBGP property value
	 * @exception Exception
	 */
	public short getIBGP() {

		return this.iBGP;
	} // getIBGP

	/**
	 * This method sets the AdministrativeDistance.iBGP property value. This property is described as follows:
	 *
	 * The distance for peers using IBGP. It has a default value of 200.
	 *
	 * @param short new iBGP property value
	 * @exception Exception
	 */
	public void setIBGP(short iBGP) {

		this.iBGP = iBGP;
	} // setIBGP

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property bGPLocal.
	 */
	private short	bGPLocal;

	/**
	 * This method returns the AdministrativeDistance.bGPLocal property value. This property is described as follows:
	 *
	 * The distance for peers using BGP locally. It has a default value of 200.
	 *
	 * @return short current bGPLocal property value
	 * @exception Exception
	 */
	public short getBGPLocal() {

		return this.bGPLocal;
	} // getBGPLocal

	/**
	 * This method sets the AdministrativeDistance.bGPLocal property value. This property is described as follows:
	 *
	 * The distance for peers using BGP locally. It has a default value of 200.
	 *
	 * @param short new bGPLocal property value
	 * @exception Exception
	 */
	public void setBGPLocal(short bGPLocal) {

		this.bGPLocal = bGPLocal;
	} // setBGPLocal

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property unknown.
	 */
	private short	unknown;

	/**
	 * This method returns the AdministrativeDistance.unknown property value. This property is described as follows:
	 *
	 * The distance for peers using an unknown protocol. It has a default value of 255.
	 *
	 * @return short current unknown property value
	 * @exception Exception
	 */
	public short getUnknown() {

		return this.unknown;
	} // getUnknown

	/**
	 * This method sets the AdministrativeDistance.unknown property value. This property is described as follows:
	 *
	 * The distance for peers using an unknown protocol. It has a default value of 255.
	 *
	 * @param short new unknown property value
	 * @exception Exception
	 */
	public void setUnknown(short unknown) {

		this.unknown = unknown;
	} // setUnknown

} // Class AdministrativeDistance