/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class ClassifierFilterSet as well as methods comparable to
 * the invokeMethods defined for this class. This Class implements the ClassifierFilterSetBean Interface. The CIM class ClassifierFilterSet is
 * described as follows:
 * 
 * In order for a ClassifierService to correctly identify and process network traffic, that traffic must be described by FilterEntries, which are
 * aggregated into FilterLists. This association defines the Dependency of the ClassifierService on FilterLists (and therefore, their FilterEntries).
 * The cardinality of the association requires that the Classifier Service operate against at least one FilterList. The association is deprecated in
 * lieu of associating Filter Lists to ClassifierElements, and ClassifierElements into ClassifierServices. The latter approach is very flexible
 * regarding the implementations that can be modeled, and removes the need to track individual traffic streams using an artificial model property,
 * TrafficClass. Using ClassifierElements, each stream is processed beginning with a single FilterList and progressing through various
 * ConditioningServices, associated via instances of NextService.
 */
@Deprecated
public class ClassifierFilterSet extends Dependency implements Serializable
{

	/**
	 * This constructor creates a ClassifierFilterSetBeanImpl Class which implements the ClassifierFilterSetBean Interface, and encapsulates the CIM
	 * class ClassifierFilterSet in a Java Bean. The CIM class ClassifierFilterSet is described as follows:
	 * 
	 * In order for a ClassifierService to correctly identify and process network traffic, that traffic must be described by FilterEntries, which are
	 * aggregated into FilterLists. This association defines the Dependency of the ClassifierService on FilterLists (and therefore, their
	 * FilterEntries). The cardinality of the association requires that the Classifier Service operate against at least one FilterList. The
	 * association is deprecated in lieu of associating Filter Lists to ClassifierElements, and ClassifierElements into ClassifierServices. The latter
	 * approach is very flexible regarding the implementations that can be modeled, and removes the need to track individual traffic streams using an
	 * artificial model property, TrafficClass. Using ClassifierElements, each stream is processed beginning with a single FilterList and progressing
	 * through various ConditioningServices, associated via instances of NextService.
	 */
	public ClassifierFilterSet() {
	};

	/**
	 * This method create an Association of the type ClassifierFilterSet between one FilterList object and ClassifierService object
	 */
	@Deprecated
	public static ClassifierFilterSet link(FilterList
			antecedent, ClassifierService dependent) {

		return (ClassifierFilterSet) Association.link(ClassifierFilterSet.class, antecedent, dependent);
	}// link

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property filterListPosition.
	 */
	@Deprecated
	private int	filterListPosition;

	/**
	 * This method returns the ClassifierFilterSet.filterListPosition property value. This property is described as follows:
	 * 
	 * The ordering of the FilterLists used in the classification and forwarding functions of the ClassifierService.
	 * 
	 * @return int current filterListPosition property value
	 * @exception Exception
	 */
	@Deprecated
	public int getFilterListPosition() {

		return this.filterListPosition;
	} // getFilterListPosition

	/**
	 * This method sets the ClassifierFilterSet.filterListPosition property value. This property is described as follows:
	 * 
	 * The ordering of the FilterLists used in the classification and forwarding functions of the ClassifierService.
	 * 
	 * @param int new filterListPosition property value
	 * @exception Exception
	 */
	@Deprecated
	public void setFilterListPosition(int filterListPosition) {

		this.filterListPosition = filterListPosition;
	} // setFilterListPosition

} // Class ClassifierFilterSet