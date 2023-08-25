package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final ProductoRepository repositoryP;
	private final VentaRepository repositoryV;
	private final VentaDetalleRepository repositoryVD;
	

	@Autowired
	public DatabaseLoader(
		ProductoRepository repositoryP,
		VentaRepository repositoryV,
		VentaDetalleRepository repositoryVD
		) {
		this.repositoryP = repositoryP;
		this.repositoryV = repositoryV;
		this.repositoryVD = repositoryVD;
	}

	@Override
	public void run(String... strings) throws Exception {

		this.repositoryP.save(new Producto("Arroz", 3.5f ));
		this.repositoryP.save(new Producto("Huevo",9.5f));
		this.repositoryP.save(new Producto("Aceite", 10.9f));
		Producto pJabon = new Producto("Jabon", 5.0f);
		this.repositoryP.save(pJabon);
		Producto pAzucar = new Producto("Azucar", 4.5f);
		this.repositoryP.save(pAzucar);
		

		Venta v905 = new Venta(90.5f);
		this.repositoryV.save(v905);
		Venta v350 = new Venta(30.5f);
		this.repositoryV.save(v350);


		this.repositoryVD.save(new VentaDetalle(pJabon, v905, 10));
		this.repositoryVD.save(new VentaDetalle(pAzucar, v350, 5));

		
	}
}