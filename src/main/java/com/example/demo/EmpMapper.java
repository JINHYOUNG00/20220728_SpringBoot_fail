package com.example.demo;

import java.util.List;

public interface EmpMapper {
	public EmpVO getEmp(EmpVO empVO);
	public List<EmpVO> getEmpList(EmpReqVO vo);
	public void insertEmp(EmpVO vo);
	public void updateEmp(EmpVO vo);
	public void deleteEmp(EmpVO vo);
	public List<JobVO> getDepartments(EmpVO vo);
	public List<JobVO> getJobs();
}
