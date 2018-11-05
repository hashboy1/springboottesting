package springbootdemo.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages={"springbootdemo.controller","springbootdemo.service","springbootdemo.dao"})
public class BootApplication implements CommandLineRunner{

	
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
          SpringApplication.run(BootApplication.class, args);
	}
	
	
	public void run (String... arg0) throws Exception
	{
		System.out.println();
	}

}
