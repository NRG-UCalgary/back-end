package ca.ucalgary.cpsc.nrg.nrgplatform.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

	@GetMapping("/iot")
	public Object forwardToIot() {

		return null;
	}
	
	@GetMapping("/ns")
	public Object forwardToNs() {

		return null;
	}
	
	

}
