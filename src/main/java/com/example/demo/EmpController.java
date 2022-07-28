package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {
	@Autowired EmpMapper dao;
	
	@RequestMapping("/empList")
	public String empList(Model model) {
		model.addAttribute("empList", dao.getEmpList(null));
		return "empList"; }
	
	
	@RequestMapping("/test")
	public String test(Model model) {
		model.addAttribute("str1", "<u>test</u>");
		return "test";
	}
	
	@GetMapping("empInsert")
	public String empIsertform(Model model) {
		model.addAttribute("dept", dao.getDepartments(null));
		model.addAttribute("job", dao.getDepartments(null));
		return "empInsert";
	}
	
	@ModelAttribute("job")
	public List<JobVO> getJobs(){
		return dao.getJobs();
	}
	@ModelAttribute("dept")
	public List<JobVO> getDepartments(){
		return dao.getDepartments(null);
	}
	// 수정페이지
	@GetMapping("/empUpdate")
	public String empUpdateModel(Model model, EmpVO vo) {
		model.addAttribute("emp", dao.getEmp(vo));
		return "empUpdate";
	}
}