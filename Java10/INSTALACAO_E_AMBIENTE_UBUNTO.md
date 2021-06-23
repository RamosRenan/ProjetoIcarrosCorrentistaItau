##### INSTALAÇÃO DO AMBIENTE UBUNTO 20 :rowing_man:

	###### 	INSTALANDO O JAVA 10
	
	<!-- adiciona repositorio, pois é comum que o repositorio default do apt 		  não contenha o java 10 -->
	
	$ sudo add-apt-repository ppa:linuxuprising/java
	
	$ sudo apt update
	
	$ sudo apt install oracle-java10-installer
	
	$ java --version



##### FERRAMENTAS DE BUILD

	###### 	<!-- GRADLE ferramenta poderosa que permiti o build das aplicações java de forma mais performática e fácil injeção de dependências e libs Java-->	
	
	###### 	GRADLE
	
	https://gradle.org/
	
	https://gradle.org/install/

 - versão 4.7
 - ganhando espaço no android
 - utiliza linguagem Groovy

   $ mkdir /opt/gradle

	$ cd Global\Labs\Academy

	$ sudo unzip /caminho_do_arquivo_zip/gradle gradle-4.7-bin.zip -d /opt/gradle/

	$ ls /opt/gradle/gradle-4.7

	$ export PATH=PATH:/opt/gradle/gradle-4.7/bin

	$ sudo apt purge gradle  // old version

	$ gradle -v



##### MAVEN

	https://maven.apache.org

 - version 3.5.3
 - Legados do ANT
 - Baseado em XML



	$ unzip -d /opt/maven apache-maven-3.5.3-bin.zip
	
	$ ls /opt/maven/apache-maven-3.5.3
	
	$ sudo apt purge maven // old version
	
	$ export PATH=PATH:/opt/maven/apache-maven-3.5.3/bin



	$ mvn -v







​	