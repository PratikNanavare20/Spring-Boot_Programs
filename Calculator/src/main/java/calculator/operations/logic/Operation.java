package calculator.operations.logic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//RestController annotation is used to create RESTful web services using Spring MVC
@RestController
public class Operation 
{
/****************************************** Addition *********************************************************************/
	
	//http://localhost:8080/add
	//RequestMapping annotation is used to map web requests onto specific handler classes and/or handler methods. 
	@RequestMapping("/add")
	public String Addition(@RequestParam(name="num1", required=true, defaultValue="15") int num1,
							@RequestParam(name="num2", required=true, defaultValue="10") int num2)
	{
		int ans = num1 + num2;
		return "<body bgcolor='orange' text='black'>"
					+ "<center><h1>Addition is :- "+ans+"</h1></center>"
			+ "</body>";
	}
	
	
/****************************************** Subtraction *********************************************************************/
	
	//http://localhost:8080/sub
	@RequestMapping("/sub")
	public String Subtraction(@RequestParam(name="num1", required=true, defaultValue="15") int num1,
							@RequestParam(name="num2", required=true, defaultValue="10") int num2)
	{
		int ans = num1 - num2;
		return "<body bgcolor='orange' text='black'>"
					+ "<center><h1>Subtraction is :- "+ans+"</h1></center>"
				+ "</body>";
	}

	
/****************************************** Multiplication *********************************************************************/
	
	//http://localhost:8080/mul
	@RequestMapping("/mul")
	public String Multiplication(@RequestParam(name="num1", required=true, defaultValue="15") int num1,
							@RequestParam(name="num2", required=true, defaultValue="10") int num2)
	{
		int ans = num1 * num2;
		return "<body bgcolor='orange' text='black'>"
					+ "<center><h1>Multiplication is :- "+ans+"</h1></center>"
				+ "</body>";
	}

	
/****************************************** Division *********************************************************************/
	
	//http://localhost:8080/div
	@RequestMapping("/div")
	public String Division(@RequestParam(name="num1", required=true, defaultValue="200") int num1,
							@RequestParam(name="num2", required=true, defaultValue="10") int num2)
	{
		int ans = num1 / num2;
		return "<body bgcolor='orange' text='black'>"
					+ "<center><h1>Division is :- "+ans+"</h1></center>"
			+ "</body>";
	}
	
/****************************************** Module *********************************************************************/
	
	//http://localhost:8080/mod
	@RequestMapping("/mod")
	public String Module(@RequestParam(name="num1", required=true, defaultValue="25") int num1,
							@RequestParam(name="num2", required=true, defaultValue="10") int num2)
	{
		int ans = num1 % num2;
		return "<body bgcolor='orange' text='black'>"
					+ "<center><h1>Module is :- "+ans+"</h1></center>"
				+ "</body>";
	}

}
