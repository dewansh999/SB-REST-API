package in.expedia.rest;



@RestController
public class MsgRestController {
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String msg = "Welcome to REST API..!!";
		return msg;
	}
    @GetMapping("/greet")
	public String getGreetMsg(@RequestParam("name") String name) {
		String msg = name + ", Good Morning...!!";
		return msg;
	}
	

}
