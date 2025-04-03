package edu.tejas.eventManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import edu.tejas.eventManagement.Entity.Event;
import edu.tejas.eventManagement.Service.EeventService;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class eventController {

	@RequestMapping(value = "test", method = RequestMethod.GET)
	@ResponseBody
	public String test() {
		return "the controller is hit...!";
	}

	@RequestMapping(value="createEvent",method = RequestMethod.GET)
	public ModelAndView createEvent(ModelAndView mav, Event ev) {

		mav.addObject("Event", ev);

		mav.setViewName("createEvent.jsp");

		return mav;
	}
	
	@Autowired
	EeventService es;
	
	@RequestMapping(value="saveEvent",method = RequestMethod.POST)
	public ModelAndView saveEvent(ModelAndView mav,@ModelAttribute Event ev) {
		mav.addObject("event", ev);
		
		es.saveevent(ev);
		
		mav.setViewName("index.jsp");
		
		return mav;
	}
	
	@RequestMapping(value="showevent" ,method = RequestMethod.GET)
	public ModelAndView showEvent(ModelAndView mav,Event ev) {
		
		mav.addObject("Event", ev);
		
		mav.setViewName("seeAllEvent.jsp");
		
		return mav;
	}
	
	@RequestMapping(value = "DeleteEvent",method = RequestMethod.GET)
	public ModelAndView DeleteEvent(ModelAndView mav,Event ev) {
		mav.setViewName("deleteEvent.jsp");
		return mav;
	}
	
	@RequestMapping(value="deletefromdataBase",method = RequestMethod.POST)
	public ModelAndView deletefromdataBase(ModelAndView mav,HttpServletRequest req) {
		
		int id=Integer.parseInt(req.getParameter("id"));
		
		es.deleteEvent(id);
		
		mav.setViewName("index.jsp");
		
		return mav;
	}
	
}
