package ru.inex.autotestconfig.modeldata.trainmodels;

import com.extjs.gxt.ui.client.data.BaseModelData;

public class ReturnTrain extends BaseModelData {
	private static final long serialVersionUID = -7011165103987802872L;
	
	public ReturnTrain() {

	}

	public ReturnTrain(String foreignTrain) {
		setForeignTrain(foreignTrain);
	}
	
	public String getForeignTrain() {
		return get("foreignTrain");
	}
	public void setForeignTrain(String foreignTrain) {
		set("foreignTrain", foreignTrain);
	}
}