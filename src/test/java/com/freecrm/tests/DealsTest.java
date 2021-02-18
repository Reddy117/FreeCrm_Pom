package com.freecrm.tests;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.freecrm.base.BaseClass;
import com.freecrm.pages.DealsPage;

public class DealsTest extends DealsPage{

	@Test(dataProvider="getDealData")
	public void tc_CreateDeal(HashMap<String,String> map) {
		lp.doLogin();
		dp.createDeal(map.get("Deal Tile"));
	}
	
	@DataProvider
	public Object[][] getDealData(){
		return BaseClass.getData("Sheet3", "TC3_CreateDeal", x);
	}
}
