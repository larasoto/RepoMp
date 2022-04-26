package com.lara.Mperformance;

import com.lara.Mperformance.models.Agenda;
import com.lara.Mperformance.models.Service;
import com.lara.Mperformance.repositories.AgendaRepositorio;
import com.lara.Mperformance.repositories.ServiceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class MperformanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MperformanceApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(ServiceRepository serviceRepository, AgendaRepositorio agendaRepositorio ) {
		return (args) -> {

			Service washed = new Service("Lavado",2000.,"../img/motoLavada.png");
			Service cleaning = new Service("Lavado interior",8000.,"../img/limpezaInterior.png");
			Service treatment = new Service("Pulido",40000.,"../img/pulido.png");

			serviceRepository.save(washed);
			serviceRepository.save(cleaning);
			serviceRepository.save(treatment);

			Agenda agenda = new Agenda("12-07-2022",washed);
			Agenda agenda1 = new Agenda("12-04-2022",washed);
			Agenda agenda2 = new Agenda("12-08-2022",washed);
			Agenda agenda3 = new Agenda("12-03-2022",washed);
			Agenda agenda4 = new Agenda("12-09-2022",washed);
			Agenda agenda5 = new Agenda("12-04-2022",washed);
			Agenda agenda6 = new Agenda("13-09-2022",washed);

			//Client client = new Client("milton","pereira","pereiramilton31@gmail.com","31072019");



		};
	}};