package demo.springmvc.blog.controller;

/**
 *
 * @author mirai
 */

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import demo.springmvc.blog.domain.Test;
import demo.springmvc.blog.service.TestService;

@Controller
@RequestMapping("/test")
public class TestController {
	private static final Logger logger = LoggerFactory
			.getLogger(TestController.class);

	@Autowired
	private TestService testService;

	@RequestMapping(value = "/{user_name}", method = RequestMethod.GET)
	public String testGet(@PathVariable(value = "user_name") String username,
			Model model) {
		try {
			logger.info(URLDecoder.decode(
					new String(username.getBytes("ISO-8859-1")), "UTF-8"));
			model.addAttribute("name", URLDecoder.decode(
					new String(username.getBytes("ISO-8859-1")), "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		model.addAttribute("object", new Test());
		return "test";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String testCase(Model model) {
		model.addAttribute("object", new Test());
		return "test";
	}
	@RequestMapping(method = RequestMethod.POST)
	public String testPost(@ModelAttribute("object") Test test,
			BindingResult bindingResult, Model model) {
		model.addAttribute("one", test.getOne());
		model.addAttribute("two", test.getTwo());
		logger.info("one = " + test.getOne() + "\ttwo : " + test.getTwo());
		this.testService.createTest(test);
		List<Test> testList = this.testService.getTest();
		model.addAttribute("one",testList.get(0).getOne());
		model.addAttribute("two",testList.get(0).getTwo());		
		return "test";
	}
}
