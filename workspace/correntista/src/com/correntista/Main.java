package com.correntista;

import java.io.IOException;

import com.correntista.components.JPanelController;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Iniciando app ...");
		System.out.println(System.getProperty("java.class.path"));
		
		JPanelController controller = new JPanelController();
		controller.startApp();
	}

}
