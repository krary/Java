package misapp;

import java.io.IOException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class jfg{
 
public static void main(String[]args) throws URISyntaxException, IOException{
	//URI uri=new URI("http://google.com");
	//Desktop.getDesktop().browse(uri);
	//Desktop.getDesktop().open(new File("C://"));
	//
	//Runtime.getRuntime().exec("cmd/C:\\");
	String pattern="yy-dd-MM";
	SimpleDateFormat c=new SimpleDateFormat(pattern);
	String fecha=c.format(new Date());
	System.out.println(fecha);
}}