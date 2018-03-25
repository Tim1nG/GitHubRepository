package controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import domain.User;
import service.UserService;

@Controller
@RequestMapping({"/mvc", "/"})
public class UserController {
	@Resource(name = "userService")
	UserService userService;
	
	@RequestMapping("/list")
	public String list(Model model) {
		//ModelAndView mv = new ModelAndView();
		List<User> lists = userService.getUserList();
		model.addAttribute("userLists", lists);
		//model.setViewName("/show");
		return "show";
	}
	
	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}
}
