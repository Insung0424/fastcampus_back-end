package aa.bb.sol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import aa.bb.sol.beans.Member;
import aa.bb.sol.beans.dt;

@Controller
public class mainController {
	
	@GetMapping("/main1")
	public ModelAndView m1() {
		ModelAndView mv = new ModelAndView();
		dt d1 = new dt();
		d1.setM("main1");
		dt d2 = new dt();
		d2.setM("main2");
		mv.addObject("m1", d1);
		mv.addObject("m2", d2);
		mv.setViewName("main1");
		return mv;
	}
	
	@GetMapping("/login")
	public String l(Member member,Model model) {
		System.out.println("ok");
		model.addAttribute("mem",member);
		return "login";
	}
//	@GetMapping("/log")
//	public String log(@RequestParam String id,
//			@RequestParam String pw,Model model) {
//		Member member = new Member();
//		member.setId(id);
//		member.setPw(pw);
//		model.addAttribute("member",member);
//		return "confirm";
//	}
	@PostMapping("/log")
	public String log() {
		System.out.println("good");
		return "forward:/confirm";
	}
	@PostMapping("/confirm")
	public String con(@ModelAttribute("mem") Member member) {
		System.out.println("fine");
		System.out.println(member.getId());
		System.out.println(member.getPw());
		return "confirm";
	}
	
}
