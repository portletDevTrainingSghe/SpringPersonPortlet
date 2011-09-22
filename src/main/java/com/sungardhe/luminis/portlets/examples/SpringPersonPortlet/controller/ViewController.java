package com.sungardhe.luminis.portlets.examples.SpringPersonPortlet.controller;

//import java.util.Map;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.AbstractController;

import com.sungardhe.luminis.portlets.examples.SpringPersonPortlet.model.IPortalPersonDAO;




public class ViewController extends AbstractController{
	//private static Log log = LogFactory.getLog(ViewController.class);
	private String message;
	private IPortalPersonDAO portalPersonDAO;
	
	protected ModelAndView handleRenderRequestInternal(RenderRequest request, RenderResponse response) throws Exception {
		//log.debug("Entering ViewController.handleRenderRequestInternal()");
		//Map<?, ?> userInfo = (Map<?, ?>)request.getAttribute(RenderRequest.USER_INFO);
		//String loggedInUser = (String)userInfo.get("user.name.nickName");
		//log.debug("This is the user.name.nickName that is assigned: " + loggedInUser);
		ModelAndView modelAndView = new ModelAndView("View");
		modelAndView.addObject("injectedMessage", message);
		modelAndView.addObject("listOfPersons", portalPersonDAO.getPersons());
		//log.debug("Exiting ViewController.handleRenderRequestInternal() " + modelAndView);
		return modelAndView;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setPortalPersonDAO(IPortalPersonDAO portalPersonDAO) {
		this.portalPersonDAO = portalPersonDAO;
	}

	

}
