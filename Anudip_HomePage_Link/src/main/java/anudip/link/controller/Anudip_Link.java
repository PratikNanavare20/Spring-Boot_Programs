package anudip.link.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//RestController annotation is used to create RESTful web services using Spring MVC
@RestController
public class Anudip_Link 
{
	//http://localhost:8080/link
	//RequestMapping annotation is used to map web requests onto specific handler classes and/or handler methods. 
	@RequestMapping("/link")
	public String link()
	{
		return "<body bgcolor='Pink', text='Blue'><center><h1>-------: Anudip Foundation :-------</h1></center>\"\r\n"
				+"<center><h2>******** Home Page Link *******</h2></center>\"\r\n"
				+"<center><h3><a href=https:aln.anudip.org style='color:red'>https:aln.anudip.org</a></h3></center></body>";
	}
}
