package bao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FindMaxNumberController {
@RequestMapping("/fmn")
public String fmn()
{
return "findmaxnumber";	
}
@RequestMapping("/fmnlogic")
public ModelAndView fmnlogic(HttpServletRequest request,HttpServletResponse response)
{
	int a=Integer.parseInt(request.getParameter("txta"));
	int b=Integer.parseInt(request.getParameter("txtb"));
	int c=Integer.parseInt(request.getParameter("txtc"));
	if(a>b && a>c)
	{
		return new ModelAndView("findmaxnumber","key","a is greatest "+a);
	}
	if(b>a && b>c)
	{
		return new ModelAndView("findmaxnumber","key","b is greatest "+b);
	}
	if(c>a && c>b)
	{
		return new ModelAndView("findmaxnumber","key","c is greatest "+c);
	}
	return new ModelAndView("findmaxnumber","key","put correct value");
}
}
