package th.co.orcsoft.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class HelloWorld {

	@WebMethod
	@WebResult(name = "HelloResponse")
	public HelloResponse helloOrcsoft(@WebParam(name = "HelloRequest") HelloRequest request) {
		HelloResponseHeader header = new HelloResponseHeader();
		header.setStatusCode(0);
		header.setStatusText("SUCCESS");
		
		HelloResponse response = new HelloResponse();
		response.setHelloResponseHeader(header);
		response.setHelloText("Hello, " + request.getName() + " " + request.getSurname());
		return response;
	}

}