package com.axa.dm.travel;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ProcessObject implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Rule Type")
	private java.lang.String ruleType;

	@org.kie.api.definition.type.Label(value = "Travel")
	private com.axa.dm.travel.Travel travel;

	public ProcessObject() {
	}

	public java.lang.String getRuleType() {
		return this.ruleType;
	}

	public void setRuleType(java.lang.String ruleType) {
		this.ruleType = ruleType;
	}

	public com.axa.dm.travel.Travel getTravel() {
		return this.travel;
	}

	public void setTravel(com.axa.dm.travel.Travel travel) {
		this.travel = travel;
	}

	public ProcessObject(java.lang.String ruleType,
			com.axa.dm.travel.Travel travel) {
		this.ruleType = ruleType;
		this.travel = travel;
	}

}