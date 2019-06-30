package demo.springmvc.blog.controller;

/**
 *
 * @author mirai
 */

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/about")
public class About {
	@RequestMapping( method = RequestMethod.GET)
	public String about( HttpServletRequest request ){
		request.getSession().setAttribute("loggedInUser", null);
		return "about";
	}
}
