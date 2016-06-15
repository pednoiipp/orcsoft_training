package th.co.orcsoft.services;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class Main {

	public static void main(String[] args) {
		try {

			URL endpointUrl = new URL("http://localhost:8080/HelloServices/HelloWorld");

			HelloRequest request = new HelloRequest();
			request.setName("Orcsoft");
			request.setSurname("Ten Years");

			HelloWorldServiceLocator locator = new HelloWorldServiceLocator();
			HelloWorld port = locator.getHelloWorldPort(endpointUrl);
			HelloResponse response = port.helloOrcsoft(request);

			HelloResponseHeader responseHeader = response.getHelloResponseHeader();
			int statusCode = (responseHeader == null) ? 99999 : responseHeader.getStatusCode();
			String statusText = (responseHeader == null) ? "" : responseHeader.getStatusText();

			System.out.println("StatusCode: " + statusCode);
			System.out.println("StatusText: " + statusText);
			System.out.println("HelloText: " + response.getHelloText());

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
