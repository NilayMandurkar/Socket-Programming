import java.util.*;
import java.net.*;

public class program1{
public static void main(String[] args){
	try{
		InetAddress address=InetAddress.getLocalHost();
		System.out.println("Hostname: "+address.getHostName());
		System.out.println("IP Address: "+address.getHostAddress());
	}
	catch(UnknownHostException e){
	System.out.println("Couldn't find system address");
}
}
}
