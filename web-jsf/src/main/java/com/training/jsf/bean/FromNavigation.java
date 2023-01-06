package com.training.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="nav")
@RequestScoped
public class FromNavigation {
	
	public String diplayTestPage() {
		return "success";
	}
	
	public String displayWelcomePage() {
		return "success";
	}

}